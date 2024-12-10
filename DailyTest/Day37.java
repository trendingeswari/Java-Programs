/*
Sort Integers - Reverse

The program must accept N integers as the input. The program sort the N integers based on the reversed value in the ascending order. Then the program must print the N sorted integers as the output. If two or more integers have the same value when reversed, then the program must sort those integers in the order of their occurrence.
Boundary Condition(s):
2 <= N <= 100
1 <= Each integer value <= 10^5
Input Format:
The first line contains N.
The second line contains N integers separated by a space.
Output Format:
The first line contains N integers separated by a space.

Example Input/Output 1:
Input:
5
6 17 32 18 11
Output:
6 11 32 17 18
Explanation:
The given 5 integers are 6, 17, 32, 18 and 11.
The reversed values of the 5 integers are 6, 71, 23, 81 and 11.
After sorting the given 5 integers based on the reversed value in ascending order, the integers
become 6, 11, 32, 17 and 18.
Hence the output is
6 11 32 17 18
Example Input/Output 2:
Input:
6
29 50 18 76 84 300
Output:
300 50 84 76 18 29
Example Input/Output 3:
Input:
4
200 20 2000 2
Output:
200 20 2000 2
 */
import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++)
        { arr[i] = sc.nextInt();} // input
        for(int pass = 0;pass<n-1;pass++) // sorting
        { int ctr = 0;
          for(int comp = 0;comp < n - 1 - pass;comp++)
          { StringBuilder temp1 = new StringBuilder(Integer.toString(arr[comp]));
            StringBuilder temp2 = new StringBuilder(Integer.toString(arr[comp + 1]));
            temp1.reverse();
            temp2.reverse();
            int x1 = Integer.parseInt(temp1.toString());
            int x2 = Integer.parseInt(temp2.toString());
            if(x1 > x2)
            { int temp = arr[comp];
              arr[comp] = arr[comp + 1];
              arr[comp + 1] = temp;
              ctr = 1;} }
              if(ctr == 0)
              { break;} } 
          for(int r = 0;r<n;r++)
          { System.out.print(arr[r]+" ");} 
                sc.close();
        }
        /*
         or 

         public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	List<Integer> a=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		   a.add(sc.nextInt()); 
		}
		Collections.sort(a, new Comparator<Integer>()
		{
		    @Override
		    public int compare(Integer a,Integer b)
		    {
		        return reverse(a)-reverse(b);
		    }
		});
		
		for(Integer i:a)
		{
		    System.out.print(i+" ");
		}

	}
	
	public static int reverse(int a)
	{
	    int s=0;
	    while(a>0)
	    {
	        int r=a%10;
	        s=s*10+r;
	        a/=10;
	        
	    }
	    
	    return s;
	}

    or 

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		TreeMap<Integer,ArrayList<Integer>>mp=new TreeMap<>();
		while(n-->0){
		    int x=in.nextInt();
		    int rev=Integer.parseInt(new StringBuilder(x+"").reverse().toString());
		    if(mp.containsKey(rev)){
		        mp.get(rev).add(x);
		    }else{
		        ArrayList<Integer>al=new ArrayList<>();
		        al.add(x);
		        mp.put(rev,al);
		    }
		}for(Map.Entry<Integer,ArrayList<Integer>>i:mp.entrySet()){
		    ArrayList<Integer>al=i.getValue();
		    for(int ii:al)System.out.print(ii+" ");
		}

	}

    or

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> al = new ArrayList<>();
		for(int i=0;i<n;i++){
		    al.add(sc.nextInt());
		}
		Collections.sort(al,(x,y)-> reverse(x)-reverse(y));
for(int i : al){
    System.out.print(i+" ");
}
	}
	public static int reverse(int n){
	    int rev = 0;
	    while(n > 0){
	        rev = (rev * 10)+(n % 10);
	        n /= 10;
	    }
	    return rev;
	}
         */
}
