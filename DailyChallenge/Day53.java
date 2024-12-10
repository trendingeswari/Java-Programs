/*
 
Schedule Practical Exam
There are M laboratories in a college. Each laboratory contains N machines. Machines are in either working or faulty state. The working state of a machine is represented by 1 and the faulty state of a machine is represented by 0. There are X students who take practical exams in those labs. The lab technician wants to schedule the practical examination for the X students based on the following conditions.
- A laboratory is used for a practical exam only if the number of working machines is greater than the number of faulty
machines.
- A student can do his/her practical exam only with a working machine.
- If all X students cannot make their practical exam at the same time, the remaining students will take their practical exam batch by batch.
The program must accept an integer matrix of size MxN containing only 1s and Os representing the state of machines in the M laboratories. The value of X is also passed as the input the program. The program must print the number of batches required to conduct the practical exam for the X students. Then the program must print the minimum number of laboratories used in each batch as the output. If it is not possible to conduct the practical exam, the program must print -1 as the output.

Boundary Condition(s): 2 <= M, N <= 50
1 <= X <= 1000
Input Format:
The first line contains M and N separated by a space.
The next M lines, each contains N integers representing the state of N machines.
The (M+2)nd line contains X.
Output Format:
The first line contains the number of batches required to conduct the practical exam for the X students.
The second line contains the minimum number of laboratories used in each batch separated by a space.

Example Input/Output 1:
Input:
34
1100
0111
1111
25
Output:
4
2221
Explanation:
The first laboratory cannot be used because the number of working machines is not greater than the number of faulty machines.
So the lab technician has only two laboratories to conduct the practical exam for 25 students.
In the 1st batch, at most 7 students can take their practical exams. So the
minimum number of laboratories used is 2.
In the 2nd batch, at most 7 students can take their practical exams. So the minimum number of laboratories used is 2.
In the 3rd batch, at most 7 students can take their practical exams. So the minimum number of laboratories used is 2.
In the 4th batch, the remaining 4 students can take their practical exams in the third laboratory as it contains 4 working machines. So the minimum number of laboratories used is 1.
Here 4 batches are required to conduct the practical exam for 25 students. Hence the output is
4
2221

Example Input/Output 2: Input: 67
0010101
1111101
1010101
1111111
0010010
0111101
110
Output:
5
44444
Example Input/Output 3: Input:
88
10000010
01100011
10000000
10100001
10101100
01110001
00001000
00010011
37
Output:
-1
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat[][] = new int[m][n];
		int workingLabs = 0, workingMachines = 0;
		ArrayList<Integer> l = new ArrayList<>();
		for(int i=0; i<m; i++){
		    int good = 0, fault = 0;
		    for(int j=0; j<n; j++){
		        mat[i][j] = sc.nextInt();
		        if(mat[i][j] == 1) good++;
		        else fault++;
		    }
		    if(good > fault){
		        workingLabs++;
		        workingMachines += good;
		        l.add(good);
		    }
		}
        int x = sc.nextInt();
        Collections.sort(l);
        if(workingLabs <= 0){
            System.out.print("-1");
        }
        else{
            int batches = (x / workingMachines) + (x % workingMachines != 0 ? 1 : 0);
            System.out.println(batches);
            while(x > 0){
                if(x >= workingMachines){
                    System.out.print(workingLabs + " ");
                }
                else{
                    int labsSum = 0, times = 0;
                    for(int i=l.size()-1; i>=0; i--){
                        labsSum += l.get(i);
                        times++;
                        if(labsSum >= x){
                            System.out.print(times);
                            break;
                        }
                    }
                }
                x -= workingMachines;
            }
        }
	}
}
