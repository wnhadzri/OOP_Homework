package Java.Lect4;
public class Student {
    // data/atributes
    Name name;
    String ic;
    String address;
    String schoolName;
    float marks[] = new float[5];
    Teacher tutor;

    // methods or operation
    void setName(Name name) {
        this.name = name;
    }

    void setIc(String ic){
        this.ic = ic;
    }

    void setAddress(String addr){
        this.address = addr;
    }

    void setSchoolname(String sn){
        this.schoolName = sn;
    }

    String setSex(String sex){
        return sex;
    }
    
    void setMark(float mark, int i){
        marks[i] = mark;    
    }

    void setTeacher(Teacher x){
        this.tutor = x;
    }

    float calcAvg() {
        int counter = 0;
        float total = 0, avg = 0;
        for (float i : marks){
            total += i;
            counter++;
        }
        avg = total/counter;
        return avg;
    }

    float calcMin() {
        float min = 9999999;
        for (float i: marks){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    float calcMax() {
        float max = -9999999;
        for (float i: marks){
            if (i > max){
                max = i;
            }
        }
        return max;
    }

    void displayMark(){
        for (int i=0; i<marks.length; i++){
            System.out.println("marks at index #" + i + " :" + marks[i]);
        } 
    }

    public static void main(String args[]){
        Student stud0 = new Student();

        try { // try block.. something in here can cause exception

        stud0.setMark(10,0);
        stud0.setMark(-10,1);

        } catch (Exception ex) {

            System.out.println("Cannot continue");
            ex.printStackTrace();
        }
        stud0.displayMark();


    }
}