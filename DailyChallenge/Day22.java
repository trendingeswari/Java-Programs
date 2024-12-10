/*
 SuperMarket - Available Product

 vIn a supermarket, there are X products that are listed on a board. Each product has a unique number.
A boy wants to purchase Y products from the supermarket. The program must accept X integers
representing the unique number of X products and Y integers representing the unique number of Y
products as the input. The program must print the unique number of all the products that are available
to the boy in the order of their occurrence(i.e., the order mentioned in the board) as the output.
Note: At least one product is always available in the supermarket from the list of Y products.
Boundary Condition(s):
1 <= X, Y <= 100
1 <= Unique number of each product <= 100
Input Format:
The first line contains X and Y separated by a space.
The second line contains X integers separated by a space.
The third line contains Y integers separated by a space.
Output Format:
The first line contains the integers as per the given condition.
Example Input/Output 1:
Input:
7 3
3 4 6 2 7 1 9
2 1 6
Output:
6 2 1
Explanation:
The products available in the supermarket are given below.
3 4 6 2 7 1 9
The boy wants to purchase 3 products that are given below.
2 1 6
Here all three products are available for the boy from the supermarket. So they are printed in the order
of their occurrence.
Hence the output is
6 2 1
Example Input/Output 2:
Input:
5 5
5 4 3 7 10
7 3 6 9 10
Output:
3 7 10
 */

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int X=sc.nextInt(),Y=sc.nextInt(),arrX[]=new int[X],arrY[]=new int[Y];
        for(int i=0;i<X;i++)
        {
            arrX[i]=sc.nextInt();
        }
        for(int i=0;i<Y;i++)
        {
            arrY[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<X;i++){
            for(int j=0;j<Y;j++)
            {
                if(arrY[j]==arrX[i])
                {
                    System.out.print(arrX[i]+" ");
                }
            }
        }
	}
}
