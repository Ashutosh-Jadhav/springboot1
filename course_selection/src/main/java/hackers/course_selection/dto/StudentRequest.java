package hackers.course_selection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public record StudentRequest(
        @NotNull(message = "Student should be present")
        @NotEmpty(message = "Student should be present")
        @NotBlank(message = "Student should be present")
        @JsonProperty("first_name")
        String firstName,

        @NotNull(message = "Roll No. should be present")
        @NotEmpty(message = "Roll No. should be present")
        @NotBlank(message = "Roll No. should be present")
        @JsonProperty("roll_number")
        String rollNumber,

        @JsonProperty("last_name")
        String lastName,

        @NotNull(message="Student email is required")
        @Email(message = "Email must be in correct format")
        @JsonProperty("email")
        String email,

        @NotNull(message = "Password should be present")
        @NotEmpty(message = "Password should be present")
        @NotBlank(message = "Password should be present")
        @Size(min = 6, max = 12)
        @JsonProperty("password")
        String password,

        @JsonProperty("photograph_path")
        String photographPath,

        @JsonProperty("cgpa")
        int cgpa,

        @JsonProperty("total_credits")
        int totalCredits,

        @JsonProperty("graduation_year")
        int graduationYear
) {
}
