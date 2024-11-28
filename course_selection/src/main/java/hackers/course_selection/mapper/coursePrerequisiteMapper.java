package hackers.course_selection.mapper;

import hackers.course_selection.dto.coursePrerequisiteRequest;
import hackers.course_selection.entity.coursePrerequisite;
import hackers.course_selection.entity.Courses;
import org.springframework.stereotype.Service;

@Service
public class coursePrerequisiteMapper {
    public coursePrerequisite toEntity(coursePrerequisiteRequest request, Courses course, Courses prerequisite) {
        return coursePrerequisite.builder()
                .courseId(course)
                .prerequisite(prerequisite)
                .description(request.description())
                .build();
    }
}
