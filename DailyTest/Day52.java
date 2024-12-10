/*
Split String & Shift Left

The program must accept a string S and an integer K as the input. The program must split the string S into substrings, each of length K. If the length of S is not divisible by K, then keep the last substring as it is. The program must print the substrings of S based on the following conditions.
-The first substring is printed in the first line.
- The program must shift the characters in the second substring to the left by 1 position. Then the second substring is printed in the second line.
- The program must shift the characters in the third substring to the left by 2 positions. Then the third substring is printed in the third line.
- Similarly, the remaining substrings are printed as the output.
- If the length of the last substring is less than K, then the program must print the asterisks for the remaining characters.
Boundary Condition(s):
2 <= Length of S <= 1000
2 < K <= 100
Input Format:
The first line contains S and K separated by a space.
Output Format:
The lines containing the substrings of S based on the given conditions.

Example Input/Output 1: Input:
technical 3
Output:
tec
nih
Ica
Explanation:
Here S = technical and K = 3.
The substrings of S are tec, hni and cal.
The first substring is printed in the first line without any modification.
tec
After shifting the characters in the second substring by 1 position, the second substring is printed in the second line.
nih
After shifting the characters in the third substring by 2 positions, the third substring is printed in the third line.
Ica
Example Input/Output 2:
Input:
SKILLRACK 4
Output:
SKIL
RACL
K***
 */
import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s[]=sc.nextLine().split("\\s+");
        char str[]=s[0].toCharArray();
        int N=Integer.parseInt(s[1]),len=str.length,num=0,cout=-1;
        sc.close();
        while(num<len)
        {
            char arr[]=new char[N];
            int ind=0;
            cout++;
            boolean flag=true;
            for(int i=num,count=1;count<=N;i++,count++)
            {
                if(i<len)
                {
                    arr[ind++]=str[i];
                }
                else
                {
                    arr[ind++]='*';
                    flag=false;
                }
            }
            String s1=new String(arr);
            num+=N;
            if(flag==false)
            {
                System.out.print(s1);
            }
            else
            {
                String ans=s1.substring(cout)+s1.substring(0,cout);
                System.out.println(ans);
            }
        }
	}
}
