public class Student {
    private String name = "Hikki";
    private String classes = "C02";
    public static int count;

    public Student() {
    }
    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
        count++;
    }
    protected void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    String getClasses() {
        return classes;
    }
}
