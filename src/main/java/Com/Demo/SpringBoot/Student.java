package Com.Demo.SpringBoot;

public class Student {
    private String name;
    private String email;
    private Long id;

    public Student(){

    }
    public Student(String name,String email,Long id){
    this.email=email;
    this.id=id;
    this.name=name;

    }
    public Student(String name,String email){
        this.email=email;

        this.name=name;

    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }

}
