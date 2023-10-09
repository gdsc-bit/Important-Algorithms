public class QuickSort {
    static int n=10;
    static int a[]={5, 3, 12, 78, 32, 51, 16, 75, 8, 33};
    public static void main(String[] args) {
		  QuickAlg(0,n-1);
		  DisplayArray();
	  }
	  public static void QuickAlg(int p, int r) {
	    int i,j,temp;
	    i=p+1;
	    j=r;
	    if(p<r) {
	        while(true) {
	            while(a[i]<a[p] && i<r)
	                i++;
	            while(a[j]>a[p])
	                j--;
	            if(i<j) {
	                temp=a[i];
	                a[i]=a[j];
	                a[j]=temp;
	            }
	            else
	                break;
	        }
	        temp=a[p];
	        a[p]=a[j];
	        a[j]=temp;
	        QuickAlg(p,j-1);
	        QuickAlg(j+1,r);
	    }
	}
	public static void DisplayArray() {
	    System.out.println("Sorted array: ");
	    for(int i=0;i<n;i++)
	        System.out.print(a[i]+"\t");
	}
}
