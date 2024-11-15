package hackers.demo.service;

import hackers.demo.dto.CustomerRequest ;
import hackers.demo.dto.loginRequest;
import hackers.demo.entity.Customer ;
import hackers.demo.exception.CustomerNotFoundException;
import hackers.demo.mapper.CustomerMapper ;
import hackers.demo.repo.CustomerRepo ;
import lombok.RequiredArgsConstructor ;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo repo ;
    private final CustomerMapper mapper ;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
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
        if(customer.getEmail().equals(request.email()))
        {
            return "Logged in";
        }
        return "Not logged in";
    }

}
