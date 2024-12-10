/*
 break statement - nested loops
break statement terminates only the immediate enclosing loop.
In the program below, we have nested for loops.
The break statement terminates only the for loop with bigcounter.
Hence the output of the program is
1
1000
2000
2
1000
2000
public class Hello {
 public static void main(String[] args) {
 for (int smallcounter = 1; smallcounter <= 2; smallcounter++) {
 System.out.println(smallcounter);
 for (int bigcounter = 1000; bigcounter <= 5000; bigcounter += 1000) {
 System.out.println(bigcounter);
 if(bigcounter == 2000){
 break;
 }
 }
 }//eof for loop
 }//eof main method
}//eof class
ProgramID- 70 SKILLRACK
break statement - nested loops
Modify the code below by introducing a break statement so that the program output is as below.
5
10
100
5
10
99
5
10
 */
public class BreakNestedLoop27 {
    public static void main(AbbrevationMatching[] args) {
        int counter=100;
        while(counter > 10){
        for(int innercounter=5;innercounter<=10;innercounter+=5){
        System.out.println(innercounter);
        }
         if(counter==98)
        break;

        System.out.println(counter);
        counter--;
        }
        }
}
