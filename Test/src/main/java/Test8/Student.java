package Test8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Student {
	private String name;
	private String department;
	private String id;
	private double grade;
	
	public Student(String name, String department, String id, double grade) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public double getGrade() {
		return grade;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		while(true) {
			System.out.print(">> ");
			String info = scan.nextLine();
			if(info.equals("그만")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(info, ",");
			String name = st.nextToken();
			String dept = st.nextToken();
			String id = st.nextToken();
			String grade = st.nextToken();
			double parseGrade = Double.parseDouble(grade);
			
			Student student = new Student(name, dept, id, parseGrade);
			list.add(student);
		}
		for(int i =0; i < list.size(); i++) {
			
			System.out.println("----------------------");
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("학과 : " + list.get(i).getDepartment());
			System.out.println("학번 : " + list.get(i).getId());
			System.out.println("학점평균 : " + list.get(i).getGrade());
			System.out.println("----------------------");
		}
		
		
		
	}
}
