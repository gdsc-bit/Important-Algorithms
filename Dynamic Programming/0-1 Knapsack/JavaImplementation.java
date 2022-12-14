import java.util.*;
class Knapsack {

    public static void main(String args[])
    {
	  Scanner obj= new Scanner(System.in);

	  //Enter no. of elements in array
	  int n=obj.nextInt();

	  //Enter max weight
	  int W = obj.nextInt();

        int val[] = new int[n];
        int wt[] = new int[n];
        
	  //Enter values of items
	  for(int i=0; i<n; i++)
		val[i]=obj.nextInt();

	  //Enter weights of items
	  for(int i=0; i<n; i++)
		wt[i]=obj.nextInt();

        System.out.println(knapSack(W, wt, val, n));
    }
  
    public static int knapSack(int W, int wt[], int val[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
        for (i = 0; i<= n; i++) {
            for (w = 0; w<= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1]<= w)
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
  
        return K[n][W];
    }
    
}
