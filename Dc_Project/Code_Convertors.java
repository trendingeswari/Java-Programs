import java.util.*;
public class Code_Convertors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the size of the array
        System.out.println();
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt(),arr[]=new int[size];
        //getting the number of the array
        System.out.println();
        int binary[][]=new int[size][4];
        System.out.print("Enter the "+size+" numbers: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            //set the binary value
            int val=arr[i],a[]=new int[1001],ind=0,n_ind=0;
            while(val>0)
            {
                a[ind++]=val%2;
                val/=2;
            }
            for(int j=0;j<ind;j++)
            {
                binary[i][n_ind++]=a[j];
            }
        }
        //gettting the real binary value array
        System.out.println();
        int binary_digi[][]=new int[size][4];
        for(int i=0;i<size;i++)
        {
            int ind=0;
            for(int j=3;j>=0;j--)
            {
                binary_digi[i][ind++]=binary[i][j];
            }
        }
        //asking the convertion
        boolean flag=true;
        while(flag)
        {
            System.out.print("1)BCD to excess-3 conversion\n2)Binary to gray code conversion\n3)Gray to binary code conversion\n4)Exit");
            System.out.println("Enter the conversion:");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    for(int i=0;i<16;i++)
                    {
                        System.out.print(arr[i]+" - ");
                        for(int j=0;j<4;j++)
                        {
                            System.out.print(binary_digi[i][j]);
                        }
                        System.out.print("\t-\t");
                        int a[]={0,0,1,1},b[]=new int[1001],ind=0;
                            for(int j=3;j>=0;j--)
                            {
                                if(binary_digi[i][j]==0&& a[j]==0)
                                {
                                    b[ind++]=0;
                                }
                                if(binary_digi[i][j]==0 && a[j]==1)
                                {
                                    b[ind++]=1;
                                }
                                if(binary_digi[i][j]==1 && a[j]==1)
                                {
                                    b[ind++]=1;
                                    a[j-1]=1;
                                }
                            }
                        for(int j=ind-1;j>=0;j--)
                        {
                            System.out.print(b[j]);
                        }
                        System.out.println();
                    }
                    break;
            
                case 4:
                    flag=false;
                    break;
            }
        }
    }
}
