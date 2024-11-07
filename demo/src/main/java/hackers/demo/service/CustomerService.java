package hackers.demo.service;

import hackers.demo.dto.CustomerRequest ;
import hackers.demo.dto.CustomerResponse ;
import hackers.demo.entity.Customer ;
import hackers.demo.mapper.CustomerMapper ;
import hackers.demo.repo.CustomerRepo ;
import jakarta.validation.Valid ;
import lombok.RequiredArgsConstructor ;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
}
