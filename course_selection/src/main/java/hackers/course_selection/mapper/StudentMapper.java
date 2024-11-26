package hackers.course_selection.mapper;


import hackers.course_selection.dto.StudentRequest;
import hackers.course_selection.entity.Student ;
import org.springframework.stereotype.Service ;

@Service
public class StudentMapper {
    public Student toEntity(StudentRequest request){
        return Student.builder()
                .rollNumber(request.rollNumber())
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .photographPath(request.photographPath())
                .cgpa(request.cgpa())
                .totalCredits(request.totalCredits())
                .graduationYear(request.graduationYear())
                .build();
    }
}
