package Java.Lect4;
import java.util.Scanner;
import java.util.*;

public class Prompt {
    
    Teacher tutor = new Teacher();
    Student stud = new Student();
    private Scanner inp = new Scanner(System.in);

    public void showWelcome(){
        System.out.println("---------Welcome to Pandai Sdn Bhd system----------");
    }

    public int showTuitionOpt(){
        System.out.println("Choose a tuition center:- \n1 - Kuala Lumpur \n2 - Johor Bahru");
        System.out.print("Option: ");
        int x = inp.nextInt(); inp.nextLine();
        System.out.println("");
        return x;
    }

    public void showWelcome2(int x){
        switch (x){
            case 1:
                System.out.println("----------Welcome to Kuala Lumpur Tuition Center----------");
                break;
            case 2:
                System.out.println("----------Welcome to Johor Bahru Tuition Center----------");
                break;
        }
    }

    public int showType(){
        System.out.println("Choose an option:- \n1 - Administration \n2 - Report \n3 - Exit");
        System.out.print("Option: ");
        int x = inp.nextInt(); inp.nextLine();
        System.out.println("");
        return x;
    }

    public void showFeatures(int x){
        switch (x){
            case 1:
                System.out.println("Now choose next option:- \n1 - Add Tutor \n2 - Add Student \n3 - Set Student Marks \n4 - Back");
                break;
            case 2:
                System.out.println("Now choose next option:- \n1 - Avg marks \n2 - Min marks \n3 - Max marks \n4 - Tutors background \n5 - Back");
                break;
        }
    }

    public int showChoice(){
        System.out.print("Option: ");
        int x = inp.nextInt(); inp.nextLine();
        System.out.println("");
        return x;
    }

    public Name promptName(){
        System.out.print("Enter first name: ");
        String x = inp.nextLine();
        System.out.print("Enter midle name: ");
        String y = inp.nextLine();
        System.out.print("Enter last name: ");
        String z = inp.nextLine();
        System.out.println("");
        Name name = new Name(x, y, z);

        return name;
    }

    public String promptIC(){
        System.out.print("Enter IC number: ");
        String x = inp.nextLine();
        System.out.println("");
        
        return x;
    }

    public String promptAddr(){
        System.out.print("Enter Address: ");
        String x = inp.nextLine();
        System.out.println("");
        
        return x;
    }

    public String promptQualification(){
        System.out.print("Enter qualification: ");
        String x = inp.nextLine();
        System.out.println("");
        
        return x;
    }

    public int promptExp(){
        System.out.print("Enter experience(years): ");
        int x = inp.nextInt(); inp.nextLine();
        System.out.println("");
        
        return x;
    }

    //StudentBatch studs = new StudentBatch();
    //TeacherList tutors = new TeacherList();

    public float promptAvg(ArrayList<Student> sb){
        float avg = 0;
        System.out.print("Enter the student's IC number: ");
        String x = inp.nextLine();
        System.out.println("");

        for (Student y : sb){
            if (y.ic.equals(x)){
                avg = y.calcAvg();
                
            }
        }
        return avg;
    }

    public float promptMin(ArrayList<Student> sb){
        float min = 0;
        System.out.print("Enter the student's IC number: ");
        String x = inp.nextLine();
        System.out.println("");

        for (Student y : sb){
            if (y.ic.equals(x)){
                min = y.calcMin();
            }
        }
        return min;
    }

    public float promptMax(ArrayList<Student> sb){
        float max = 0;
        System.out.print("Enter the student's IC number: ");
        String x = inp.nextLine();
        System.out.println("");

        for (Student y : sb){
            if (y.ic.equals(x)){
                max = y.calcMax();
            }
        }
        return max;
    }

    public void promptTutorBG(ArrayList<Teacher> tc){
        System.out.print("Enter the Teacher's IC number: ");
        String x = inp.nextLine();
        System.out.println("");

        for (Teacher y : tc){
            if (y.ic.equals(x)){
                System.out.println("This tutor has " + y.numyearexp + " years of experience.\n");
            }
        }
        
    }

    public Student promptSetMark(ArrayList<Student> sb) throws NoSuchElementException{

        System.out.print("Enter the student's IC number: ");
        String x = inp.nextLine();
        System.out.println("");

        for (Student y: sb){
            
            //Student y = sb2023.students.get(i);
            if (y.ic.equals(x)){
                return y;   
            }
        }
        throw new NoSuchElementException("No matching student found.");
    }

    public void showSetMark(Student x) {
        for (int i=0; i<5; i++){
            System.out.print("Enter mark for subject #" + (i+1) + ": ");
            float m = inp.nextFloat(); inp.nextLine();
            System.out.println("");
            x.setMark(m, i);

        }
        
    }

}
