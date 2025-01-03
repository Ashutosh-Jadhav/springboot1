package hackers.course_selection.repo;

import hackers.course_selection.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long>{
    Optional<Student> findByEmail(String email);
}
