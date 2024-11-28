package hackers.course_selection.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import hackers.course_selection.entity.Courses;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.List;

@Repository
public interface CoursesRepo extends JpaRepository<Courses,Long> {
    Optional<Courses> findByCourseCode(String courseCode);
    List<Courses> findByYearAndTerm(int year, int term);

    @Query(value = "SELECT * FROM courses WHERE course_id in (select course_id from student_courses where student_id = :studentId)", nativeQuery = true)
    List<Courses> findCoursesByStudentId(@Param("studentId") Long studentId);

}
