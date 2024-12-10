/*
Function - squareTheEnds

You must implement the function squareTheEnds(int N) which accepts an integer N as the input. The function must form an integer X by replacing the first and last digits of N with its square value. Then the function must return the integer X.
Note: Do not define the main() function as it is already defined. You just return the integer X as per the given condition. The value of X will be printed by the main() function.
Boundary Condition(s):
10 <= N <= 10^7
Example Input/Output 1:
Input:
888
Output:
64864
Explanation:
Here N = 888.
After replacing the first and last digits of the integer 888 with its square value, the integer becomes 64864.
So 64864 is printed as the output.
Example Input/Output 2:
Input:
5000
Output:
25000
Example Input/Output 3:
Input:
123
Output:
129
 */
//public class Day29 {
#include <stdio.h> #include <stdlib.h>
int squareTheEnds (int N)
{
int dec=(int)log10(N)+1;
if(dec==1)
{
int summa=pow(N,2);
return summa;
}
int last=N%10,digit=(int)log10(N),first=(int)(N/pow(10,digit)), sum=0;
N/=10;
int num=pow(first,2);
sum num;
int arr[10001],ind=0;
while(N>9)
arr[ind++]=N%10;
N/=10;
{
}
{
sum=(sum*10)+arr[i];
}
for(int i=ind-1;i>=0; i--){
int number=pow(last,2),digi=(int)log10(number)+1, val=1;
while(digi>0)
{
val*=10;
digi--;
}
if(last==0)
{
val*=10;
}
sum=(sum*val)+number;
return sum;
}}
int main()
{
int N;
scanf("%d", &N);
printf("%d", squareTheEnds (N));}
//}
