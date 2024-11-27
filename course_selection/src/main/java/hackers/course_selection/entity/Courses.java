package hackers.course_selection.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")

public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;

    @Column(name = "course_code",nullable = false,unique = true)
    private String courseCode;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "year",nullable = false)
    private int year;

    @Column(name = "term",nullable = false)
    private int term;

    @Column(name = "faculty",nullable = false)
    private String faculty;

    @Column(name = "credits")
    private int credits;

    @Column(name = "capacity")
    private int capacity;
}
