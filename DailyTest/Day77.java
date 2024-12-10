/*
 
Submatrices with Corner X

The program must accept an integer matrix of size NxN and an integer X as the input. The integer X always occurs once in the given matrix. The program must print all the possible square submatrices which contain the integer X in one of the four corners as the output. The square submatrices must be printed in the increasing order of size. If two or more submatrices have the same size, those square submatrices must be printed in the clockwise direction.
Boundary Condition(s):
2 <= N <= 50
1 <= Matrix element value, X <= 10^4
Input Format:
The first line contains N.
The next N lines, each containing N integers separated by a space.
The (N+2)nd line contains X.
Output Format:
The lines containing all the possible square submatrices with the integer X in one of the four
corners.

Example Input/Output 1:
Input:
4
83 58 29 70
50 23 59 54
51 86 82 67
10 60 37 56
59
Output:
59
58 29
23 59
29 70
59 54
59 54
82 67
23.59
86 82
50 23 59
51 86 82
10 60 37

Explanation:
All four possible 2x2 square submatrices which contain the integer 59 in one of the four corners are highlighted below.
83 58 29 70
50 23 59 54
51 86 82 67
10 60 37 56
The only possible 3x3 square submatrix which contains the integer 59 in one of the four corners is highlighted below.
83 58 29 70
50 23 59 54
51 86 82 67
10 60 37 56
Example Input/Output 2: Input:
5
54 84 73 27 83
50 63 42 19 23
21 87 34 16 14
37 38 77 90 57
43 11 79 47 64 34

Output:
34
63 42
87 34
42 19
34 16
34 16
77 90
87 34
38 77
54 84 73
50 63 42
21 87 34
73 27 83
42 19 23
34 16 14
34 16 14
77 90 57
79 47 64
21 87 34
37 38 77
43 11 79
Max Execution Time Limit: 50 millisecs
 */
public class Day77 {
    
}
