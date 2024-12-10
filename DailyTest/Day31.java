/*
Interview - Students Selection

In a college, N students have attended a campus interview. The name of each student and the marks scored in the technical round T and the aptitude round A are passed as the input to the program. The interviewer has decided to select the students who have scored at least X marks in the technical round and Y marks in the aptitude round. The values of X and Y are also passed as the input to the program. The program must sort and print the names of selected students based on the marks scored in the technical round in descending order. If two or more students have scored the same marks in the technical round, then those students must be sorted based on the marks scored in the aptitude round in descending order. If two or more students have scored the same marks in both the technical round and the aptitude round, then those students must be sorted based on their names in ascending order. If there is no such student, then the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 50
1 <= Length each student's name <= 20
0 <= T, A, X, Y <= 100
Input Format:
The first line contains N.
The next N lines, each contains the name of a student and the marks scored in the technical round, the aptitude round separated by a space.
The (N+2)nd line contains X and Y separated by a space.
Output Format:
The line(s) containing the names of the selected students or the first line contains -1 as per the given condition.

Example Input/Output 1: Input:
6
xyz 65 86
PQR 95 90
BCD 70 92
mno 95 96
Efg 70 90
ABC 70 92
70 85
Output:
mno
PQR
ABC
BCD
Efg

Explanation:
Here X = 70 and Y = 85.
The names of the students who have scored at least 70 marks in the technical round and 85 marks in the aptitude round are PQR, BCD, mno, Efg and ABC.
After sorting the students based on their technical score in descending order, the names
become PQR, mno, BCD, Efg and ABC.
Here, the students PQR and mno scored the same marks (95) in the technical round. So they are sorted based on their aptitude marks in descending order.
Similarly, the students BCD, Efg and ABC the scored same marks (70) in the technical round.
So they are sorted based on their aptitude marks in descending order.
The students BCD and ABC scored the same marks in both the technical round and the
aptitude round. So they are sorted based on their names in ascending order.
Hence the output is
mno
PQR
ABC
BCD
Efg
Example Input/Output 2: Input:
3
EFG 60 73
abcd 75 45
Pqr 55 46
75 75
Output:
-1
 */
public class Day31 {
    
}
