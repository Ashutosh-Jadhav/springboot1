package hackers.course_selection.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StudentNotFoundException extends RuntimeException {
    private final String msg;
}
