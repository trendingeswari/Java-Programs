import java.util.*;
public class RemoveLongestPrefixAndSuffix {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char s[]=sc.nextLine().toCharArray();
        int left=0,right=(s.length)-1;
        sc.close();
        while(left<=right)
        {
            if(s[left]!=s[right])
            {
                break;
            }
            left++;right--;
        }
        if(left>right)
        {
            System.out.print("-1");
        }
        else{
            for(int i=left;i<=right;i++)
            {
                System.out.print(s[i]);
            }
        }
    }
}
