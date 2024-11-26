package hackers.course_selection.service;

import hackers.course_selection.dto.StudentRequest ;
import hackers.course_selection.dto.loginRequest;

import hackers.course_selection.entity.Student ;
import hackers.course_selection.mapper.StudentMapper ;
import hackers.course_selection.repo.StudentRepo ;
import lombok.RequiredArgsConstructor ;
import org.springframework.stereotype.Service;
import hackers.course_selection.helper.JWTHelper;
import hackers.course_selection.helper.EncryptionService;
import hackers.course_selection.exception.StudentNotFoundException;




import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo repo;
    private final StudentMapper mapper;
    private final EncryptionService encryptionService;
    private final JWTHelper jwtHelper;
    public String createStudent(StudentRequest request) {
        Student student = mapper.toEntity(request);

        student.setPassword(encryptionService.encode(student.getPassword()));

        repo.save(student);
        return "Student created";
    }

    public Student getStudent(String email) {
        return repo.findByEmail(email)
                .orElseThrow(() -> new StudentNotFoundException(
                        format("Cannot update Student:: No student found with the provided ID:: %s", email)
                ));
    }



    public String login(loginRequest request) {
        Student student = getStudent(request.email());
        if(!encryptionService.validates(request.password(), student.getPassword()))
        {
            return "Not Logged in";
        }
        return jwtHelper.generateToken(request.email());
    }
}
