package hackers.course_selection.mapper;

import hackers.course_selection.dto.studentCourseRequest;
import hackers.course_selection.entity.studentCourses;
import hackers.course_selection.entity.Student;
import hackers.course_selection.entity.Courses;
import org.springframework.stereotype.Service;

@Service
public class studentCoursesMapper {
    public studentCourses toEntity(studentCourseRequest request, Student student, Courses course) {
        return studentCourses.builder()
                .student_id(student)
                .courseId(course)
                .gradeId(request.gradeId())
                .comments(request.comments())
                .build();
    }
}
