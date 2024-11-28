package hackers.course_selection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public record studentCourseRequest(
        @NotNull(message = "Grade ID is required")
        @NotEmpty(message = "Grade ID cannot be empty")
        @NotBlank(message = "Grade ID cannot be blank")
        @JsonProperty("grade_id")
        String gradeId,

        @JsonProperty("comments")
        String comments
) {
}

