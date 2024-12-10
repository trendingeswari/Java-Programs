/*
 
Degree Pattern

The program must accept a string S and an integer X as the input. The program must rotate the string S by X degrees and print the string S based on the following conditions.
Consider the string S as "Apple" and its 8 possible rotations are given below.
e***e***e
*|*****
**p*p*p**
***ppp***
elppApple
***ppp***
**p*p*p**
*|**|**|*
e***e***e
The characters from the center to the east represent the 0-degree or 360-degree rotation of the string S.
The characters from the center to the south-east represent the 45-degree rotation of the string S.
The characters from the center to the south represent the 90-degree rotation of the string S. The characters from the center to the south-west represent the 135-degree rotation of the string S.
The characters from the center to the west represent the 180-degree rotation of the string S. The characters from the center to the north-west represent the 225-degree rotation of the string S.
The characters from the center to the north represent the 270-degree rotation of the string S. The characters from the center to the north-east represent the 315-degree rotation of the string S.
The value of the degree X can be any one of the following.
0, 45, 90, 135, 180, 225, 270, 315 and 360.

Boundary Condition(s): 1 <= Length of S <= 100
Input Format:
The first line contains S.
The second line contains X.
Output Format:
The line(s) contain the characters denoting the rotated string S.
Example Input/Output 1:
Input:
yellow
0
Output: yellow
Explanation:
Here S = "yellow" and X = 0. So the string S is printed as it is.

Example Input/Output 2:
Input:
CART
45
Output:
C
*A
**R
***T
Example Input/Output 3:
Input:
delhi
90
Output:
d
e
l
h
i

Example Input/Output 4:
Input: fifteen
135
Output:
*******
******
****f
****
**e
*e
n
Example Input/Output 5:
Input:
donkey
180
Output:
yeknod
Example Input/Output 6:
Input:
india
225
Output:
a
*i
**d
***n
****

Example Input/Output 7:
Input:
MASTER
270
Output:
R
E
T
S
A
M

Example Input/Output 8:
Input:
library
315
Output:
******y
****a
***
**b
Example Input/Output 9:
Input:
abdevilliers
360
Output:
abdevilliers
 */
import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        char s[]=str.toCharArray();
        int N=sc.nextInt(),len=s.length,val=0,num=len-1;
        if(N==0||N==360)
        {
            System.out.print(str);
        }
        else if(N==180)
        {
            for(int i=len-1;i>=0;i--)
            {
                System.out.print(s[i]);
            }
        }
        else if(N==270 ||N==90)
        {
            for(int i=0,j=len-1;i<len;i++,j--)
            {
                if(N==90)
                {
                    System.out.println(s[i]);
                }
                else if(N==270)
                {
                    System.out.println(s[j]);
                }
            }
        }
        else if(N==45 || N==225 || N==135 || N==315)
        {
            for(int i=0;i<len;i++)
            {
                if(N==45)
                {
                    for(int j=0;j<=i;j++)
                    {
                        if(i==j)
                        {
                            System.out.print(s[val++]);
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }
                }
                else if(N==225)
                {
                    for(int j=0;j<=i;j++)
                    {
                        if(i==j)
                        {
                            System.out.print(s[num--]);
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }
                }
                else if(N==135)
                {
                    for(int j=0;j<(len-i);j++)
                    {
                        if(j==(len-i-1))
                        {
                            System.out.print(s[val++]);
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }
                }
                else if(N==315)
                {
                    for(int j=0;j<(len-i);j++)
                    {
                        if(j==(len-i-1))
                        {
                            System.out.print(s[num--]);
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
        sc.close();
	}
}
