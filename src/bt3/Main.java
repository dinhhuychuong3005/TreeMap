package bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT");
        Student student3 = new Student("Tung", 38, "HT");
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Collections.sort(students);
        for (Student student4 : students){
            System.out.println(student4.toString());
        }
        System.out.println("==================");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(students,ageComparator);
        for (Student st : students){
            System.out.println(st.toString());
        }
    }
}
