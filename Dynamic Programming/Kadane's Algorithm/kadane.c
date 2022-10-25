#include<stdio.h> 
#include<stdlib.h> 


int main()
{
  int n ; 
  int sum=0; 
  int a[10];
  int max =a[0]
  printf("welcome to the maximun sum of array by using the KADANE'S ALGORITHM\n"); 
  printf("enter the array size\n"); 
  scanf("%d",&n); 
  printf("enter the array elements conissiting of both +ve and -Ve numbers\n"); 
  for(int i =0; i<n; i++)
  scanf("%d",&a[i]);
  for(int i=0; i<n; i++)
    sum+=a[i]; 
  if(sum>max) max =sum; 
  if(sum<0) sum=0; 
  printf("the maximum  sum of the array is %d",sum); 
  return 0;
  
  
}
