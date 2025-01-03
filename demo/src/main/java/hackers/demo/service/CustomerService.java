package hackers.demo.service;

import hackers.demo.dto.CustomerRequest ;
import hackers.demo.dto.loginRequest;
import hackers.demo.entity.Customer ;
import hackers.demo.exception.CustomerNotFoundException;
import hackers.demo.mapper.CustomerMapper ;
import hackers.demo.repo.CustomerRepo ;
import lombok.RequiredArgsConstructor ;
import org.springframework.stereotype.Service;
import hackers.demo.helper.EncryptionService;
import hackers.demo.helper.JWTHelper;

import java.util.Optional;
import java.util.UUID ;
import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo repo ;
    private final CustomerMapper mapper ;
    private final EncryptionService encryptionService;
    private final JWTHelper jwtHelper;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        customer.setPassword(encryptionService.encode(customer.getPassword()));
        repo.save(customer);
        return "Created";
    }

    public Customer getCustomer(String email) {
        return repo.findByEmail(email)
                .orElseThrow(() -> new CustomerNotFoundException(
                        format("Cannot update Customer:: No customer found with the provided ID:: %s", email)
                ));
    }



    public String login(loginRequest request) {
        Customer customer = getCustomer(request.email());
        if(!encryptionService.validates(request.password(), customer.getPassword()))
        {
            return "Not Logged in";
        }
        return jwtHelper.generateToken(request.email());
    }

}
