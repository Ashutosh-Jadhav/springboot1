package hackers.course_selection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public record courseRequest(
        @NotNull(message = "Course code is required")
        @NotEmpty(message = "Course code cannot be empty")
        @NotBlank(message = "Course code cannot be blank")
        @JsonProperty("course_code")
        String courseCode,

        @NotNull(message = "Course name is required")
        @NotEmpty(message = "Course name cannot be empty")
        @NotBlank(message = "Course name cannot be blank")
        @JsonProperty("name")
        String name,

        @JsonProperty("description")
        String description,

        @NotNull(message = "Year is required")
        @Min(value = 1, message = "Year must be a positive integer")
        @JsonProperty("year")
        int year,

        @NotNull(message = "Term is required")
        @Min(value = 1, message = "Term must be a positive integer")
        @JsonProperty("term")
        int term,

        @NotNull(message = "Faculty name is required")
        @NotEmpty(message = "Faculty name cannot be empty")
        @NotBlank(message = "Faculty name cannot be blank")
        @JsonProperty("faculty")
        String faculty,


        @JsonProperty("credits")
        int credits,


        @JsonProperty("capacity")
        int capacity
) {
}
