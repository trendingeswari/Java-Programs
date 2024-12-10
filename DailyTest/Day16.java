/*
 

The program must accept four string values S1, S2, S3 and S4 and a character matrix as the input. The
program must print Yes if the four string values are present at the four boundaries of the matrix in any
order. Else the program must print No as the output.
Note:
The length of S1, S2, S3 and S4 are always equal L.
The size of the character matrix is always L*L.
Boundary Condition(s):
3 <= Length of S1, S2, S3, S4 <= 50
Input Format:
The first line contains S1, S2, S3 and S4 separated by a space.
The next L lines, each contains L characters separated by a space.
Output Format:
The first line contains Yes or No.
Example Input/Output 1:
Input:
teen meal neam lift
t e e n
f c e e
i u g a
l a e m
Output:
Yes
Explanation:
The four string values are teen, meal, neam and lift.
The four boundaries of the matrix are highlighted below.
t e e n
f c e e
i u g a
l a e m
The first row representing the string teen.
The last column representing the string neam.
The last row representing the string meal.
The first column representing the string lift.
So Yes is printed as the output.
Example Input/Output 2:
Input:
HELLO HOBBY PENNY PHOTO
O T O H P
L E R T E
L X F B N
E T U I N
H O B B Y
Output:
Yes
Example Input/Output 3:
Input:
gifty horse gorch EASSY
g i f t Y
o v e r S
r r t y S
c e t t A
h o r s E
Output:
No
 */

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s[]=sc.nextLine().split("\\s+"),s1=s[0],s2=s[1],s3=s[2],s4=s[3];
        int len=s1.length(),count=0;
        char mat[][]=new char [51][51];
        for(int i=0;i<len;i++)
        {
            String str=sc.nextLine();
            for(int j=0;j<str.length();j++)
            {
                mat[i][j]=str.charAt(j);
            }
        }
        int num=len-2,number=len+num;
        sc.close();
        String val1="",val2="",val3="",val4="",val5="",val6="",val7="",val8="";
        for(int i=0,j=(len*2)-2;i<len*2;i+=2,j-=2)
        {
            val1+=mat[0][i];
            val5+=mat[0][j];
        }
        for(int i=0,j=len-1;i<len;i++,j--)
        {
           val2+=mat[i][number];
           val6+=mat[j][number];
        }
        for(int i=number,j=0;i>=0;i-=2,j+=2)
        {
            val3+=mat[len-1][i];
            val7+=mat[len-1][j];
        }
        for(int i=len-1,j=0;i>=0;i--,j++)
        {
            val4+=mat[i][0];
            val8+=mat[j][0];
        }
        String value1[]={val1,val2,val3,val4,val5,val6,val7,val8},value2[]={s1,s2,s3,s4};
        for(int j=0;j<value2.length;j++)
        {
            for(int i=0;i<value1.length;i++)
            {
                if(value1[i].equals(value2[j]))
                {
                    count++;
                    break;
                }
            }
        }
        if(count==4)
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
	}
}
