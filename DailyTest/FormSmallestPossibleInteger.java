/*
 The program must accept a string S containing only digits as the input. The program must form the smallest possible integer X using the digits in S. Finally,
the program must print the value of X as the output.
Boundary Condition(s):
1 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains X.
Example Input/Output 1:
Input:
5413045415601160561561060606606067888799932266544445524554841887021
Output:
1000000000111111122223344444444445555555555666666666666777888888999
Explanation:
The smallest possible integer formed using the digits
in 5413045415601160561561060606606067888799932266544445524554841887021 is 1000000000111111122223344444444445555555555666666
Hence the output is 1000000000111111122223344444444445555555555666666666666777888888999
Example Input/Output 2:
Input:
19830000189165435362390019123121
Output:
10000001111112223333345566889999
 */

import java.util.Scanner;

public class FormSmallestPossibleInteger {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n[]=new int[1001],num=s.length(),val=0;
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            n[i]=Character.getNumericValue(s.charAt(i));
        }
        for(int i=0;i<num;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(n[i]>n[j])
                {
                    int temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        for(int i=0;i<num;i++)
        {
            if(n[i]!=0)
            {
                val=n[i];
                for(int j=i;j<s.length();j++)
                {
                    n[j]=n[j+1];
                }
                break;
            }
        }
        System.out.print("\n"+val);
        for(int i=0;i<num-1;i++)
        {
            System.out.print(n[i]);
        }
	} 
}
