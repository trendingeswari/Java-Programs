/*
Replace Nearest Ring with 1s

The program must accept a matrix of size RxC containing Os, 1s and exactly one X as the input. The program must find the full ring near to X with at least one 0. Then the program must modify the matrix by replacing all Os in the full ring with 1s. Finally, the program must print the modified matrix as the output. If there is no such full ring near to X, the program must print the given matrix as it is.
Boundary Condition(s): 2 <= R, C <= 50
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C elements separated by a space.
Output Format:
The first R lines, each contains C elements separated by a space.

Example Input/Output 1:
Input:
5 6
0 1 1 1 0 1
1 1 0 1 1 0
0 1 1 X 0 1
0 0 1 0 0 1
0 0 0 1 1 0
Output:
0 1 1 1 0 1
1 1 1 1 1 0
0 1 1 X 1 1 
0 0 1 1 1 1 
0 0 0 1 1 0
Explanation:
The full ring near to X with at least one 0 is highlighted below. 011101
110110
011X01
001001
000110
After replacing Os in the full ring with 1s, the matrix becomes
011101
111110
0 11X11
001111
000110

Example Input/Output 2: Input:
8 7
1 0 0 1 0 0 0
0 1 1 0 1 1 0
1 1 1 1 1 1 1
1 1 X 1 0 1 0
1 1 1 1 1 1 0
0 1 1 0 1 0 1
0 0 1 0 0 0 1
0 1 1 1 1 1 0
Output: 
1 0 0 1 0 0 0
1 1 1 1 1 1 0
1 1 1 1 1 1 1
1 1 X 1 1 1 0 
1 1 1 1 1 1 0 
1 1 1 1 1 0 1
0 0 1 0 0 0 1
0 1 1 1 1 1 0

Explanation:
The full ring near to X with at least one 0 is highlighted below.
1001000
0110110
1111111
11X1010
1111110
0110101
0010001
0111110
After replacing Os in the full ring with 1s, the matrix becomes
1001000
1111110
1111111
11X1110
1111110
1111101
0010001
0111110
Example Input/Output 3:
Input:
3 4
1 0 1 0
X 0 1 0
0 0 0 0
Output:
1 0 1 0
X 0 1 0
0 0 0 0
 */
import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		char arr[][] = new char[r][c];
		int m= -1;
		int n=-1;
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j] = sc.next().charAt(0);
		    
		    if(arr[i][j]=='X'){
		        m=i;
		        n=j;
		    }}
		    sc.nextLine();
		}
		int ind= 1;
		
		while(true){
		    int row1=m-ind;
		    int row2=m+ind;
		    int col1=n-ind;
		    int col2=n+ind;
		    if(!(0<=row1&&row1<r&&0<=row2&&row2<r&&0<=col1&&col1<c&&0<=col2&&col2<c))
		        break;
		    if(check(arr,m-ind,m+ind,n-ind,n+ind)){
		        makechange(arr,m-ind,m+ind,n-ind,n+ind);
		        break;
		    }
		    ind++;
		}
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(arr[i][j]+ " ");
		    }
		    System.out.println();
		}
	}
	
	public static void makechange(char a[][],int row1,int row2,int col1,int col2){
	    
	    for(int i=row1;i<=row2;i++){
	        for(int j=col1;j<=col2;j++){
	            if(i==row1||i==row2||j==col1||j==col2){
	                change(a,i,j);
	            }
	        }
	    }
	    
	}
	
	public static void change(char a[][],int i,int j){
	    if(0<=i && i<a.length && 0<=j && j<a[0].length){
	        a[i][j] = '1';
	    }
	}
	
	public static boolean check(char a[][],int row1,int row2,int col1,int col2){
	    int r = a.length;
	    int c=a[0].length;
	    if(!(0<=row1&&row1<r&&0<=row2&&row2<=r&& 0<=col1&&col1<=c&&col1<=c))
	    return false;
	    for(int i=row1;i<=row2;i++){
	        for(int j=col1;j<=col2;j++){
	            if(i==row1 || i==row2 ||j==col1||j==col2){
	                if(a[i][j]=='0'){
	                    return true;
	                }
	            }
	        }
	    }
	    return false;
	    
	}
}
