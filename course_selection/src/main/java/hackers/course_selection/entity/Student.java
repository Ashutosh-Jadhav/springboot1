package hackers.course_selection.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long student_id;

    @Column(name = "roll_number",nullable = false,unique = true)
    private String rollNumber;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "photograph_path")
    private String photographPath;

    @Column(name = "cgpa")
    private int cgpa;

    @Column(name = "total_credits")
    private int totalCredits;

    @Column(name = "graduation_year")
    private int graduationYear;
}
