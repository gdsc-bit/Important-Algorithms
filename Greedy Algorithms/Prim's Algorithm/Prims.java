

import java.util.*; 

public class PrimsClass {
	static final int MAX =20 ; 
	static int n ; 
	static int cost[][]; 
	static Scanner scan = new Scanner(System.in); 
	
	
	

	public static void main(String[] args) {
		
		readmatrix(); 
		prims(); 
		// TODO Auto-generated method stub

	}
	
	static void readmatrix()
	{
		
		int i , j ; 
		cost=new int[MAX][MAX];
		System.out.println("enter the number of elements of the matrix"); 
		n = scan.nextInt();
		System.out.println("enter the adjacenecy matrix "); 
		for(i =1; i<=n;i++)
		{
			for(j=1;j<n;j++)
			{
			cost[i][j]=scan.nextInt(); 
			if(cost[i][j]==0)
				cost[i][j]=999; 
			
			}
		}
		
	}
	static void prims()
	{
		int a=0,b=0,u=0,v=0; 
		int ne=1,i,j; 
		int min,mincost=0;
		int visited[]=new int[10];
		visited[1]=1;
		
		while(ne<n)
		{
		for(i=1,min=999;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(cost[i][j]<min)
					if(visited[i]!=0)
					{
						min=cost[i][j];
						a=u=i; 
						b=v=j;
					}
					
			}
		}
			if(visited[u]==0||visited[v]==0)
			{
				System.out.println("\nedge"+ne++ +":("+a+","+b+")"+"cost:"+min);
				mincost+=min; 
				visited[b]=1; 
				
			}
			
			cost[a][b]=cost[b][a]=999;
		
			
	}
		
		System.out.println("the total cost is :"+mincost);

    }
}
