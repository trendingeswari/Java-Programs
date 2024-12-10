/*
Sort based on Last Character

The program must accept a string S containing multiple words as the input. The program must sort the words based on the last character of each word in S. If two or more words have the same last character, then sort those words in the order of their occurrence. Finally, the program must print modified string S as the output.
Boundary Condition(s):
5 <= Length of S <= 1000
1 <= Length of each word in S <= 100
Input Format:
The first line contains S.
Output Format:
The first line contains the modified string S.
Example Input/Output 1:
Input:
Welcome to skillrack
Output:
Welcome skillrack to
Explanation:
Here S = "Welcome to skillrack".
After sorting the words based on the last character, the string becomes "Welcome skillrack to".
Hence the output is
Welcome skillrack to

Example Input/Output 2: Input:
WE WENT TO THE TEMPLE YESTERDAY
Output:
WE THE TEMPLE TO WENT YESTERDAY
 */
import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s[]=sc.nextLine().split("\\s+");
        sc.close();
        char arr[]=new char [s.length];
        for(int i=0;i<s.length;i++)
        {
            arr[i]=s[i].charAt(s[i].length()-1);
            System.out.println(arr[i]);
        }
        for(int i=0;i<s.length;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    String tem=s[i];
                    s[i]=s[j];
                    s[j]=tem;
                }
            }
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]+" ");
        }
	}
}
