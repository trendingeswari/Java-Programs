import java.util.*;
public class StudentDetails {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        Data student=new Data();
        System.out.print("Enter the Number of Student Details Want to Enter : ");
        int stu=obj.nextInt();
        student.setValue(stu);
        student.setData();
        System.out.print("\033[H\033[2J");
        System.out.println("\t\t\t|Student Information System|");
        System.out.println("\t\t\t --------------------------");
        student.getData();
        
        System.out.println("\t\t\tDo you want to choose Student Mark : (true or false)");
        System.out.println("\t\t\t______________________________________________________");
        boolean value=obj.nextBoolean();
        if(value)
        {
            System.out.print("Enter the number of subjects : ");
            int sub=obj.nextInt();
            student.setDetail(sub);
            student.setMark();
            System.out.print("\033[H\033[2J");
            System.out.print("\t\t\t|Student Mark List|");
            System.out.print("\t\t\t------------------");
            System.out.println("Do you want all the student Data : Press 1\nDo you want Particular Student Data : Press 2\nExit : press 3");
            int num=obj.nextInt();
            if(num==1)
            {
                student.getMark();
            }
            if(num==2)
            {
                System.out.print("Enter the Student Serial Number : ");
                int n=obj.nextInt();
                obj.close();
                student.getParticularMark(n);
            }
            if(num==3)
            {
                System.out.println("Thanks For Choosing Our APP :)");
                return;
            }
        }
        else{
            obj.close();
            System.out.println("Thanks For Choosing Our APP :)");
            return;
        }
    }
}
class Data
{
    int value=0;
    public void setValue(int stu)
    {
        value =stu;
        System.out.println(value);
    }
    String name[]=new String[value],branch[]=new String[value],semester[]=new String[value],dob[]=new String[value],address[]=new String[value];
    int roll[]=new int[value],year[]=new int[value],age[]=new int[value];
    Scanner sc = new Scanner(System.in);
    public void setData()
    {
        for(int i=0;i<value;i++)
        {
            System.out.print("Enter the name of the student : ");
            name[i]=sc.nextLine();
            System.out.print("Enter the "+name[i]+"'s rollNumber : ");
            roll[i]=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the "+name[i]+"'s Branch : ");
            branch[i]=sc.nextLine();
            System.out.print("Enter the "+name[i]+"'s age : ");
            age[i]=sc.nextInt();
            System.out.print("Enter the "+name[i]+"'s studying year : ");
            year[i]=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the "+name[i]+"'s semester : ");
            semester[i]=sc.nextLine();
            System.out.print("Enter the "+name[i]+"'s Date of Birth : ");
            dob[i]=sc.nextLine();
            System.out.print("Enter the "+name[i]+"'s Address : ");
            address[i]=sc.nextLine();
        }
    }
    public void getData()
    {
        for(int i=0;i<value;i++)
        {
            System.out.println("Name of the student : "+name[i]);
            System.out.println(name[i]+"'s roll number : "+roll[i]);
            System.out.println(name[i]+"'s Branch name : "+branch[i]);
            System.out.println(name[i]+"'s age : "+age[i]);
            System.out.println(name[i]+"'s studying year : "+year[i]);
            System.out.println("semester : "+semester[i]);
            System.out.println(name[i]+"'s Date of Birth : "+dob[i]);
            System.out.println(name[i]+"'s Address : "+address[i]);
        }
    }
    int subject;
    public void setDetail(int sub)
    {
        subject=sub;
    }
    int arr[][]=new int[value][subject];
    public void setMark()
    {
        for(int i=0;i<value;i++)
        {
            System.out.println("Enter the "+name[i]+"'s "+subject+" subject marks ");
            for(int j=0;j<subject;j++)
            {
                System.out.print("Enter the subject"+(j+1)+" : ");
                arr[i][j]=sc.nextInt();
            }  
        }
    }
    int sum[]=new int[value];
    public void getMark()
    {
        for(int i=0;i<value;i++)
        {
            System.out.println(name[i]+"'s Mark List");
            sum[i]=0;
            for(int j=0;j<subject;j++)
            {
                System.out.println("subject"+(j+1)+" mark : "+arr[i][j]);
                sum[i]+=arr[i][j];
            }
            System.out.println(name[i]+"'s Total Marks : "+sum[i]+"/"+(subject*100));
            System.out.println(name[i]+"'s Percentage : "+sum[i]/subject+"%");
        }
    }
    public void getParticularMark(int num)
    {
        System.out.println(name[num-1]+"'s Mark List");
        sum[num-1]=0;
        for(int j=0;j<subject;j++)
        {
            System.out.println("subject"+(j+1)+" mark : "+arr[num-1][j]);
            sum[num-1]+=arr[num-1][j];
        }
        System.out.println(name[num-1]+"'s Total Marks : "+sum[num-1]+"/"+(subject*100));
        System.out.println(name[num-1]+"'s Percentage : "+sum[num-1]/subject+"%");
    }
}
