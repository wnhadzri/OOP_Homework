package Java.Lect4;
import java.util.NoSuchElementException;

public class Main {
    // application code
    public static void main(String[] args) {

        Prompt display = new Prompt();
        StudentBatch sb2023 = new StudentBatch();
        TeacherList tc2023 = new TeacherList();
        Teacher tutor = new Teacher();
        Student stud = new Student();

        int opt, opt2;
        boolean cond = true;

        display.showWelcome();
        opt = display.showTuitionOpt();

        display.showWelcome2(opt);
        opt = display.showType();

        while (cond) {
            switch (opt){
                case 1:
                    do {
                        display.showFeatures(1);
                        opt2 = display.showChoice();
                        switch (opt2){
                            case 1:
                                tutor.setName(display.promptName());
                                tutor.setIc(display.promptIC());
                                tutor.setAddress(display.promptAddr());
                                tutor.setExperience(display.promptExp());
                                tutor.setQualification(display.promptQualification());
                                tc2023.add(tutor);
                                System.out.println("Teacher was successfully added.\n");
                                break;
                            case 2:
                                stud.setName(display.promptName());
                                stud.setIc(display.promptIC());
                                stud.setAddress(display.promptAddr());
                                sb2023.add(stud);
                                System.out.println("Student was successfully added.\n");
                                break;
                            case 3:
                                //System.out.println(sb2023.students.get(0).ic);
                                try {
                                    stud = display.promptSetMark(sb2023.students);
                                    display.showSetMark(stud);
                                    // Do something with the student
                                } catch (NoSuchElementException e) {
                                    System.out.println(e.getMessage()); // Print the error message
                                    // Handle the error
                                }
                                //stud = display.promptSetMark();
                                
                                break;
                            case 4:
                                break;
                        }
                    }while (opt2 != 4); 
                    break;
                case 2:
                    do {
                        display.showFeatures(2);
                        opt2 = display.showChoice();
                        switch (opt2){
                            case 1:
                                System.out.println("Average mark is " + display.promptAvg(sb2023.students));
                                break;
                            case 2:
                                System.out.println("Min mark is " + display.promptMin(sb2023.students));
                                break;
                            case 3:
                                System.out.println("Max mark is " + display.promptMax(sb2023.students));
                                break;
                            case 4:
                                display.promptTutorBG(tc2023.tutors);
                                break;
                            case 5:
                                break;
                        }
                    } while (opt2 != 5);
                    break;
                case 3:
                    cond = false;
                    continue;
            }

            opt = display.showType();
        }
    }
}


        /* 
        Name name;

        Student mike = new Student();
        name = new Name("Michael", "D.", "Zero");
        mike.setName(name);

        Student adila = new Student();
        name = new Name("Adlina", "binti", "Izzat");
        adila.setName(name);

        Student imran = new Student();
        name = new Name();
        name.setFName("Syed");
        name.setMName("Imran");
        name.setLName("Shah");
        imran.setName(name);

        // creating a batch object
        sb2023.add(imran);
        sb2023.add(adila);
        sb2023.add(mike);

        // declare a method that allows for the following:
        boolean isIn = sb2023.find(mike.name);
        if (isIn == true){
            System.out.println(mike.name.fname + " is in the list of studentbatch");
        }
        else {
            System.out.println("There is no student named " + mike.name.fname);
        }

        for (int i=0; i<5; i++){
            try {
                mike.setMark(Math.round((float)(Math.random() * 100)), i);
            } catch (Exception e) {
                System.out.print("Invalid mark: " + e.getMessage());
            }
        }

        // calculate and print the avg
        float avg = mike.calcAvg();
        System.out.println("Average = " + avg);

        // calculate the min marks for mike
        float min = mike.calcMin();
        System.out.println("Min mark = " + min);

        // tutors info
        Teacher misswong = new Teacher();
        name = new Name();
        name.setFName("Wong");
        name.setMName("Lim");
        name.setLName("Ng");
        misswong.setName(name);
        misswong.setStudent(adila);
        

        Teacher cikguminah = new Teacher();
        name = new Name("Minah", "Binti", "Kasim");
        cikguminah.setName(name);
        cikguminah.setStudent(mike);

        */

        // String[] studentList = new String[5];
        // ListStudent students = new ListStudent();
        // studentList = students.retrieveStudent();
    

