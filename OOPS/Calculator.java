package Workspace.Java.OOPS;
import java.util.*;
public class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        sc.close();
        Calculator obj=new Calculator();
        System.out.print(obj.add(a,b)+" "+obj.sub(a,b)+" "+obj.mul(a,b)+" "+obj.div(a,b));
    }
    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return Math.abs(a-b);
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a ,int b)
    {
        return a/b;
    }
}
