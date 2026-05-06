package tp3;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Sara", 20, 14.5);
        
        System.out.println(student.toString());
        System.out.println("Passed: " + student.isPassed());
    }
}