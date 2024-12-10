/*
Form S1 from S2

The program must accept two string values S1 and S2 and an integer X as the input. The program must print YES, if S1 can be formed from the alphabets of S2 for at least X times. Else the program must print NO as the output.
Note: The string values S1 and S2 are case sensitive.
Boundary Condition(s):
2 <= Length of S1 and S2 <= 1000
1 <= X <= 50
Input Format:
The first line contains $1.
The second line contains S2.
The third line contains X.
Output Format:
The first line contains YES or NO.
Example Input/Output 1:
Input:
Laptop
2
lapoLptpAtpLoaks
Output: YES
Explanation:
Here X=2, the string S1 is Laptop and the string S2 is lapoLptpAtpLoaks.
The string Laptop can be formed from the alphabets of lapoLptpAtpLoaks for 2 times. Hence the output is YES

Example Input/Output 2: Input:
CONTINENT
CpTkOiNqunptsNe
1
Output:
NO
Example Input/Output 3:
Input:
Abc#123
a#cE#23pb1bA12ACLK13LAb#32cP
3
Output: YES
 */
import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner t=new Scanner(System.in);
		int n=t.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j]=t.nextInt();
		    }
		}
		System.out.print(max(arr,0,0,n,n)+" ");
		int count=1,val=1;
		while(count<(2*n-1)){
		    if(count%2==1)
		    {
		        System.out.print(max(arr,0,0,n-val,n-val)+" ");
		    }
		    else{
		        System.out.print(max(arr,val,val,n,n)+" ");
		        val++;
		    }
		    count++;
		}

	}
	public static int max(int arr[][],int startr,int startc,int endr,int endc)
	{
	    int maxi=Integer.MIN_VALUE;
	    for(int i=startr;i<endr;i++)
	    {
	        for(int j=startc;j<endc;j++)
	        {
	            maxi=Math.max(maxi,arr[i][j]);
	        }
	    }
	    return maxi;
	}
    /*
    or 

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int arr[][]=new int[a][a];
		int m=0;
		for(int i=0;i<a;i++){
		    for(int j=0;j<a;j++){
		        arr[i][j]=sc.nextInt();
		        if(m<arr[i][j]){
		            m=arr[i][j];}}}
		System.out.print(m+" ");
		int f=0,b=a,z=0;
		for(int k=1;k<(a*2)-1;k++){
		    m=0;
		    if(f==0){
		      b--;
		      for(int i=0;i<b;i++){
		          for(int j=0;j<b;j++){
		              if(m<arr[i][j]){
		                  m=arr[i][j];
		              }}}
		      System.out.print(m+" ");
		      f=1;
		    }
		    else if(f==1){
		        z++;
		        for(int i=z;i<a;i++){
		            for(int j=z;j<a;j++){
		                if(m<arr[i][j]){
		                    m=arr[i][j];
		                }}}
		        System.out.print(m+" ");
		        f=0;
		    }}}
        
        or my be i know it is right or not

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String s1=sc.nextLine(),s2=sc.nextLine();
        int X=sc.nextInt(),flag=0;
        char c1[]=s1.toCharArray(),c2[]=s2.toCharArray();
        sc.close();
        for(int i=0;i<X;i++)
        {
            int count=0;
            for(int j=0;j<c1.length;j++)
            {
                for(int k=0;k<c2.length;k++)
                {
                    if(c1[j]==c2[k])
                    {
                        c2[k]='.';
                        count++;
                        break;
                    }
                }
            }
            if(count==c1.length)
            {
                flag++;
            }
        }
        if(flag==X)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
	}*/
}
