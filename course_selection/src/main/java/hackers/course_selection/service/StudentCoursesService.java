package hackers.course_selection.service;

import hackers.course_selection.entity.Student;
import hackers.course_selection.entity.Courses;
import hackers.course_selection.entity.studentCourses;
import hackers.course_selection.repo.studentCoursesRepo;
import hackers.course_selection.repo.StudentRepo;
import hackers.course_selection.repo.CoursesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentCoursesService {

    // Final repository field, constructor will be generated by @RequiredArgsConstructor
    private final studentCoursesRepo studentCoursesRepository;
    private final StudentRepo studentRepository;
    private final CoursesRepo coursesRepository;

//    // Get all courses a student is enrolled in
//    public List<Courses> getCoursesByStudentId(Long studentId) {
//        return studentCoursesRepository.findCoursesByStudentId(studentId);
//    }



    // Enroll a student in a course (save StudentCourses entity)
    public studentCourses enrollStudentInCourse(Student student, Courses course, String gradeId, String comments) {
        studentCourses studentCourses = new studentCourses();
        studentCourses.setCourseId(course);
        studentCourses.setGradeId(gradeId);
        studentCourses.setComments(comments);
        return studentCoursesRepository.save(studentCourses);
    }

//    // Check if the student is already enrolled in a specific course
//    public Optional<studentCourses> getEnrollment(Student student, Courses course) {
//        return studentCoursesRepository.findByStudentAndCourseId(student, course);
//    }




}
