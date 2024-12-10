/*
 
Integers - Unique Digits

The program must accept an array of N integers as the input. The program must print the integer(s) in a single line until no digit is repeated throughout the integers. In the same way, the program must print the integers of the given array in remaining lines as the output. If there is no such integer, the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 100
1 <= Each integer value <= 10^5
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The line(s), each containing the integer value(s) separated by a space.

Example Input/Output 1:
Input:
7
12 5 98 54 71 44 123
Output:
12 5 98
54 71 123
Explanation:
The given 7 integers are 12, 5, 98, 54, 71, 44 and 123.
In the first 3 integers, the digits have not occurred more than once. [12, 5, 98]
In the next two integers, the digits have not occurred more than once. [54, 71]
In the 6th integer 44, the digit 4 has repeated. So it is not printed.
In the last integer, the digits have not occurred more than once. [123]
Hence the output is
12 5 98
54 71
123
Example Input/Output 2:
Input:
10
28 57 49 89 81 91 60 46 66 77
Output:
28 57 49
89
81
91 60
46
Example Input/Output 3: Input:
4
202 115 66 4124
 */
import java.util.Arrays;
import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,c=0,d=0,e=0,v=0,f=0;
        String arr[]=new String[n];
        sc.close();
        for(i=0;i<n;i++)
        arr[i]=sc.next();
        int arr1[]=new int[10];
        for(i=0;i<n;){
            String s1=arr[i];
            for(j=0;j<s1.length();j++){
                int x=(int)(s1.charAt(j))-48;
                if(arr1[x]==0){
                    arr1[x]=1;
                    c++;
                }
                else{
                    d=1;
                    break;
                }
            }
            if(c==s1.length()){
            System.out.print(s1+" ");
            e=1;
            i++;
            v=0;
            f=1;
            }
            else if(e==1 && d==1){
                v++;
                Arrays.fill(arr1,0);
                if(v==1 && f==1){
                System.out.println();
                f=0;
                }
                if(v==2){
                    i++;
                    v=0;
                }
            }
            else{
            Arrays.fill(arr1,0);
            i++;
            }
            c=0;
            d=0;
        }
        if(e==0)
        System.out.print("-1");
        System.out.print("");
}
/*
 By bro
 public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        long N=sc.nextLong();
        long arr[]=new long[(int)N];
        Boolean isPrinted = false;
        System.out.println();
        for(long i=0;i<N;i++)
        {
            arr[(int)i]=sc.nextLong();
        }
        long a[]=new long[10];
        for(long i=0;i<N;i++){
            long temp=arr[(int)i],numFreq[] = new long[(int)10];
            while(temp>0){
                if(numFreq[(int)temp%10]!=0){
                    break;
                }
                numFreq[(int)temp%10]++;
                temp/=10;
            }
            long t = arr[(int)i];
            if(temp==0){
                while(t>0){
                    if(a[(int)t%10]!=0){
                        System.out.println();
                        Arrays.fill(a,0);
                        i--;
                        break;
                    }
                    a[(int)t%10]++;
                    t/=10;
                }
            }
            if(t==0){
                System.out.print(arr[(int)i]+" ");
                isPrinted = true;
            }
        }
        if(!isPrinted){
            System.out.println("-1");
        }
    }
 */
}
