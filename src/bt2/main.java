package bt2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam","HN", 5);
        Student student2 = new Student("Chuong","ND", 27);
        Student student3 = new Student("Khoai","ND", 2);
        Map<Integer,Student> map = new HashMap<>();
        map.put(1,student1);
        map.put(2,student2);
        map.put(3,student3);
        for (Map.Entry<Integer, Student> entry : map.entrySet()){
            System.out.println(entry.toString());
        }
        System.out.println("=====================");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
