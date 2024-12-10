import java.util.*;
public class Quino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //The process of forming the binary array
        //getting the size of array
        System.out.println();
        System.out.print("Enter the size of the number: ");
        int size=sc.nextInt(),arr[]=new int[size],max=0;
        System.out.println();
        //getting the number for array
        System.out.print("Enter the numbers: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            //taking the max value
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        sc.close();
        //getting the bit count
        int n=0;
        if(max<=7)
            n=3;
        else if(max<=15)
            n=4;
        else if(max<=31)
            n=5;
        System.out.println();
        System.out.println("It contains "+n+" bits");
        // setting the size to the binary
        int binary[][]= new int[size][n];
        //setting the binary to the bits
        int s_ind=0;
        for(int i=0;i<size;i++)
        {
            //storing the arr value
            int arr_value=arr[i],a[]=new int[1001],ind=0,n_ind=0;
            while(arr_value>0)
            {
                a[ind++]=arr_value%2;
                arr_value/=2;
            }
            for(int j=0;j<ind;j++)
            {
                binary[s_ind][n_ind]=a[j];
                n_ind++;
            }
            s_ind++;
        }
        //setting remainging bits as a zero's and getting the real binary digits
        System.out.println();
        int binary_digi[][]=new int[size][n];
        for(int i=0;i<size;i++)
        {
            int ind=0;
            for(int j=0;j<n;j++)
            {
                if(!(binary[i][j]>0))
                {
                    binary[i][j]=0;
                }
            }
            for(int j=n-1;j>=0;j--)
            {
                binary_digi[i][ind++]=binary[i][j];
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" - ");
            for(int j=0;j<n;j++)
            {
                System.out.print(binary_digi[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //The process of making number of one's
        int zero[][]=new int[size][n],one[][]=new int[size][n],two[][]=new int[size][n],three[][]=new int[size][n],four[][]=new int[size][n],five[][]=new int[size][n],z_c1=0,o_c1=0,t_c1=0,th_c1=0,f_c1=0,fi_c1=0,z[]=new int[101],o[]=new int[101],t[]=new int[101],th[]=new int[101],f[]=new int[101],fi[]=new int[101],zc=0,oc=0,tc=0,thc=0,fc=0,fic=0;
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(binary_digi[i][j]==1)
                {
                    count++;
                }
            }
            if(count==0)
            {
                z[zc++]=arr[i];
                for(int j=0;j<n;j++)
                {
                    zero[z_c1][j]=binary_digi[i][j];
                }
                z_c1++;
            }
            if(count==1)
            {
                o[oc++]=arr[i];
                for(int j=0;j<n;j++)
                {
                    one[o_c1][j]=binary_digi[i][j];
                }
                o_c1++;
            }
            if(count==2)
            {
                t[tc++]=arr[i];
                for(int j=0;j<n;j++)
                {
                    two[t_c1][j]=binary_digi[i][j];
                }
                t_c1++;
            }
            if(count==3)
            {
                th[thc++]=arr[i];
                for(int j=0;j<n;j++)
                {
                    three[th_c1][j]=binary_digi[i][j];
                }
                th_c1++;
            }
            if(count==4)
            {
                f[fc++]=arr[i];
                for(int j=0;j<n;j++)
                {
                    four[f_c1][j]=binary_digi[i][j];
                }
                f_c1++;
            }
            if(count==5)
            {
                fi[fic++]=arr[i];
                for(int j=0;j<n;j++)
                {
                    five[fi_c1][j]=binary_digi[i][j];
                }
                fi_c1++;
            }
        }
        //printing the ones decimal values
        System.out.println("Number of ones in the binary");
        for(int i=0;i<zc;i++)
        {
            System.out.print(z[i] +" - ");
            for(int j=0;j<n;j++)
            {
                System.out.print(zero[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<oc;i++)
        {
            System.out.print(o[i]+" - ");
            for(int j=0;j<n;j++)
            {
                System.out.print(one[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<tc;i++)
        {
            System.out.print(t[i]+" - ");
            for(int j=0;j<n;j++)
            {
                System.out.print(two[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<thc;i++)
        {
            System.out.print(th[i]+" - ");
            for(int j=0;j<n;j++)
            {
                System.out.print(three[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<fc;i++)
        {
            System.out.print(f[i]+" - ");
            for(int j=0;j<n;j++)
            {
                System.out.print(four[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<fic;i++)
        {
            System.out.print(fi[i]+" - ");
            for(int j=0;j<n;j++)
            {
                System.out.print(five[i][j]+" ");
            }
            System.out.println();
        }
        //The process of checking the common one digit
        System.out.println();
        int g1[][]=new int[size][n],g2[][]=new int[size][n],g3[][]=new int[size][n],g4[][]=new int[size][n],g5[][]=new int[size][n],g1_c=0,g2_c=0,g3_c=0,g4_c=0,g5_c=0,szero[][]=new int[size][2],sone[][]=new int[size][2],stwo[][]=new int[size][2],sthree[][]=new int[size][2],sfour[][]=new int[size][2],sfive[][]=new int[size][2],sz=0,so=0,st=0,sth=0,sf=0,sfi=0;
        for(int i=0;i<zc;i++)
        {
            for(int j=0;j<oc;j++)
            {
                int count=0;
                for(int k=0;k<n;k++)
                {
                    if(zero[i][k]!=one[j][k])
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    szero[sz][0]=z[i];
                    szero[sz][1]=o[j];
                    sz++;
                    for(int k=0;k<n;k++)
                    {
                        if(zero[i][k]!=one[j][k])
                        {
                            g1[g1_c][k]=-1;
                        }
                        else{
                            g1[g1_c][k]=one[j][k];
                        }
                    }
                    g1_c++;
                }
            }
        }
        for(int i=0;i<oc;i++)
        {
            for(int j=0;j<tc;j++)
            {
                int count=0;
                for(int k=0;k<n;k++)
                {
                    if(one[i][k]!=two[j][k])
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    sone[so][0]=o[i];
                    sone[so][1]=t[j];
                    so++;
                    for(int k=0;k<n;k++)
                    {
                        if(one[i][k]!=two[j][k])
                        {
                            g2[g2_c][k]=-1;
                        }
                        else{
                            g2[g2_c][k]=two[j][k];
                        }
                    }
                    g2_c++;
                }
            }
        }
        for(int i=0;i<tc;i++)
        {
            for(int j=0;j<thc;j++)
            {
                int count=0;
                for(int k=0;k<n;k++)
                {
                    if(two[i][k]!=three[j][k])
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    stwo[st][0]=t[i];
                    stwo[st][1]=th[j];
                    st++;
                    for(int k=0;k<n;k++)
                    {
                        if(two[i][k]!=three[j][k])
                        {
                            g3[g3_c][k]=-1;
                        }
                        else{
                            g3[g3_c][k]=three[j][k];
                        }
                    }
                    g3_c++;
                }
            }
        }
        for(int i=0;i<thc;i++)
        {
            for(int j=0;j<fc;j++)
            {
                int count=0;
                for(int k=0;k<n;k++)
                {
                    if(three[i][k]!=four[j][k])
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    sthree[sth][0]=th[i];
                    sthree[sth][1]=f[j];
                    sth++;
                    for(int k=0;k<n;k++)
                    {
                        if(three[i][k]!=four[j][k])
                        {
                            g4[g4_c][k]=-1;
                        }
                        else{
                            g3[g3_c][k]=three[j][k];
                        }
                    }
                    g4_c++;
                }
            }
        }
        for(int i=0;i<fc;i++)
        {
            for(int j=0;j<fic;j++)
            {
                int count=0;
                for(int k=0;k<n;k++)
                {
                    if(four[i][k]!=five[j][k])
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    sfour[sf][0]=f[i];
                    sfour[sf][1]=fi[j];
                    sf++;
                    for(int k=0;k<n;k++)
                    {
                        if(four[i][k]!=five[j][k])
                        {
                            g5[g5_c][k]=-1;
                        }
                        else{
                            g4[g4_c][k]=four[j][k];
                        }
                    }
                    g5_c++;
                }
            }
        }
        //display the one difference
        System.out.println();
        for(int i=0;i<g1_c;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print((j==0)?szero[i][j]+",":szero[i][j]+"\t");
            }
            for(int j=0;j<n;j++)
            {
                System.out.print(g1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<g2_c;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print((j==0)?sone[i][j]+",":sone[i][j]+"\t");
            }
            for(int j=0;j<n;j++)
            {
                System.out.print(g2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<g3_c;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print((j==0)?stwo[i][j]+",":stwo[i][j]+"\t");
            }
            for(int j=0;j<n;j++)
            {
                System.out.print(g3[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<g4_c;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print((j==0)?sthree[i][j]+",":sthree[i][j]+"\t");
            }
            for(int j=0;j<n;j++)
            {
                System.out.print(g4[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<g5_c;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print((j==0)?sfour[i][j]+",":sfour[i][j]+"\t");
            }
            for(int j=0;j<n;j++)
            {
                System.out.print(g5[i][j]);
            }
            System.out.println();
        }
        //The process the stage 3 minterm compared with adjacent table
        System.out.println();
        //int s3_zero[]
    }
}
