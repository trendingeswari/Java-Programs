/*
 continue statement
The continue statement skips the remaining statements in the current iteration of a for, while, or dowhile loop.
In the below program we use continue statement to print only the even numbers from 1 to 10.
public class Hello {
 public static void main(String[] args) {
 for(int counter=1;counter<=10;counter++){
 if(counter%2 == 1){
 //DO NOT PRINT ODD NUMBERS
 continue;
 }

 System.out.println(counter);
 }
 }
}
ProgramID- 71 SKILLRACK
continue statement
Use continue statement in the program below to ensure only the numbers divisible by 5 from 1 to
25 are printed.
 */
public class continueStatement28 {
    public static void main(AbbrevationMatching[] args) {
        for (int counter = 1; counter <= 25; counter++) {
            if(counter%5!=0)
            continue;
        System.out.println(counter);
        }
        } 
}
