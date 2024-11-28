package hackers.course_selection.repo;

import hackers.course_selection.entity.studentCourses;
import hackers.course_selection.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
@Repository
public interface studentCoursesRepo extends JpaRepository<studentCourses, Long> {

    // Find all courses a student is enrolled in
//
//    @Query(value = "SELECT sc.course_id FROM student_courses sc WHERE sc.student_id = :studentId", nativeQuery = true)
//    List<Courses> findCoursesByStudentId(@Param("studentId") Long studentId);

    @Query(value = "SELECT * FROM courses WHERE course_id in (select course_id from student_courses where student_id = :studentId)", nativeQuery = true)
    List<Courses> findCoursesByStudentId(@Param("studentId") Long studentId);


    // Custom query to find courses by year and term
    @Query("SELECT c FROM Courses c WHERE c.year = :year AND c.term = :term")
    List<studentCourses> findByYearAndTerm(@Param("year") int year, @Param("term") int term);
}
