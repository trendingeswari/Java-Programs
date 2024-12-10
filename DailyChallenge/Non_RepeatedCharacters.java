/*
 The program must accept a string S as the input. The program must print all the non-repeated
characters in the string S in the order of their occurrence as the output.
Note: At least one non-repeated character is always present in the string S.
Boundary Condition(s):
1 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains the non-repeated characters in the string S separated by a space.
Example Input/Output 1:
Input:
Japan
Output:
J p n
Explanation:
Here the string is Japan.
The characters J, p and n are not repeated in the string Japan.
Hence the output is J p n
Example Input/Output 2:
Input:
fireFighter
Output:
f F g h t
 */
import java.util.*;
public class Non_RepeatedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[]=sc.nextLine().toCharArray();
        int len=s.length;
        for(int i=0;i<len;i++)
        {
            boolean flag=false;
            for(int j=i+1;j<len;j++)
            {
                if(s[i]==s[j])
                {
                    flag=true;;
                    s[j]=',';
                }
            }
            if(flag)
            {
                s[i]='.';
            }
        }
        for(int i=0;i<len;i++)
        {
            if(s[i]=='.'||s[i]==',')
            {
                continue;
            }
            else{
                System.out.print(s[i]+" ");
            }
        }
	}
}
