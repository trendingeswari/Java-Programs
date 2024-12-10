import java.util.Arrays;
import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)arr[i] = in.nextInt();
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		int num = 0;
        in.close();
		if(num!=arr[0]){
		    if(num+1 == arr[0])
		    sb.append(String.valueOf(num+","));
		    else
		    sb.append(String.valueOf(num+"-"+(arr[0]-1)+","));
		}
		num = arr[0];
		for(int i=1;i<n;i++){
		    if(num+1 != arr[i]){
		        if(num+2==arr[i])
		            sb.append(String.valueOf(num+1)+",");
		        else
		            sb.append(String.valueOf(num+1+"-"+(arr[i]-1)+","));
		        }
		    num = arr[i];
        }
		sb.setLength(sb.length()-1);
		System.out.println(sb);
	}
}
