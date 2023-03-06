package Java.Lect4;

public class Name {
    String fname;
    String lname;
    String mname;

    // constructor
    // no return, name same as class
    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public Name(){}

    public void setFName(String fname) {
        // "this" refers to the class attributes
        this.fname = fname;
    }
    
    public void setLName(String lname) {
        // "this" refers to the class attributes
        this.lname = lname;
    }

    public void setMName(String mname) {
        // "this" refers to the class attributes
        this.mname = mname;
    }
    
}
