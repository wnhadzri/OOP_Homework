package Java.Lect4;

public class Teacher {
    //data
    protected Name name;
    protected String ic;
    protected String address;
    protected int numyearexp;
    protected String qualification;
    protected Student stud;

    void setName(Name name) {
        this.name = name;
    }

    String setIc(String ic) {
        this.ic = ic;
        return ic;
    }

    String setAddress(String addr) {
        this.address = addr;
        return addr;
    }

    String setQualification(String q) {
        this.qualification = q;
        return q;
    }

    int setExperience(int exp){
        this.numyearexp = exp;
        return exp;
    }

    void setStudent(Student x) {
        this.stud = x;
    }
    
}
