//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student stu1 =new Student("Mikki","C04");
        Student stu2 =new Student("ろく","C06");
        Student stu3 = new Student();

        stu1.setName("Mikkssas");
        stu2.setName("ROku");
        System.out.println(stu1.getName() + " " + stu2.getName() + " " + stu3.getName() + " " + Student.count);

    }
}