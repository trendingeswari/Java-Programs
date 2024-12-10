/*
 The program must accept an integer matrix of size RxC and an integer N as the input. The program
must form a list of integers by traversing the matrix spirally in clockwise direction. Then the program
must shift the integers to the right by N positions. Finally, the program must print the modified list of
integers in the form of RxC matrix as the output.
Boundary Condition(s):
2 <= R, C <= 100
1 <= N <= 1000
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
The (R+2)nd
line contains N.
Output Format:
The first R lines, each contains C integers separated by a space.
Example Input/Output 1:
Input:
4 4
10 20 30 40
50 60 70 80
90 91 92 93
94 95 96 97
5
Output:
50 60 70 92
91 10 20 30
40 80 93 97
96 95 94 90
Explanation:
The list of integers formed by traversing the 4x4 matrix spirally in clockwise direction is given below.
10 20 30 40 80 93 97 96 95 94 90 50 60 70 92 91
Here N = 5.
After shifting the integers to the right by 5 positions, the list becomes 50 60 70 92 91 10 20 30 40 80
93 97 96 95 94 90.
So they are printed in the form of 4x4 matrix.
50 60 70 92
91 10 20 30
40 80 93 97
96 95 94 90
Example Input/Output 2:
Input:
5 3
5/17/24, 10:24 PM skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT
https://www.skillrack.com/faces/candidate/dailychallenge.xhtml?k=DT 1/2
1 2 3
4 5 6
7 8 9
2 3 4
8 9 1
18
Output:
5 8 3
1 2 3
6 9 4
1 9 8
2 7 4
 */
public class MatrixRightShift {
    
}
