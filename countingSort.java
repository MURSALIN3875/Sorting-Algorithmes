public class countingSort
{

    public static void countingSort(int a[])
    {
        int largest =Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            largest=Math.max(largest,a[i]);
        }

        int cnt[]=new int[largest+1];

        for(int i=0;i<a.length;i++)
        {
            cnt[a[i]]++;
        }

        int j=0;

        for(int i=0;i<cnt.length;i++)
        {
            while(cnt[i]>0)
            {
                a[j]=i;
                j++;
                cnt[i]--;
            }
        }
         
    }
public static void printarray(int a[])
{
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
}
    public static void main(String arg[])
    {
        int a[]={1,2,1,3,4,2,5,4,6};
        countingSort(a);
        printarray(a);     
    }
}