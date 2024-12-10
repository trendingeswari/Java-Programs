/*
 The program must accept an integer matrix containing only 1's and 0's as the input. The program must
sort the rows of the matrix based on the decimal equivalent of each row. Then the program must print
the modified matrix as the output.
Boundary Condition(s):
2 <= R, C <= 25
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contain C integers separated by a space.
Output Format:
The first R lines, each contain C integers separated by a space.
Example Input/Output 1:
Input:
5 3
1 1 1
0 1 0
0 1 0
1 0 0
0 1 1
Output:
0 1 0
0 1 0
0 1 1
1 0 0
1 1 1
Explanation:
The decimal equivalent of the 1
st
row (1 1 1) is 7.
The decimal equivalent of the 2
nd row (0 1 0) is 2.
The decimal equivalent of the 3
rd
row (0 1 0) is 2.
The decimal equivalent of the 4
th
row (1 0 0) is 4.
The decimal equivalent of the 5
th row (0 1 1) is 3.
After sorting the rows based on their decimal equivalent, the matrix becomes
0 1 0
0 1 0
0 1 1
1 0 0
1 1 1
Example Input/Output 2:
Input:
2 5
2/8/24, 12:12 AM skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT
https://www.skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT 2/2
1 0 1 0 1
0 0 1 1 1
Output:
0 0 1 1 1
1 0 1 0 1
 */
import java.util.*;
public class SortRow_BinaryMatrix {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(),c = sc.nextInt();
		int arr[] = new int[r],lr[][] = new int[r][c];
		List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
		String t = "";
		for(int i=0;i<r;i++,t="") {
		    for(int j=0;j<c;j++) {
		        lr[i][j] = sc.nextInt();
		        t += Integer.toString(lr[i][j]);
		    }
		    arr[i] = Integer.parseInt(t,2);
		}
        sc.close();
		for(int i=0;i<r;i++) list.add(new AbstractMap.SimpleEntry<>(i,arr[i]));
		Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
		    public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
		        return o1.getValue().compareTo(o2.getValue());
		    }
		});
		for(Map.Entry<Integer,Integer> entry:list) {
		    for(int j=0;j<c;j++) {
		        System.out.print(lr[entry.getKey()][j]+" ");
		    }
		    System.out.println();
		}
	}
    /*public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt(),a[][]=new int [r][c],b[]=new int[101],ind=0,arr[]=new int[1001],val=0,deci[]=new int[1001],bin[]=new int[1001];
        for(int i=0;i<r;i++)
        {
            int num=0,k=0,rem=0,dec=0;
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
                num=(num*10)+a[i][j];
            }
            while(num!=0)
            {
                rem=num%10;
                num/=10;
                dec+=rem*Math.pow(2,k);
                k++;
            }b[ind++]=dec;
            deci[i]=dec;
            bin[i]=j;
        }
       // Arrays.sort(b,0,ind-1);
        for(int i=0;i<ind;i++)
        {
            for(int j=i+1;j<ind;j++)
            {
                if(b[i]>b[j])
                {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<ind;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(deci[j]==b[i])
                {
                    System.out.print(bin);
                }
            }
            System.out.println();
        }
	}*/
}



