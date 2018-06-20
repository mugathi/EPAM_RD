import java.util.Scanner;
class BubbleSort
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] data=new int[n];
        for(int i=0;i<n;i++)
            data[i]=in.nextInt();
        int count=0;
        while(true)
        {
            count=0;
            for(int i=0;i<n-1;i++)
            {
                if(data[i]>data[i+1])
                { 
                    int temp=data[i];
                    data[i]=data[i+1];
                    data[i+1]=temp;
                    count++;
                }
            }
            if(count==0)break;
        }
        for(int i=0;i<n;i++)
            System.out.println(data[i]);
    }
}