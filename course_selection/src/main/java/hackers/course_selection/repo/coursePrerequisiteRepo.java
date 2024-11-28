package hackers.course_selection.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import hackers.course_selection.entity.coursePrerequisite;

import java.util.Optional;


public interface coursePrerequisiteRepo extends JpaRepository<coursePrerequisite,Long> {

    Optional<coursePrerequisite> findById(int Id);

}
