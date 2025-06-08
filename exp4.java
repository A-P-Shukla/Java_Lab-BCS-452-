class Animal { 
void makeSound() { 
System.out.println("The animal makes a sound."); 
} 
} 
class Dog extends Animal { 
void makeSound() { 
System.out.println("The dog barks."); 
} 
void bark() { 
System.out.println("Dog is barking normally."); 
} 
void bark(String type) { 
System.out.println("Dog is barking in a " + type + " way."); 
} 
void bark(int times) { 
System.out.println("Dog barked " + times + " times."); 
} 
} 
public class InheritancePolymorphismDemo { 
public static void main(String[] args) { 
Animal myAnimal = new Animal(); 
Animal myDog = new Dog(); 
myAnimal.makeSound(); 
myDog.makeSound(); 
Dog dog = new Dog(); 
dog.bark(); 
dog.bark("loud"); 
dog.bark(3); 
}
