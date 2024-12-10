package Curious_Freeks;

public class trying {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner (System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        String S[]=sc.nextLine().split("\\s+");
        int val[]=new int[10];
        for(int i=0;i<S.length;i++)
        {
            int num=Integer.parseInt(S[i]);
            while(num>0)
            {
                val[num%10]++;
                num/=10;
            }
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]<val[i])
            {
                System.out.print("NO");
                return ;
            }
        }
        System.out.print("YES");
	}
}
