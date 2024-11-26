package hackers.course_selection.controller;

import hackers.course_selection.dto.loginRequest;
import hackers.course_selection.service.StudentService;
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
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<String> login(@RequestBody @Valid loginRequest request){
        return ResponseEntity.ok(studentService.login(request));
    }
}
