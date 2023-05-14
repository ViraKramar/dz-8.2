public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Alex");
        student1.setSurname("Black");

        Student student2 = new Student();
        student2.setName("Darya");
        student2.setSurname("Funny");


        StudentsGroup firstGroup = new StudentsGroup();
        firstGroup.addStudent(student1);
        firstGroup.addStudent(student2);
        firstGroup.changeCaptain(student2);

        firstGroup.removeStudent(student2);

        firstGroup.renameStudent(student1, "Max", "Summer");
        System.out.println(student1.getName() + " " + student1.getSurname());

        firstGroup.addTask("First task");
        firstGroup.addTask("Second task");
        firstGroup.addTask("Have some rest");
    }
}