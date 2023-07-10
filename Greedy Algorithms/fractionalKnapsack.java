import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
// Greedy approach
public class fractionalKnapsack {

    // Function to get maximum value
    private static double getMaxValue(ItemValue[] arr,int capacity)
    {
        // 1. Sorting items by profit/weight ratio;
        Arrays.sort(arr, new Comparator<ItemValue>() {
            public int compare(ItemValue item1,ItemValue item2)
            {
                double cpr1 = Double.valueOf(item1.profit/item1.weight);
                double cpr2 = Double.valueOf(item2.profit/item2.weight);

                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });

        double totalValue = 0;

        for (ItemValue i : arr) {

            int curWt = (int)i.weight;
            int curProfit = (int)i.profit;

            if (capacity - curWt >= 0) {

                // This weight can be picked whole
                capacity = capacity - curWt;
                totalValue += curProfit;
            }
            else {

                // Item cant be picked whole
                double fraction = ((double)capacity / (double)curWt);
                totalValue += (curProfit * fraction);
                capacity= (int)(capacity - (curWt * fraction));
                break;
            }
        }

        return totalValue;
    }

    // Item value class
    static class ItemValue {

        int profit, weight;
        // Item value function
        // public ItemValue(int profit, int wt)
        // {
        //     this.weight = wt;
        //     this.profit = profit;
        // }
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of objects");
        int n=sc.nextInt();
        ItemValue[] arr=new ItemValue[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the profit ans corresponding weight");
            arr[i]=new ItemValue();
            arr[i].profit=sc.nextInt();
            arr[i].weight=sc.nextInt();
        }

        System.out.println("Enter the max capacity");
        int capacity =sc.nextInt();

        //function calling
        double maxValue = getMaxValue(arr, capacity);

        // Function call
        System.out.println("Maximum Profit is: "+maxValue);
    }
}
