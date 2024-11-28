package hackers.course_selection.service;

import hackers.course_selection.entity.Courses;
import hackers.course_selection.repo.CoursesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor ;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CoursesRepo coursesRepository;


    public List<Courses> getAllCourses() {
        return coursesRepository.findAll();
    }

    public Courses getCourseById(Long courseId) {
        return coursesRepository.findById(courseId).orElse(null);
    }

    public List<Courses> getCoursesByYearAndTerm(int year, int term) {
        return coursesRepository.findByYearAndTerm(year, term);
    }

    // Get all courses a student is enrolled in
    public List<Courses> getCoursesByStudentId(Long studentId) {
        return coursesRepository.findCoursesByStudentId(studentId);
    }

}
