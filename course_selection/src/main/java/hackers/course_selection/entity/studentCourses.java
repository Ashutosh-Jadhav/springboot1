package hackers.course_selection.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_courses")

public class studentCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student_id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses courseId;

    @Column(name = "grade_id")
    private String gradeId;

    @Column(name = "comments")
    private String comments;
}
