package hackers.course_selection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record coursePrerequisiteRequest(
        @JsonProperty("description")
        String description
) {
}

