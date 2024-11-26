package hackers.course_selection.service;

import hackers.course_selection.dto.StudentRequest ;
import hackers.course_selection.entity.Student ;
import hackers.course_selection.mapper.StudentMapper ;
import hackers.course_selection.repo.StudentRepo ;
import lombok.RequiredArgsConstructor ;
import org.springframework.stereotype.Service;


import java.util.Optional;
import java.util.UUID ;
import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo repo;
    private final StudentMapper mapper;
    public String createStudent(StudentRequest request) {
        Student student = mapper.toEntity(request);
        repo.save(student);
        return "Student created";
    }
}
