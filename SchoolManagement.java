import java.util.Scanner;
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
        }
	public void displayInfo(){
		System.out.println("name"+name+" age is"+age);
	}
}
class Student extends Person{
	String grade;
	Student(String name,int age,String grade){
		super(name,age);
		this.grade=grade;
	}
	public void study(){
		System.out.println("Student: "+name+", "+"Age: "+age+", "+"Grade: "+grade);
	}
	public void displayInfo(){
		System.out.println(name+" is studying in grade "+grade+".");
	}
}
class Teacher extends Person{
	String subject;
	Teacher(String name,int age,String subject){
		super(name,age);
		this.subject=subject;
	}
	public void teach(){
		System.out.println("Teacher: "+name+", "+"Age: "+age+", "+"Subject: "+subject);
	}
	public void displayInfo(){
		System.out.println("Mr. "+name+" teaches "+subject+".");
	}
}
class Principal extends Person{
	String Subject;
	Principal(String name,int age,String Subject){
		super(name,age);
		this.Subject=Subject;
		
	}
	public void manageSchool(){
		System.out.println("Principal: "+name+", "+"Age: "+age+", "+"Subject: "+Subject);
	}
	public void displayInfo(){
		System.out.print("Mr. "+name+" managing the school.");
	}
}
public class SchoolManagement{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.println("Enter Student detalis");
		Student s=new Student(sc.next(),sc.nextInt(),sc.next());
		s.study();
		s.displayInfo();
		System.out.println();

		System.out.println("Enter Teacher detalis");
		Teacher t=new Teacher(sc.next(),sc.nextInt(),sc.next());
		t.teach();
		t.displayInfo();

		System.out.println();
		System.out.println("Enter Principal detalis");
		Principal p=new Principal(sc.next(),sc.nextInt(),sc.next());
		p.manageSchool();
		p.displayInfo();
	}
}