package Com.Demo.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Api/V1")
public class StudentController {
  private final StudentService studentService;

@Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
@GetMapping("/Welcome")

public String Hello( ){
    return "Hello Containers";
}
    @RequestMapping("/students")
    public List<Student> getAll(){
     return studentService.getStudents();
    }

}
