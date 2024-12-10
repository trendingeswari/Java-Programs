/*
 
Grid of Integers & Alphabets

The program must accept an integer N as the input. The program must form a grid of size NxN. Then the program must fill the grid with the integers and alphabets based on the following conditions.
- The cells in the grid must be filled from the top row to the bottom row, where each row is filled from left to right.
- For the Xth cell in the grid, if X is even then it must be filled with the integer X. Else the cell must be filled with the Xth lower case alphabet in the English alphabet set. If the Xth cell it filled with a vowel, then it must be replaced with the integer X itself.
Finally, the program must print the values in the grid as the output.
Note: The English alphabet set (a to z) is considered in a cyclic fashion for the Xth alphabet.
Boundary Condition(s): 2 <= N <= 100
Input Format:
The first line contains N.
Output Format:
The first N lines, each contains N values
representing the grid.

Example Input/Output 1:
Input:
3
Output: 12 c
456 989
Explanation:
Here N = 3, so the size of the grid is 3x3. After filling the grid with the integers and the alphabets based on the given
conditions, the grid becomes
12 c 456
989
Example Input/Output 2:
Input:
4
Output: 12c4
56g8
9 10 k 12
m 14 15 16
 */
import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String[][] arr = new String[number][number];
		int k=1;
		String vowels = "aeiou";
		for(int i=0;i<number;i++){
		    for(int j=0;j<number;j++){
		        if(k%2==1){
		            if(vowels.contains(Character.toString((char) (96 + (k%26))))){
		                arr[i][j] = Integer.toString(k);
		            }
		            else{
		                arr[i][j] = Character.toString((char)(96 + (k%26)));
		            }
		        }
		        else{
		            arr[i][j] = Integer.toString(k);
		        }
		        k++;
		    }
		}
        sc.close();
		for(var i: arr){
		    for(var j: i){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
		

	}
}
