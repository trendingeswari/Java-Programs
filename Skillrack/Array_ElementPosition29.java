/*
 Array - Introduction & Element position
Array is used to hold more than one objects of same type together.
As an example, the program declares and initializes an an array of prime numbers from 1 to 10.
public class Hello {
 public static void main(String[] args) {
 int[] primeNumbersUptoTen = new int[]{2,3,5,7};
 }//end of main method
}//end of class
Now let us print the second element in the int array.
public class Hello {
 public static void main(String[] args) {
 int[] primeNumbersUptoTen = new int[]{2,3,5,7};
 int secondElement = primeNumbersUptoTen[1];
 System.out.println(secondElement);
 }//end of main method
}//end of class
ProgramID- 26 SKILLRACK
Arrays - Element position
In the below Java program, the second element in the String array cities is printed.
Modify the program so that it prints the third element in the String array cities.
Hint: Use cities[2] to represent the third element
 */
public class Array_ElementPosition29 {
    public static void main(AbbrevationMatching[] args) {
        AbbrevationMatching[] cities = new AbbrevationMatching[]{"Pune","Chennai","Bangalore","Delhi","Indore","Kolkatta"};
        System.out.println(cities[2]);
 
     }
}
