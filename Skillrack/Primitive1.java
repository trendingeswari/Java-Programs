
/*
 Object - Introduction
Objects have two characteristics - state and behaviour.
The state is represented by fields (also called variables).
The behaviour is represented by methods (also called functions).
Let us take a dog as an example.
The state of the dog can be
- age of the dog
- breed of the dog (like Labrador, Bulldog)
- color of the dog
The behaviour of the dog can be
- barking
- wagging the tail
Class - Introduction:
The state and the behaviour is composed in a blueprint/template called class.
An instance of a class is called an object.
The below code represents class Dog
public class Dog {
 private String name;
 public void bark() {
 System.out.println("Bow Wow");
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
}
Let us say there are two dogs in our neighbourhood with their names as Jimmy and Rock.
We use the above class Dog to create two instances (objects) dog1 and dog2 as in the code given
below.
The keyword new is used to create objects (that is instances of a class).
1/22/24, 11:30 AM skillrack.com/faces/candidate/tutorprogram.xhtml
https://www.skillrack.com/faces/candidate/tutorprogram.xhtml 2/2
public class Hello {
 public static void main(String[] args) {
 Dog dog1 = new Dog();
 dog1.setName("Jimmy");
 Dog dog2 = new Dog();
 dog2.setName("Rock");
 }
}
ProgramID- 1623 SKILLRACK
Object - class introduction
The student class is given below.
public class Student {
 private String name;
 private String registrationNumber;
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getRegistrationNumber() {
 return registrationNumber;
 }
 public void setRegistrationNumber(String registrationNumber) {
 this.registrationNumber = registrationNumber;
 }
}
Fill in the missing lines of code so that the below program prints the student's name as Larsen and the
registration number as 12345
Hint: Use the setName and setRegistrationNumber methods to set the values.
 */
public class Primitive1 {
    public static void main(AbbrevationMatching args[])
    {
        Student s1 = new Student();
        s1.setName("eswari");
        s1.setRegistrationNumber("22tc0183");
        System.out.println(s1.getName());
        System.out.println(s1.getRegistrationNumber());
        return ;

    }
    public class Student {
        private AbbrevationMatching name;
        private AbbrevationMatching registrationNumber;
        public AbbrevationMatching getName() {
        return name;
        }
        public void setName(AbbrevationMatching name) {
        this.name = name;
        }
        public AbbrevationMatching getRegistrationNumber() {
        return registrationNumber;
        }
        public void setRegistrationNumber(AbbrevationMatching registrationNumber) {
        this.registrationNumber = registrationNumber;
        }
       }
}
