package hackers.course_selection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public class courseRequest (
    @NotNull(message = "Year is required")
    @JsonProperty("year")
    int year,

    @NotNull(message="Term should be present")
    @NotEmpty(message = "Term should be present")
    @NotBlank(message = "Term should be present")
    @JsonProperty("term")
    String term
}
