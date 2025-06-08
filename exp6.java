// File: studentinfo/Student.java 
package studentinfo; 
public class Student { 
public void showInfo() { 
System.out.println("Student Name: Akhand Pratap Shukla, Roll No: 2301641540022"); 
} 
} 
// File: Main.java 
import studentinfo.Student; 
public class Main { 
public static void main(String[] args) { 
Student s = new Student(); 
s.showInfo(); 
} 
} 
