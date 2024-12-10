import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        char s[]=sc.nextLine().toCharArray(),s1[]=new char [s.length],s2[]=new char [s.length];
        s1[0]=s[0];s2[0]='*';
        sc.close();
        for(int i=1;i<s.length;i++)
        {
            if(!isvowel(s[i-1]))
            {
                s1[i]=s[i];
                s2[i]='*';
            }
            else
            {
                s2[i]=s[i];
                s1[i]='*';
            }
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s1[i]);
        }
        System.out.println();
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s2[i]);
        }
	}
	public static boolean isvowel(char c)
	{
	    c=Character.toLowerCase(c);
	    return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
}
