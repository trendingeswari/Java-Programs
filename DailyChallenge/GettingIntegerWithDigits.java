/*
 You must define the function getIntegerWithDigitsCount(int N) which accepts an integer N as the
input. The function must form an integer X by replacing the consecutive occurrences(possibly once) of
the digits in N with the number of occurrences of the digit followed by the digit.
Note: Do not define the main() function as it is already defined. You just return the integer X as per the
given condition. The value of X will be printed by the main() function.
Boundary Condition(s):
1 <= N <= 10^8
Example Input/Output 1:
Input:
991115
Output:
293115
Explanation:
Here N = 991115.
Two 9's have occurred consecutively, so they are replaced with 29.
Three 1's have occurred consecutively, so they are replaced with 31.
Only one 5 has occurred, so it is replaced with 15.
Hence the integer X becomes 293115.
Example Input/Output 2:
Input:
255122
Output:
12251122
 */
public class GettingIntegerWithDigits {
    /*unsigned long long int getIntegerWithDigitsCount(int N)
{
    char s[1001];
    sprintf(s,"%d",N);
    char res[1001]="";
    int len=strlen(s),i=0;
    while(i<len)
    {
        char cur=s[i];
        int count=1;
        while(i+1<len&& s[i+1]==cur)
        {
            count++;i++;
        }
        char charcount[3];
        sprintf(charcount,"%d",count);
        strcat(res,charcount);
        char digi[2]={cur,'\0'};
        strcat(res,digi);
        i++;
    }
    printf("%d\n",atoi(res));
    return atoi(res);
}*/
}
