import java.util.Arrays;

public class Main {
public static void main(String[] args){

    Student[] students = {
        new Student(18, "Zhenka" , 145,new int[] {5,4,4,5,5}),
        new Student(17, "Andreyka" , 315 ,new int[] {2,5,3,4,4}),
        new Student(16, "Nikitka" , 45 ,new int[] {4,4,4,4,4}),
        new Student(15, "Antoha" , 15 ,new int[] {4,5,4,5,4}),
        new Student(14, "Slavka" , 23 ,new int[] {1,5,1,1,1}),
        

    };
    System.out.println("Начальный порядок средних значений");
    for (int i = 0; i < students.length; i++){
        students[i].averageValue();
        System.out.println( students[i].averageValue());
    }//Добавляем средние значения стужентам

    for (int i = 0; i < 5; i++){
        for (int j = 0 ; j< 5; j++){
            if (Arrays.asList(students[i].marks[j]).contains(1)||Arrays.asList(students[i].marks[j]).contains(2)||Arrays.asList(students[i].marks[j]).contains(3)){
                break;
            }
            else{
                System.out.println("Отличника зовут " + students[i].name + ". Он учится в группе " + students[i].group);
                break;
            }
        }
    }
     for (int i = students.length - 1; i > 0; i--) {    
        for (int j = 0; j < i; j++) {
            if (students[j].averageValue() > students[j+1].averageValue()) {
                Student tempPos = students[j];
                students[j] = students[j+1];
                students[j+1] = tempPos;
                
                }
    }
}
    for (int i = 0; i < students.length; i++){
        System.out.println(students[i] + " " +  students[i].averageValue() );        
    }
}
}




