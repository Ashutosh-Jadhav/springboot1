package hackers.course_selection.controller;

import hackers.course_selection.dto.studentCourseRequest;
import hackers.course_selection.entity.Courses;
import hackers.course_selection.entity.coursePrerequisite;
import hackers.course_selection.entity.Student;
import hackers.course_selection.entity.studentCourses;
import hackers.course_selection.mapper.CoursesMapper;
import hackers.course_selection.mapper.coursePrerequisiteMapper;
import hackers.course_selection.mapper.studentCoursesMapper;
import hackers.course_selection.service.StudentCoursesService;
import hackers.course_selection.service.StudentService;
import hackers.course_selection.service.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseSelectionController {

    private final CourseService courseService;
    private final StudentService studentService;
    private final StudentCoursesService studentCoursesService;
    private final CoursesMapper coursesMapper;
    private final studentCoursesMapper studentCoursesMapper;
    private final coursePrerequisiteMapper coursePrerequisiteMapper;



    // Get all courses
    @GetMapping
    public ResponseEntity<List<Courses>> getAllCourses() {
        List<Courses> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }

    // Get a course by ID
    @GetMapping("/{courseId}")
    public ResponseEntity<Courses> getCourseById(@PathVariable Long courseId) {
        Courses course = courseService.getCourseById(courseId);
        if (course != null) {
            return ResponseEntity.ok(course);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/{studentId}/courses")
    public ResponseEntity<List<Courses>> getStudentCourses(@PathVariable Long studentId) {
        List<Courses> courses = courseService.getCoursesByStudentId(studentId);
        return ResponseEntity.ok(courses);
    }


    // Enroll a student in a course
//    @PostMapping("/enroll/{studentId}/{courseId}")
//    public ResponseEntity<studentCourses> enrollStudentInCourse(
//            @PathVariable Long studentId,
//            @PathVariable Long courseId,
//            @Valid @RequestBody studentCourseRequest studentCourseRequest
//    ) {
//        Student student = studentService.getStudentById(student_id);
//        Courses course = courseService.getCourseById(courseId);
//
//        if (student == null || course == null) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//
//        studentCourses studentCourses = studentCoursesMapper.toEntity(studentCourseRequest, student, course);
//        studentCourses savedEnrollment = studentCoursesService.saveStudentCourseEnrollment(studentCourses);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedEnrollment);
//    }

    // Get all courses selected by a student
//    @GetMapping("/student/{studentId}")
//    public ResponseEntity<List<Courses>> getCoursesByStudentId(@PathVariable Long studentId) {
//        Student student = studentService.getStudentById(studentId);
//        if (student == null) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        List<Courses> enrolledCourses = studentCoursesService.getCoursesByStudent(student);
//        return ResponseEntity.ok(enrolledCourses);
//    }

    // Fetch courses by year and term
    @GetMapping("/year/{year}/term/{term}")
    public ResponseEntity<List<Courses>> getCoursesByYearAndTerm(
            @PathVariable int year,
            @PathVariable int term) {
        List<Courses> courses = courseService.getCoursesByYearAndTerm(year, term);
        if (courses.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(courses);
    }

//    @PostMapping("/{studentId}/select")
//    public ResponseEntity<String> selectCourse(
//            @PathVariable Long studentId,
//            @RequestBody List<Long> courseIds) {
//        boolean success = studentCoursesService.enrollStudentInCourses(studentId, courseIds);
//        if (success) {
//            return ResponseEntity.ok("Courses selected successfully!");
//        } else {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to select courses.");
//        }
//    }


}
