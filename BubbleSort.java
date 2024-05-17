public class BubbleSort
{

    public static void BubbleSort(int a[])
    {
          for(int i=0;i<a.length-1;i++)
          {
               for(int j = 0;j<a.length-1-i;j++)
               {
                   if(a[j]>a[j+1])
                   {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                   }
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
        int a[]={5,4,3,2,1};
        BubbleSort(a);
        printarray(a);     
    }
}