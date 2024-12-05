package Test5;

public class Student {
	
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String gender;
	
	Student(int stuNo, String stuName){
		this.stuNo = stuNo;
		this.stuName = stuName;
	}
	Student(int stuNo, String stuName, String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	void setInfo(int age, String gender){
		this.age = age;
		this.gender = gender;
	}
	int getAge() {
		return age;
	}
}
