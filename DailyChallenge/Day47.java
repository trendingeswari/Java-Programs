/*
 
Common Substring - Three String Values
The program must accept three string values S1, S2 and S3 as the input. The program must print the longest common substring in S1, S2 and S3. If there are two or more longest common substring values, the program must print the first occurring longest common substring. If there is no such longest common substring, the program must print -1 as the output.
Boundary Condition(s):
2 <= Length of S1, S2, S3 <= 100
Input Format:
The first line contains S1, S2 and S3 separated by a space.
Output Format:
The first line contains the longest common substring in S1, S2 and S3 or -1.
Example Input/Output 1:
Input:
Abcdefghxyz xyz Abcxyz
Output:
xyz
Explanation:
The longest common substring in Abcdefghxyz, xyz and Abcxyz is xyz. So xyz is printed as the output.
Example Input/Output 2:
Input:
Pqrstuv Ab@cdefghijklmn@
Output:
-1
 */
import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s[]=sc.nextLine().split("\\s+"),s1=s[0],s2=s[1],s3=s[2],str="";
        sc.close();
        int l1=s1.length(),l2=s2.length(),l3=s3.length();
        if(l1<l2 && l1<l3)
        {
            str=s1;
        }
        else if(l2<l3)
        {
            str=s2;
        }
        else
        {
            str=s3;
        }
        char val[]=str.toCharArray(),temp[]=str.toCharArray();
        int count=0,l=val.length,t=l;
        boolean flag=true;
        for(int i=0;i<l;i++)
        {
            String r="";
            for(int j=0;j<t;j++)
            {
                r+=val[j];
            }
            if(s1.contains(r))
            {
                count++;
            }
            if(s2.contains(r))
            {
                count++;
            }
            if(s3.contains(r))
            {
                count++;
            }
            if(count==3)
            {
                System.out.println(r);
                flag=false;
                break;
            }
            t--;
            for(int j=0;j<t;j++)
            {
                val[j]=temp[j];
            }
            count=0;
        }
        if(flag)
        {
            System.out.print("-1");
        }
	}
}
