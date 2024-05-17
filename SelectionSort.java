public class SelectionSort
{

    public static void SelectionSort(int a[])
    {
          for(int i=0;i<a.length-1;i++)
          {
            int minpos=i;
               for(int j = i+1;j<a.length-i;j++)
               {
                   if(a[minpos]>a[j])
                   {
                    minpos=j;

                   }
               }
               int temp=a[i];
                    a[i]=a[minpos];
                    a[minpos]=temp;
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
        SelectionSort(a);
        printarray(a);     
    }
}