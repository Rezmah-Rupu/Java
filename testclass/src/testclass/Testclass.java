import java.util.ArrayList;
import java.util.Scanner;

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

public class Course{
    private String courseId;
    private String courseTitle;
    private double credit;
    
    import java.util.ArrayList;
    ArrayList[Student];
    StudentList = new ArrayList[Student]();
    
    Faculty faculty = new faculty();
    
    Course(String courseId, String courseTitle, double credit){
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }
    
    void setcourseId(int courseId){
        this.courseId = courseId;
    }
    void setcourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    void credit(double credit){
        this.credit = credit;
    }
    int getcourseId(){
        return this.courseId;
    }
     String getcourseTitle(){
        return this.courseTitle;
    }
     double getcredit(){
        return this.credit;
    }
    
    public String  toString(){
        System.out.println("The ID of the course is:"+this.courseId);
        System.out.println("The title of the course is:"+this.courseTitle);
        System.out.println("The credit of the course is:"+this.credit);
        return null;
     }   
}

public class Faculty{
     private int facultyId;
    private String facultyName;
    private String facultyPosition;
    
    Faculty(int facultyId, String facultyName, String facultyPosition){
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    void setfacultyId(int facultyId){
        this.facultyId = facultyId;
    }
    void setfacultyName(String facultyName){
        this.courseTitle = courseTitle;
    }
    void facultyPosition(String facultyPosition){
        this.facultyPosition = facultyPosition;
    }
    int getfacultyId(){
        return this.facultyId;
    }
     String getfacultyName(){
        return this.facultyName;
    }
     double getfacultyposition(){
        return this.facultyPosition;
    }
    
    public String  toString(){
        System.out.println("The ID of the faculty is:"+this.facultyId);
        System.out.println("The  name of the faculty is:"+this.facultyName);
        System.out.println("The position of the faculty is:"+this.facultyPosition);
        return null;
     }  
     
}

public class testClass {
	public static void main (String [] args ) {
		Scanner input = new Scanner(System.in);
		
		ArrayList <student> StudentList = new ArrayList <student>();
		//ArrayList <faculty> FacultyList = new ArrayList <faculty> ();
		int option;
		int stuId, facId;
		String courseID, search;
		
		
		while (true) {
			System.out.println("Enter a number of the following Options.");
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Search");
			System.out.println("4. Update");
			System.out.println("5. Exit");
			
			
			option = input.nextInt();
				if (option == 1) {								//1.Add
					System.out.println("1. Add a Student.");
					System.out.println("2. Add a Course.");
					System.out.println("3. Add a Faculty.");
					System.out.println("4. Add a Student in a Course.");
					option = input.nextInt();
						if(option == 1) {						//1.Add a Student
							System.out.println("Enter Student info(ID, Name, Cgpa).");
							student stu = new student ();
							stu.setStudentId(input.nextInt());
							stu.setStudentName(input.next());
							stu.setStudentCGPA(input.nextDouble());
							
							StudentList.add(stu);
						}
						
						else if(option == 2) {					//2.Add a Course
							System.out.println("Enter the Course Info (ID, Title, Credit)");
							course course = new course();
							
							cou.setCourseID(input.next());
							cou.setCourseTitle(input.next());
							cou.setCourseCredit(input.nextDouble());
							
							course.CourseList.add(course);
							//System.out.println(course.CourseList.get(0).getCourseId());
						}
						else if(option == 3) {					//3.Add a Faculty
							System.out.println("Enter the Faculty's info (ID, Name, Position)");
							Faculty faculty = new faculty();
							
							faculty.setFacultyId(input.nextInt());
							faculty.setFacultyName(input.next());
							faculty.setFacultyPosition(input.next());
							
							faculty.addFaculty(faculty);
						}
						else if(option == 4) {					//4.Add Student in a Course.
							System.out.println("Enter the student's ID and Course ID.");
							studentId = input.nextInt();
							courseId = input.next();
							
							for(int i = 0; i < course.CourseList.size(); i++) {
								if(courseId == course.CourseList.get(i).getCourseId()) {
									for(int j = 0; j < StudentList.size(); j++) {
										if(studentId == StudentList.get(i).getStudentId()) {
											course.Studentlist.add(StudentList.get(j));
										}
									}
								}
							}
						}//
						
						
				}
				else if (option == 2) {							//2.Delete
					System.out.println("1. Delete a Student.");
					System.out.println("2. Delete a Course.");
					System.out.println("3. Delete a Faculty.");
					option = input.nextInt();
					
						if(option == 1) {						//1.Delete a Student
							System.out.println("Enter the ID of the Student to be Deleted.");
							studentId = input.nextInt();
							
							for(int i = 0; i < StudentList.size(); i++) {
								if(studentId == StudentList.get(i).getStudentId()) {
									StudentList.remove(i);
									System.out.println("Done");
									break;
								}
								
							}
						}
						else if(option == 2) {					//2.Delete a Course
							System.out.println("Enter a Course ID to be Deleted.");
							courseId = input.next();
							
							for(int i = 0; i < course.CourseList.size(); i++) {
								if(courseId == course.CourseList.get(i).getCourseId()) {
									course.CourseList.remove(i);
									System.out.println("Done");
									break;
								}
							}
							
						}
						else if(option == 3) {					//3.Delete a Faculty
							System.out.println("Enter Faculty Id to be Deleted.");
							facultyId = input.nextInt();
							for(int i = 0; i < faculty.FacultyList.size(); i ++) {
								if(facultyId == faculty.FacultyList.get(i).getFacultyId()) {
									faculty.FacultyList.remove(i);
									System.out.println("Done");
									break;
								}
							}
							
						}
				}//
				else if(option == 3) {							//3.Search
					System.out.println("1. Search Students.");
					System.out.println("2. Search Courses.");
					System.out.println("3. Search Faculties.");
					option = input.nextInt();
					
						if(option == 1) {						//1.Search a Student
							System.out.println("Enter the Student ID.");
							studentId = input.nextInt();
							for (int i = 0; i < StudentList.size(); i++) {
								if(studentId == StudentList.get(i).getStudentId()) {
									
									student.toString(StudentList.get(i));
									break;
								}
								else {
									System.out.println("Invalid Id");
								}
							}
						}
						else if(option == 2) {					//2.Search a Course
							System.out.println("Enter the Course ID");
							courseId = input.next();
							for(int i = 0; i < course.CourseList.size(); i++) {
								search = course.CourseList.get(i).getCourseId();
								System.out.println(course.CourseList.get(0).getCourseId());
								//System.out.println(course.CourseList.get(1).getCourseId());
								 if(courseId.equals(search) ) {	//IMPORTANT!!!! Use equals() for string Comparison
									 
									 course.toString(course.CourseList.get(i));
									 break;
								 }
								 else {
									 System.out.println("Invalid Id");
								 }
							}
						}
						else if(option == 3) {					//3.Search a Faculty
							System.out.println("Enter Faculty Id.");
							facultyId = input.nextInt();
							for(int i = 0; i < faculty.FacultyList.size(); i++) {
								if(facultyId == faculty.FacultyList.get(i).getFacultyId()) {
									
									faculty.toString(faculty.FacultyList.get(i));
									break;
								}
								else {
									System.out.println("Invalid Id");
								}
							}
						}
						else {
							System.out.println("Invalid Option.");
						}
				}
				else if(option == 4) {							//4.Update
					System.out.println("1. Update a Student.");
					System.out.println("2. Update a Course.");
					System.out.println("3. Update a Faculty.");
					
					option = input.nextInt();
						
						if(option == 1) {						//1.Update a Student
							System.out.println("Enter a Student ID to be Updated.");
							studentId = input.nextInt();
							
							
							for(int i = 0; i < StudentList.size(); i++) {
								if(studentId == StudentList.get(i).getStudentId()) {
									System.out.println("Enter Student info to be Updated. (Name, CGPA)");
									StudentList.get(i).setStudentName(input.next());  
									StudentList.get(i).setStudentCGPA(input.nextDouble());
									break;
								}
							}
						}
						else if(option == 2) {					//2.Update a Course
							System.out.println("Enter a Course ID to be Updated.");
							courseId = input.next();
							
							for(int i = 0; i < course.CourseList.size(); i++) {
								if(courseId == course.CourseList.get(i).getCourseId()) {
									System.out.println("Enter Course info to be Updated. (Title , Credits)");
									course.CourseList.get(i).setCourseTitle(input.next());
									course.CourseList.get(i).setCourseCredit(input.nextDouble());
									break;
								}
							}
						}
						else if(option == 3) {					//3.Update a Faculty
							System.out.println("Enter a Faculty ID to be Updated");
							facultyId = input.nextInt();
							
							for(int i = 0; i < faculty.FacultyList.size(); i++) {
								if(facultyId == faculty.FacultyList.get(i).getFacultyId()) {
									System.out.println("Enter Faculty info to be Updated. (Name, Position)");
									faculty.FacultyList.get(i).setFacultyName(input.next());
									faculty.FacultyList.get(i).setFacultyPosition(input.next());
									break;
								}
								else {
									System.out.println("Invalid ID");
								}
							}
						}
				}
				else if (option == 5) {							//5.Exit
					System.out.println("Finished.");
					break;
				}
				else if(option > 5) {
					System.out.println("Enter a Proper Option.");
				}
				
		}
		
		input.close();	
	}
}