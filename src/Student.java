import java.util.Arrays;
import java.util.Comparator;

public class Student {
    
    int age;
    String name;
    int group;
    int[] marks = new int[5];
    public Student(int age, String name, int group, int[] marks) {
        this.age = age;
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    
    @Override
    public String toString() {
        return "Student [age=" + age + ", group=" + group + ", marks=" + Arrays.toString(marks) + ", name=" + name
                + "]";
    }


    double averageValue(){
        return (marks[0] + marks[1] + marks[2] + marks[3]+marks[4])/5.0;
    }

    
    
     
    
    
}
