import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        String name[]=sc.nextLine().split("\\s+"),nameMark[]=sc.nextLine().split("\\s+");
        sc.close();
        for(int i=0;i<name.length;i++)
        {
            int value=0;
            for(int j=0;j<nameMark.length;j++)
            {
                char names[]=nameMark[j].toCharArray(),mark[]=name[i].toCharArray();
                int len1=nameMark[j].length(),len2=name[i].length();
                if(mark[0]==names[0] && mark[len2-1]==names[len1-1])
                {
                    for(int k=1;k<names.length-1;k++)
                    {
                        value=(value*10)+(names[k]-'0');
                    }
                }
            }
            System.out.println(name[i]+" "+value);
        }
	}
}
