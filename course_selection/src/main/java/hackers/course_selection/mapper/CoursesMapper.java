package hackers.course_selection.mapper;

import hackers.course_selection.dto.courseRequest;
import hackers.course_selection.entity.Courses;
import org.springframework.stereotype.Service;

@Service
public class CoursesMapper {
    public Courses toEntity(courseRequest request) {
        return Courses.builder()
                .courseCode(request.courseCode())
                .name(request.name())
                .description(request.description())
                .year(request.year())
                .term(request.term())
                .faculty(request.faculty())
                .credits(request.credits())
                .capacity(request.capacity())
                .build();
    }
}

