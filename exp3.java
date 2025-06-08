// Student.java 
class Student { 
String name; 
int rollNo; 
// Constructor 
Student(String name, int rollNo) { 
this.name = name; 
this.rollNo = rollNo; 
} 
// Method to display student details 
void displayDetails() { 
System.out.println("Student Name: " + name); 
System.out.println("Roll Number: " + rollNo); 
} 
} 
// Rectangle.java 
class Rectangle { 
double length; 
double width; 
// Constructor 
Rectangle(double length, double width) { 
this.length = length; 
this.width = width; 
} 
// Method to calculate and display area 
void displayArea() { 
double area = length * width; 
System.out.println("Rectangle Area: " + area); 
} 
} 
 
 
// Main class to run the program 
public class Main { 
public static void main(String[] args) { 
// Creating a Student object 
Student student1 = new Student("Alice", 101); 
student1.displayDetails(); 
System.out.println(); // Empty line for separation 
// Creating a Rectangle object 
Rectangle rectangle1 = new Rectangle(5.0, 3.0); 
rectangle1.displayArea(); 
} 
}
