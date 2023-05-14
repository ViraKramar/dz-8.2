import java.util.ArrayList;
import java.util.List;
public class StudentsGroup {
    private static Student captain;

    List<Student> students = new ArrayList<>();
    static List<String>  tasks = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void addTask(String task){

        tasks.add(task);
    }
    public void removeStudent(Student student){
        if(student != captain){
            students.remove(student);
            System.out.println("Student has been removed successfully");}
        else {
            System.out.println("You cannot remove captain");
        }
    }
    public void renameStudent(Student student, String name, String surname){
        student.setName(name);
        student.setSurname(surname);
    }
    public Student changeCaptain(Student student){
        captain = student;
        System.out.println("This Group Captain is " + captain.getName() + " " + captain.getSurname());
        return captain;
    }
}

