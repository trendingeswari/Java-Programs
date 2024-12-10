/*
 The program must accept N integers and an integer K as the input. 
 The program must print Yes if all the integers in any of the subsets of size K among the N integers are sorted (ascending order or descending order). 
 Else the program must print No as the output. 
 Boundary Condition(s): 2 <= K <= N <= 100 
 Input Format: 
 The first line contains N and K separated by a space. The second line contains N integers separated by a space. 
 Output Format: 
 The first line contains Yes or No. 
 Example Input/Output 1: 
 Input: 
 5 3 
 9 5 7 8 1 
 Output: 
 Yes 
 Explanation: The integers in the first subset of size 3 are 9, 5 and 7. 
 The integers in the second subset of size 3 are 5, 7 and 8. The integers in the third subset of size 3 are 7, 8 and 1. 
 The integers in the second subset are sorted in ascending order. 
 Hence the output is Yes 
 Example Input/Output 2: 
 Input: 
 12 4 
 3 1 12 9 11 7 10 8 2 5 6 4 
 Output: 
 No 
 Example Input/Output 3: 
 Input: 
 4 2 
 98 65 21 10 
 Output: 
 Yes
 */

import java.util.Scanner;

public class SubsetSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            int gcount=0,acount=0;
            if(n-i>=k)
            {
                int b[]=new int[1001],ind=0;
                for(int j=i,count=1;count<=k;j++,count++)
                {
                    b[ind++]=a[j];
                }
                boolean flag=true,kodi=true;
                if(b[0]<b[1])
                {
                    for(int j=0;j<ind-1;j++)
                    {
                        if(b[j]>b[j+1])
                        {
                            flag=false;
                        }
                    }
                    if(flag)
                    {
                        System.out.print("Yes");
                        return ;
                    }
                }
                if(b[i]>b[1])
                {
                    for(int j=0;j<ind-1;j++)
                    {
                        if(b[j]<b[j+1])
                        {
                            kodi=false;
                        }
                    }
                    if(kodi)
                    {
                        System.out.print("Yes");
                        return;
                    }
                }
            }
        }
        System.out.print("No");
    }
}
