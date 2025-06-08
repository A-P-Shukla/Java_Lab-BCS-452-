public class CommandLineSum { 
public static void main(String[] args) { 
// Check if two arguments are provided 
if (args.length < 2) { 
System.out.println("Please provide two integer numbers as command-line 
arguments."); 
return; 
} 
 
try { 
// Parse the arguments from String to int 
int num1 = Integer.parseInt(args[0]); 
int num2 = Integer.parseInt(args[1]); 
 
// Calculate the sum 
int sum = num1 + num2; 
 
// Display the result 
System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum); 
} catch (NumberFormatException e) { 
System.out.println("Error: Please enter valid integer numbers."); 
} 
}
