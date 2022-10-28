import java.util.Scanner;


class kobj
{
	float w; 
	float p; 
	float r; 
}
public class knapscakgreedy {
   static final int max =20 ;
   static int n; 
   static float m; 
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("enter the number of the items"); 
		n=scan.nextInt(); 
		kobj[] obj =new kobj[n];
     for(int i = 0;i<n;i++)
     obj[i] = new kobj();
     
     readobjects(obj); 
     knapscak(obj); 
     scan.close(); 
	}
	static void readobjects(kobj obj[])
	{ 
		kobj temp = new kobj(); 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the maximum capacity");
		m = scan.nextInt (); 
		System.out.println("enter the weights of the objects"); 
		for(int i =0; i<n;i++)
		   obj[i].w = scan.nextInt(); 
		System.out.println("enter the profit of the objects "); 
	for(int i = 0 ;i<n;i++)
		obj[i].p=scan.nextInt(); 
	for(int i =0 ;i<n;i++)
		obj[i].r= obj[i].w/obj[i].p; 
	for(int i = 0 ;i<n;i++)
	{
		for(int j =0 ;j<n-1-i;j++)
		{
			if(obj[j].r<obj[j+1].r)
			temp=obj[j]; 
			obj[j]=obj[j+1]; 
			obj[j+1]=temp; 
		
			
		}
	}
		scan.close(); 
	}
	
	static void knapscak(kobj obj[])
	{
		float x[] = new float[max];
		float totalprofit=0; 
		int i;
		float u = m; 
	    for( i =0;i<n;i++)
	    	x[i]=0; 
		for(i =0; i<n;i++)
		{
			if(obj[i].w>u)
				break;
			else 
			{
				x[i]=1; 
				totalprofit+=obj[i].p;
				u-=obj[i].w; 
			}
				
				
		}
		System.out.println("i"+i);
		if(i<n)
			x[i]=u/obj[i].w;
		totalprofit+=(x[i]*obj[i].p);
		
		System.out.println("solution vector sis "); 
		for( i =0;i<n;i++)
		{
			System.out.println(x[i]+" ");
		}
		
		
		
	}

}


