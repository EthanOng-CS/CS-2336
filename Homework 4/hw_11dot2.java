import java.util.*;

public class hw_11dot2{

	public static void main(String[] args) {
		// Create a Person, Student, Employee, Faculty, and Staff objects
		Person person = new Person("John", "11 Mill Street", 
			"(457)-333-3333", "john12@google.com");

		Student student = new Student("Manny", "1502 Great Ave", "(123)-456-7890", 
			"manny100@google.com", Student.SENIOR);

		Employee employee = new Employee("Roze", "84 North Street", "(258)-000-0000",
			"roze12@google.com", 520, 65000);

		Faculty faculty = new Faculty("Poe", "90 Bell Street", "(645)-253-1234",
			"poe87@google.com", 108, 55000, "8AM to 5PM", "Professor");

		Staff staff = new Staff("Luke", "24 Maple Street", "(512)-999-9999",
			"luke56@google.com", 56, 70000, "Executive Assistant");

		// Invoke toString of Person, Student, Employee, Faculty and Staff
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;

	// Constructor
	// Person object with specified name, address, phone and email 
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phone;
		this.emailAddress = email;
	} 

	// Return name 
	public String getName() {
		return name;
	}

	// Return address 
	public String getAddress() {
		return address;
	}

	// Return phone 
	public String getPhone() {
		return phoneNumber;
	}

	// Return email 
	public String getEmail() {
		return emailAddress;
	}

	// Set new name 
	public void setName(String name) {
		this.name = name;
	}

	// Set new address 
	public void setAddress(String address) {
		this.address = address;
	}

	// Set new phone number 
	public void setPhone(String phone) {
		this.phoneNumber = phone;
	}

	// Set new email 
	public void setEmail(String email) {
		this.emailAddress = email;
	}

	// Return a string discription of the class 
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + 
				 "\nPhone number: " + phoneNumber + "\nEmail address: " + emailAddress;
	}
}

class Student extends Person {
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;
	
	public Student(String name, String address,  
	String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}
	
	// Set new status 
	public void setStatus(int status) {
		this.status = status; 
	}
	
	// Return status 
	public String getStatus() {
		switch (status) {
			case 1 : return "Freshman"; 
			case 2 : return "Sophomore"; 
			case 3 : return "Junior"; 
			case 4 : return "Senior";
			default : return "Unknown"; 
		}
	}
	
	// Return a string discription of the class 
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}

class Employee extends Person {
	private int officeNum;
	private double employeeSalary;
	private MyDate hiredDate;
	
	// Construct Employee object 
	public Employee(String name, String address, String phone, 
	String email, int office, double salary) {
		super(name, address, phone, email);
		this.officeNum = office;
		this.employeeSalary = salary;
		this.hiredDate = new MyDate();
	}
	
	// Return office 
	public int getOffice() {
		return officeNum;
	}
	
	// Return salaray 
	public String getSalary() {
		return String.format("%.2f", employeeSalary);
	}
	
	// Return date hired 
	public String getDateHired() {
		return hiredDate.getMonth() + "/" + hiredDate.getDay() 
			   + "/" + hiredDate.getYear();
	}
	
	// Set new office 
	public void setOffice(int office) {
	this.officeNum = office;
	}
	
	// Set new salary 
	public void setSalary(double salary) {
		this.employeeSalary = salary;
	}
	
	// Set new dateHired 
	public void setDateHired() {
		hiredDate = new MyDate();
	}
	
	// Return a string discription of the class 
	public String toString() {
		return super.toString() + "\nOffice: " + officeNum + 
			   "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}

class Faculty extends Employee {
	// Data fields
	private String officeHours;
	private String falcutyRank;
	
	// Constructors
	// Construct a Faculty object with specified name, address, phone number,
	// email address, office, salary, office hours and rank 
	public Faculty(String name, String address, String phone, String email, 
				   int office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.falcutyRank = rank;
	}
	
	// Return officeHours 
	public String getOfficeHours() {
		return officeHours;
	}
	
	// Set new officeHours 
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	
	// Return rank 
	public String getRank() {
		return falcutyRank;
	}
	
	// Set new rank 
	public void setRank(String rank) {
		this.falcutyRank = rank;
	}
	
	// Return a string discription of the class 
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
			   "\nRank: " + falcutyRank;
	}
}

class Staff extends Employee {
	// Data Fields
	private String title;
	
	// Constructors
	// Construct a Staff object */
	public Staff(String name, String address, String phone, 
			     String email, int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}
	
	// Return title */
	public String getTitle() {
		return title;
	}
	
	// Set new title */
	public void setTitle(String title) {
		this.title = title;
	}
	
	// Return a string discription of the class */
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}

class MyDate {
	// Data Fields
	private int year;
	private int month;
	private int day;

	// Creates a MyDate object for the current date 
	MyDate() {
		GregorianCalendar calander = new GregorianCalendar();
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}

	// Creates a MyDate object with a specified elapsed time
	//	 since midnight, January 1, 1970, in milliseconds 
	MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	// Creates a MyDate object with the 
	//  specified year, month, and day 
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// Return year 
	public int getYear() {
		return year;
	}

	// Return month 
	public String getMonth() {
		String m = String.valueOf(month + 1);
		return (month < 10 ? "0" + m : m);
	}

	// Return day 
	public String getDay() {
		String d = String.valueOf(day);
		return (day < 10 ? "0" + d : d);
	}

	// Sets a new date for the object using the elapsed time 
	public void setDate(long elapsedTime) {
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	} 
}
