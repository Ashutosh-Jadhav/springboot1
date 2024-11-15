package hackers.demo.controller;

import hackers.demo.dto.loginRequest;
import hackers.demo.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<String> login(@RequestBody @Valid loginRequest request){
        return ResponseEntity.ok(customerService.login(request));
    }
}
