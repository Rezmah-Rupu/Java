public class Student{
    private int studentId;
    private String studentName;
    private double studentCGPA;
    
    Student(int studentId, String studentName, double studentCGPA){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }
    
    void setstudentId(int studentId){
        this.studentId = studentId;
    }
    void setstudentName(String studentName){
        this.studentName = studentName;
    }
    void setstudentCGPA(double studentCGPA){
        this.studentCGPA = studentCGPA;
    }
    int getstudentId(){
        return this.studentId;
    }
     String getstudentName(){
        return this.studentName;
    }
     double getstudentCGPA(){
        return this.studentCGPA;
    }
    
    public String  toString(){
        System.out.println("The ID of the student is:"+this.studentId);
        System.out.println("The  name of the student is:"+this.studentName);
        System.out.println("The CGPA of the student is:"+this.studentCGPA);
        return null;
     }   
}