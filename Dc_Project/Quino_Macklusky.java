
import java.util.*;
public class Quino_Macklusky {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n=sc.nextInt();
        System.out.print("Enter the "+n+" values : " );
        int a[]=new int[n],first[][]=new int[15][4],indexNum[]=new int[n],indnum=0;
        for(int i=0;i<15;i++){
            for(int j=0;j<4;j++)
            {
                first[i][j]=0;
            }
        }
        int index=0;
        //storing the respective values in 4 bit binary format
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            int num=a[i],b[]=new int [4],ind=0,val=0;
            while(num>0)
            {
                b[ind++]=num%2;
                num/=2;
            }
                for(int j=4-1;j>=0;j--)
                {
                    if(val<=ind)
                    {
                    first[index][j]=b[val++];
                    }
                }
                System.out.print(a[i]+" - ");
                for(int j=0;j<4;j++)
                {
                    System.out.print(first[index][j]);
                }
                System.out.println();
                index++;
        }
        sc.close();
        System.out.println();
        //taking count of ones
        int zeros[][]=new int [1][4],ones[][]=new int [5][4],twos[][]=new int [5][4],threes[][]=new int[5][4],fours[][]=new int [1][4];
        int z=0,o=0,t=0,th=0,f=0;
        for(int i=0;i<index;i++)
        {
            int twocount=0,threecount=0,fourcount=0,onecount=0,zcount=0;
            for(int j=0;j<4;j++)
            {
                if(first[i][j]==0)
                {
                    zcount++;
                }
                if(first[i][j]==1&&onecount<=1)
                {
                    onecount++;
                }
                if(first[i][j]==1&& twocount<=2)
                {
                    twocount++;
                }
                if(first[i][j]==1&&threecount<=3)
                {
                    threecount++;
                }
                if(first[i][j]==1 && fourcount<=4)
                {
                    fourcount++;
                }
            }
            //storing the respective their ones in the array
            //int z_c=0,o_c=0,t_c=0,th_c=0,f_c=0,zone[]=new int[101],tone[]=new int[101],thone[]=new int[101],fone[]=new int[101];
            if(zcount==4)
            {
                System.out.print(a[i]+" - ");
                for(int j=0;j<4;j++)
                {
                    zeros[z][j]=first[i][j];
                    System.out.print(zeros[z][j]);
                }
                z++;
                System.out.print(" ");
            }
            else if(onecount==1)
            {
                System.out.print(a[i]+" - ");
                for(int j=0;j<4;j++)
                {
                    ones[o][j]=first[i][j];
                    System.out.print(ones[o][j]);
                }
                o++;
                System.out.print(" ");
            }
            else if(twocount==2)
            {
                System.out.print(a[i]+" - ");
                for(int j=0;j<4;j++)
                {
                    twos[t][j]=first[i][j];
                    System.out.print(twos[t][j]);
                }
                t++;
                System.out.print(" ");
            }
            else if(threecount==3)
            {
                System.out.print(a[i]+" - ");
                for(int j=0;j<4;j++)
                {
                    threes[th][j]=first[i][j];
                    System.out.print(threes[th][j]);
                }
                th++;
                System.out.print(" ");
            }
            else
            {
                for(int j=0;j<4;j++)
                {
                    fours[f][j]=first[i][j];
                    //fone[f_c++]=a[i];
                    System.out.print(fours[f][j]);
                }
                f++;
                System.out.print(" ");
            }
        }
        //compare minterm in adjacent section
        //for zeros
        System.out.println();System.out.println();
        int szeros[][]=new int[10][4],sones[][]=new int[10][4],stwos[][]=new int[10][4],sthrees[][]=new int[10][4],sfours[][]=new int[1][4];
        int sz=0,so=0,st=0,sth=0;
        for(int i=0;i<z;i++)
        {
            for(int k=0;k<o;k++)
            {
                for(int j=0;j<4;j++)
                {
                    if(zeros[i][j]!=ones[k][j])
                    {
                        szeros[sz][j]=-1;
                        System.out.print(szeros[sz][j]);
                    }
                    else{
                        szeros[sz][j]=zeros[i][j];
                        System.out.print(szeros[sz][j]);
                    }
                }
                sz++;
                System.out.print(" ");
            }
        }
        for(int i=0;i<o;i++)
        {
            for(int k=0;k<t;k++)
            {
                int count=0;
                for(int j=0;j<4;j++)
                {
                    if(ones[i][j]!=twos[k][j])
                    {
                        count++;
                    }
                }
                if(count==1){
                for(int j=0;j<4;j++)
                {
                    if(ones[i][j]!=twos[k][j])
                    {
                        sones[so][j]=-1;
                        System.out.print(sones[so][j]);
                    }
                    else{
                        sones[so][j]=ones[i][j];
                        System.out.print(sones[so][j]);
                    }
                }
                so++;
                System.out.print(" ");}
            }
        }
        for(int i=0;i<t;i++)
        {
            for(int k=0;k<th;k++)
            {
                int count=0;
                for(int j=0;j<4;j++)
                {
                    if(twos[i][j]!=threes[k][j])
                    {
                        count++;
                    }
                }
                if(count==1){
                for(int j=0;j<4;j++)
                {
                    if(twos[i][j]!=threes[k][j])
                    {
                        stwos[st][j]=-1;
                        System.out.print(stwos[st][j]);
                    }
                    else{
                        stwos[st][j]=twos[i][j];
                        System.out.print(stwos[st][j]);
                    }
                }
                st++;
                System.out.print(" ");}
            }
        }
        for(int i=0;i<th;i++)
        {
            for(int k=0;k<f;k++)
            {
                int count=0;
                for(int j=0;j<4;j++)
                {
                    if(threes[i][j]!=fours[k][j])
                    {
                        count++;
                    }
                }
                if(count==1){
                for(int j=0;j<4;j++)
                {
                    if(threes[i][j]!=fours[k][j])
                    {
                        sthrees[sth][j]=-1;
                        System.out.print(sthrees[sth][j]);
                    }
                    else{
                        sthrees[sth][j]=threes[i][j];
                        System.out.print(sthrees[sth][j]);
                    }
                }
                sth++;
                System.out.print(" ");}
            }
        }
        //step 3 secibtable minterm change only one variable change put _ and compared with _ of adjacend table
        System.out.println();System.out.println();
        int tzeros[][]=new int[10][4],tones[][]=new int[10][4],ttwos[][]=new int [10][4],tthrees[][]=new int[10][4],tfours[][]=new int[10][4];
        int tz=0,to=0,tt=0;
        for(int i=0;i<sz;i++)
        {
            for(int k=0;k<so;k++)
            {
                int count=0;
                for(int j=0;j<4;j++)
                {
                    if(szeros[i][j]!=sones[k][j])
                    {
                        count++;
                    }
                }
                if(count==1){
                for(int j=0;j<4;j++)
                {
                    if(szeros[i][j]!=sones[k][j]||(szeros[i][j]==-1&&sones[k][j]==-1))
                    {
                        tzeros[tz][j]=-1;
                        System.out.print(tzeros[tz][j]);
                    }
                    else{
                        tzeros[tz][j]=szeros[i][j];
                        System.out.print(tzeros[tz][j]);
                    }
                }
                tz++;
                System.out.print(" ");}
            }
        }
        for(int i=0;i<so;i++)
        {
            for(int k=0;k<st;k++)
            {
                int count=0;
                for(int j=0;j<4;j++)
                {
                    if(sones[i][j]!=stwos[k][j])
                    {
                        count++;
                    }
                }
                if(count==1){
                for(int j=0;j<4;j++)
                {
                    if(sones[i][j]!=stwos[k][j]||(sones[i][j]==-1&&stwos[k][j]==-1))
                    {
                        tones[to][j]=-1;
                        System.out.print(tones[to][j]);
                    }
                    else{
                        tones[to][j]=sones[i][j];
                        System.out.print(tones[to][j]);
                    }
                }
                to++;
                System.out.print(" ");}
            }
        }
        for(int i=0;i<st;i++)
        {
            for(int k=0;k<sth;k++)
            {
                int count=0;
                for(int j=0;j<4;j++)
                {
                    if(stwos[i][j]!=sthrees[k][j])
                    {
                        count++;
                    }
                }
                if(count==1){
                for(int j=0;j<4;j++)
                {
                    if(stwos[i][j]!=sthrees[k][j]||(stwos[i][j]==-1&&sthrees[k][j]==-1))
                    {
                        ttwos[tt][j]=-1;
                        System.out.print(ttwos[tt][j]);
                    }
                    else{
                        ttwos[tt][j]=stwos[i][j];
                        System.out.print(ttwos[tt][j]);
                    }
                }
                tt++;
                System.out.print(" ");}
            }
        }

    }
}