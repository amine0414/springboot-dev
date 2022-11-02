package Com.Demo.SpringBoot;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student("amine","amine.kmn@gmail.com",11L));
    }
}
