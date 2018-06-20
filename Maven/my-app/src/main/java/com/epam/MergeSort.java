import java.util.Scanner;
class MergeSort
{
    void sort(int[] data,int[] dup,int fi,int la)
    {
        if(fi>=la)return;
        int mid=fi+(la-fi)/2;
        sort(data,dup,fi,mid);
        sort(data,dup,mid+1,la);
        merge(data,dup,fi,mid+1,la);
    }
    void merge(int[] data,int[] dup,int f,int m,int l)
    {
        int fir=f;
        int mid=m;
        for(int i=f;i<=l;i++)
            dup[i]=data[i];
        for(int i=f;i<=l;i++)
        {

            if(fir>=m) data[i]=dup[mid++];
            else if(mid>l) data[i]=dup[fir++];
            else if(dup[fir]>=dup[mid])data[i]=dup[mid++];
            else data[i]=dup[fir++];
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] data=new int[n];
        int[] dup=new int[n];
        for(int i=0;i<n;i++)
        {
            data[i]=in.nextInt();
            dup[i]=data[i];
        }
        MergeSort call=new MergeSort();
        call.sort(data,dup,0,n-1);
        for(int i=0;i<n;i++)
            System.out.println(data[i]);
    }
}