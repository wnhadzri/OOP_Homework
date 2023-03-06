package Java.Lect4;

import java.util.*;

public class StudentBatch {
    // data section
    // what is a StudentBatch
    // a StudentBatch is a list of students registered in a batch
    // "list of students"???? an array of Students
    ArrayList<Student> students = new ArrayList<>();
    //Student students[] = new Student[5];
    int currsz = 0;
    
    /*
    void add(Student student, int i){
        //students[i] = student;
        students.add(student);
    }
    */

    void add(Student student){
        //students[currsz++] = student;
        students.add(student);
    }

    boolean find(Name name){
        // loop thru the array students
        // for each student in students
        // check whether name is the same as that in student
        for (Student i : students){
            // bool = (i.name == "Adlin") ? true : false;
            if (i.name == name){
                return true;
            }
        }
        return false;
    }
}
