import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String m[]=sc.nextLine().split(":");
	String n[]=sc.nextLine().split(":");
	String k[]=sc.nextLine().split(":");
	int a1=Integer.parseInt(m[0]),b1=Integer.parseInt(m[1]),a2=Integer.parseInt(n[0]),b2=Integer.parseInt(n[1]),a3=Integer.parseInt(k[0]),b3=Integer.parseInt(k[1]);
	int t=(a2*60+b2)-(a1*60+b1)+(a3*60+b3);
	int s=t/60;
	if(s>=24){
	    s%=24;
	    if(s==24)
	    s=0;
	}
	System.out.printf("%02d:%02d",s,t%60);
    sc.close();
	}
}
