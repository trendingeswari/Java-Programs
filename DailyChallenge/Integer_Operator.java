/*
 The program must accept N integers and a string containing N-1 arithmetic operators (+, -, * and /). The program must form an arithmetic expression E by interlacing the N integers and the N-1 operators. Then the program must evaluate the expression E from left to right and print the result R as the output. Note: When an integer is divided by another integer, the quotient will be taken for the evaluation. 
 Boundary Condition(s): 2 <= N <= 100 1 <= Each integer value <= 10^5 
 Input Format: The first line contains N. The second line contains N integers separated by a space. The third line contains N-1 arithmetic operators. 
 Output Format: The first line contains the result R. 
 Example Input/Output 1: 
 Input: 
 4 
 2 5 6 7 
 +-+ 
 Output: 
 8 
 Explanation: The expression E is formed as 2 + 5 - 6 + 7. The result of the above expression is 8, so 8 is printed as the output. 
 Example Input/Output 2: 
 Input: 
 7 
 10 5 8 15 68 10 3 
 ++ * / * /
 Output: 
 16 
 Explanation: The expression E is formed as 10 + 5 + 8 * 15 / 68 * 10 / 3. The result of the above expression is 16, so 16 is printed as the output.
 */
import java.util.*;
public class Integer_Operator {
    public static int calc(int a,char op,int b){
        switch(op){
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': return a/b;
            default : return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        String a[]=sc.nextLine().split(" "),operand=sc.nextLine();
        sc.close();
        int sum=Integer.parseInt(a[0]);
        for(int i=1;i<N;i++){
            sum=calc(sum,operand.charAt(i-1),Integer.parseInt(a[i]));
        }
        System.out.println(sum);
	}
}
