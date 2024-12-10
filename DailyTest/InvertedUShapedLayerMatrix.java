/*
 The program must accept a character matrix of size RxC as the input. The program must print all the
characters in each inverted U-shaped layer in the given matrix (in a separate line) as the output.
Note: The value of C is always even.
Boundary Condition(s):
2 <= R, C <= 100
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C characters separated by a space.
Output Format:
The first C/2 lines containing all the characters in each inverted U-shaped layer.
Example Input/Output 1:
Input:
5 4
# x s b 
n k h n 
C $ O @ 
w # L p 
P L Q b 
Output:
P w C n # x s b n @ p b
L # $ k h O L Q
Explanation:
The inverted U-shaped layers in the 5x4 matrix are highlighted below.
# x s b 
n k h n 
C $ O @ 
w # L p 
P L Q b
Hence the output is
P w C n # x s b n @ p b
L # $ k h O L Q
Example Input/Output 2:
Input:
8 6
N z b P f H 
J p g L ! m 
X w x Y K g 
c q o G @ m 
V k D s e C 
l y o O h O 
5/20/24, 9:54 PM skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT
https://www.skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT 1/2
F E T U Z l 
g ! l a z 2 
Output:
g F l V c X J N z b P f H m g m C O l 2
! E y k q w p g L ! K @ e h Z z
l T o D o x Y G s O U a
Example Input/Output 3:
Input:
3 6
v r p i m k 
h a d s i r 
t c r k t b
Output:
t h v r p i m k r b 
c a d s i t 
r k

 */
import java.util.Scanner;
public class InvertedUShapedLayerMatrix {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int R=sc.nextInt(),C=sc.nextInt();
        char arr[][]=new char [R] [C];
        sc.nextLine();
        for(int i=0;i<R;i++)
        {
            String s=sc.nextLine().replace(" ","");
            for(int j=0;j<C;j++)
            {
                arr[i][j]=s.charAt(j);
            }
        }
        sc.close();
        int start=R-1,mid=1,end=0,count=1,val=0,sind=0,eind=C-1;
        for(int i=0;i<C/2;i++)
        {
            for(int j=start;j>=val;j--)
            {
                System.out.print(arr[j][sind]+" ");
            }
            for(int j=mid;j<C-count;j++)
            {
                System.out.print(arr[sind][j]+" ");
            }
            for(int j=end;j<R;j++)
            {
                System.out.print(arr[j][eind]+" ");
            }
            val++;
            count++;
            end++;
            sind++;
            eind--;
            mid++;
            System.out.println();
        }
	}
}
