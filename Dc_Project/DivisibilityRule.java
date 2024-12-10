import java.util.*;
public class DivisibilityRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number:");
        int N=sc.nextInt();
        System.out.print("Enter the diviser check Number below 20:");
        int D=sc.nextInt();
        sc.close();
        if(D>20)
        {
            System.out.print("Enter diviser below 20 :(");
            return;
        }
        boolean value=diviser(N,D);
        if(value)
        {
            System.out.print(D+" divides "+N);
        }
        else{
            System.out.print(D+" does not divides "+N);
        }
    }
    public static boolean diviser(int N,int D)
    {
        int arr[]=new int[1001],ind=0,num=N;
        while(num>0)
        {
            arr[ind++]=num%10;
            num/=10;
        }
        switch(D)
        {
            case 1:
                return true;
            case 2:
                int two=N%10;
                if(two%D==0)
                {
                    return true;
                }
                break;
            case 3:
                int three=0;
                for(int i=0;i<ind;i++)
                {
                    three+=arr[i];
                }
                if(three%D==0)
                {
                    return true;
                }
                break;
            case 4:
                for(int i=0;i<2;i++)
                {
                    if(arr[i]%D!=0)
                    {
                        return false;
                    }
                }
                return true;
            case 5:
                if(N%5==0)
                {
                    return true;
                }
                break;
            case 6:
                if((N%3==0)&&(N%2==0))
                {
                    return true;
                }
            break;
            case 7:
                int seven=(N%10)*2,value=0;
                for(int i=1;i<ind;i++)
                {
                    value+=arr[i];
                }
                if((value-seven)%D==0)
                {
                    return true;
                }
            break;
            case 8:
                for(int i=0;i<3;i++)
                {
                    if(arr[i]%D!=0)
                    {
                        return false;
                    }
                }
                return true;
            case 9:
                int nine=0;
                for(int i=0;i<ind;i++)
                {
                    nine+=arr[i];
                }
                if(nine%D==0)
                {
                    return true;
                }
            break;
            case 10:
                if(N%D==0)
                {
                    return true;
                }
            break;
            case 11:
                int odd=0,even=0;
                for(int i=0;i<ind;i+=2)
                {
                    odd+=arr[i];
                }
                for(int i=1;i<ind;i+=2)
                {
                    even=arr[i];
                }
                if((odd-even)%D==0)
                {
                    return true;
                }
            break;
            case 12:
                if((N%4==0)&&(N%3==0))
                {
                    return true;
                }
            break;
            case 13:
                int thirteen=(N%10)*4,thirteenValue=0;
                for(int i=1;i<ind;i++)
                {
                    thirteenValue+=arr[i];
                }
                if((thirteenValue+thirteen)%D==0)
                {
                    return true;
                }
            break;
            case 14:
                if((N%7==0)&&(N%2==0))
                {
                    return true;
                }
            break;
            case 15:
                if((N%5==0)&&(N%3==0))
                {
                    return true;
                }
            break;
            case 16:
                for(int i=0;i<4;i++)
                {
                    if(arr[i]%D!=0)
                    {
                        return false;
                    }
                }
                return true;
            case 17:
                int seventeen=(N%10)*5,seventeenValue=0;
                for(int i=1;i<ind;i++)
                {
                    seventeenValue+=arr[i];
                }
                if((seventeenValue-seventeen)%D==0)
                {
                    return true;
                }
            break;
            case 18:
                if((N%9==0)&&(N%2==0))
                {
                    return true;
                }
            break;
            case 19:
                int nineteen=N%10,nineteenValue=0;
                for(int i=1;i<ind;i++)
                {
                    nineteenValue+=arr[i];
                }
                if((nineteen+nineteenValue)%D==0)
                {
                    return true;
                }
            break;
            case 20:
                int twenty1=N%10,twenty2=(N/10)%10;
                if(twenty1==0&&twenty2%2==0)
                {
                    return true;
                }
        }
        return false;
    }
}
