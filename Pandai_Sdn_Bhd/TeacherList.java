package Java.Lect4;

import java.util.*;

public class TeacherList {
    ArrayList<Teacher> tutors = new ArrayList<>();

    void add(Teacher tutor){
        //students[currsz++] = student;
        tutors.add(tutor);
    }

    boolean find(Name name){
        // loop thru the array students
        // for each student in students
        // check whether name is the same as that in student
        for (Teacher i : tutors){
            // bool = (i.name == "Adlin") ? true : false;
            if (i.name == name){
                return true;
            }
        }
        return false;
    }
}

