import java.util.Scanner;

public class Day69 {
    static int count(String str){
       int count=0;
       for(char ch:str.toCharArray()){
           if(Character.isLowerCase(ch)) count++;
       }
       return count;
   }
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String[] strings=new String[N];
		int[] lower=new int[N];
		for(int i=0;i<N;i++){
		    strings[i]=sc.nextLine();
		    lower[i]=count(strings[i]);
		}
		for(int i=0;i<N-1;i++){
		    for(int j=0;j<N-i-1;j++){
		        if(lower[j]>lower[j+1])
		        {
		            int temp=lower[j];
		            lower[j]=lower[j+1];
		            lower[j+1]=temp;
		            String tempstr=strings[j];
		            strings[j]=strings[j+1];
		            strings[j+1]=tempstr;
		       
		        }
		    }
		}
		for(String str:strings) 
		   System.out.println(str);
        sc.close();
	}
}
