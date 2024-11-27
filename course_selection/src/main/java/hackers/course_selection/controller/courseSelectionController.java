package hackers.course_selection.controller;

import hackers.course_selection.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import hackers.course_selection.entity.Courses;
import hackers.course_selection.dto.courseRequest;

@RestController
@RequestMapping("/api/v1/selectCourse")
@RequiredArgsConstructor
public class courseSelectionController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<Courses> (@RequestBody @Valid courseRequest request){
        return ResponseEntity.ok(studentService.courseSelect(request));
    }

}
