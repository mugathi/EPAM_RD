import java.util.Scanner;
class QuickSort
{
    void sort(int[] data,int lo,int hi)
    {
        if(lo>=hi)return;
        int j=arrange(data,lo,hi);
        sort(data,lo,j-1);
        sort(data,j+1,hi);
    }
    int arrange(int[] data,int lo,int hi)
    {
        int j=lo;
        int k=hi+1;
        while(true)
        {
            while(data[lo]>data[++j])
                if(j==hi)break;
            while(data[lo]<data[--k])
                if(k==lo)break;
            if(j>=k)break;
            swap(data,j,k);
        }
        swap(data,lo,k);
        return j;
    }
    void swap(int[] data,int fi,int la)
    {
        int temp=data[fi];
        data[fi]=data[la];
        data[la]=temp;
    }
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int[] data=new int[n];
         QuickSort call=new QuickSort();
         for(int i=0;i<n;i++)
            data[i]=in.nextInt();
         call.sort(data,0,n-1);
         for(int i=0;i<n;i++)
            System.out.println(data[i]);
    }
}