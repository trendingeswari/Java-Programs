/*
 The program must accept an integer N as the input. The program must print the smallest possible
integer formed using the missing digits in N. If it is not possible to form such an integer, the program
must print -1 as the output.
Boundary Condition(s):
1 <= N <= 10^18
Input Format:
The first line contains N.
Output Format:
The first line contains the smallest possible integer formed using the missing digits in N or -1.
Example Input/Output 1:
Input:
14207
Output:
35689
Explanation:
The smallest possible integer formed by the missing digits in 14207 is 35689.
Hence the output is 35689
Example Input/Output 2:
Input:
5481597
Output:
2036
Example Input/Output 3:
Input:
1023456789
Output:
-1

 */
public class SmallestIntegerMissingDigits {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        char N[]=sc.nextLine().toCharArray();
        boolean flag=true,kodi=true,mark=true;
        for(int i=0;i<N.length;i++)
        {
            int num=N[i]-'0';
            for(int j=0;j<arr.length;j++)
            {
                if(num==0)
                {
                    flag=false;
                }
                if(num==arr[j])
                {
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(flag==false&&arr[i]!=-1)
            {
                mark=false;
                System.out.print(arr[i]);
            }
            else if(flag&&arr[i]!=-1&&arr[i]!=0)
            {
                mark=false;
                if(kodi)
                {
                    System.out.print(arr[i]+""+arr[0]);
                    arr[0]=-1;
                    kodi=false;
                }
                else
                {
                    System.out.print(arr[i]);
                }
            }
        }
        if(mark)
        {
            System.out.print("-1");
        }
	}
}
