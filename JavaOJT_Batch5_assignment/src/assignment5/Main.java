package assignment5;

public class Main {
	static  final String description="This  project is University Management";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Teacher teacher=new Teacher("Dr.Sapal", 38, "Teacher", 500000.00, "IT");
teacher.startTimeUni();
teacher.breakTime();
teacher.overTime();
teacher.teachCourse();
teacher.uploadPerson();

Student student=new Student("Maung Zaw",21,"Business IT");

student.startTimeUni();
student.breakTime();
student.overTime();
student.uploadPerson();

Staff staff=new Staff("U Aung Chit Khin", 50, "Manager", 900000.00);
staff.startTimeUni();
staff.breakTime();
staff.overTime();
staff.uploadPerson();


	}

}
