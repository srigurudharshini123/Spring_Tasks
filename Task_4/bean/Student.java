package bean;

public class Student {
private int id;
private String name;
private String course;
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setCourse(String course) {
	this.course = course;
}
public void display() {
	System.out.println("Student ID: "+id);
	System.out.println("Student Name: "+name);
	System.out.println("Current Course: "+course);
}
}
