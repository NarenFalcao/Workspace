import java.util.*;
class student{
int rollno;
String name;
int age;

student(int rollno,String name,int age){
	this.rollno = rollno;
	this.name = name;
	this.age = age;
	
	
}
	
}
public class CollectionArrayList {

	public static void main(String args[]){
		student s1 = new student(1,"naren",14);
		student s2 = new student(2,"kumar",16);
		student s3 = new student(3,"jon",15);
		
		ArrayList<student> obj = new ArrayList<student>();
		
		obj.add(s1);
		obj.add(s2);
		obj.add(s3);
		
		
		ArrayList<student> obj2 = new ArrayList<student>();
		
		student s4 = new student(4,"hi",17);
		student s5 = new student(5,"hello",18);
		
		obj2.add(s4);
		obj2.add(s5);
		
		obj.addAll(obj2);
		
		Iterator i = obj.iterator();
		
		while(i.hasNext()){
			student s = (student)i.next();
			System.out.println(s.rollno);
			System.out.println(s.name);
			System.out.println(s.age);
		}
		
		}
	
}
