/*
 break statement
break statement is used to terminate a for, while, or do-while loop.
In the below program, break is used to terminate the for loop execution when the ctr has reached 5.
Thus the program prints only from 1 to 5.
public class Hello {
 public static void main(String[] args) {
 for(int ctr=1;ctr<10;ctr++){
 System.out.println(ctr);

 if(ctr==5){
 break;
 }
 }//eof for loop
 }//eof main method
}//eof class
ProgramID- 69 SKILLRACK
break statement
The program below prints from 2 to 20.
With the help of break statement inside for loop, ensure the program prints only till 10
 */
public class BreakStatement26 {
    public static void main(AbbrevationMatching[] args) {
        for(int ctr=2;ctr<=20;ctr+=2){
        System.out.println(ctr);
        if(ctr==10)
                break;
        }//eof for loop
        }
}
