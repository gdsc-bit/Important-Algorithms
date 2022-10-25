#include<iostream> 
#include<math.h>
#include<conio.h>
#include<stdio.h>

using namespace std; 
  #define TRUE 1
  #define FALSE 0 
  void printsolution(int n,int x[])
  {
    int i,j;
  char c[10][10];
  for(i =1;i<=n;i++)
  {
     for( j =1;j<=n;j++)
     {
     c[i][j] ='x';

     }
  }


  
// place thee queen 
  for( i=1;i<=n;i++)
  {
  c[i][x[i]]='Q';
  }


  for( i=1;i<=n;i++)
  {
  for(j=1;j<=n;j++)
  {
  cout<<c[i][j];

  }
  cout<<"\n";
  }
  
  }


  int place(int x[],int k)
  {

  for(int i=1;i<k;i++)
  {
     if(x[i]==x[k]||i-x[i]==k-x[k]||i+x[i]==k+x[k])
     {
          return FALSE;
     }
}
     return TRUE;
  }



  void nqueen(int n)
  {
  int x[10];
  int count =0; 
  int k=1; 
    x[k]=0; 

    while(k!=0)
    {
    x[k]+=1;

    while((x[k]<=n)&&( !place(x,k)))
    {
        x[k]+=1;
    }

    if(x[k]<=n)
    {

    if(k==n)
         {
    count++; 
    cout<<"solution"<<count<<"is\n\n";
    printsolution(n,x);
              }
          

          else 
          {
            k++; 
            x[k]=0; 
          }
        }

           else 
          {
          k--; 
          }
    }

  

  return; 
  }



  int main()
  {
  int n; 
  cout<<"enter the no of the queeen\n\n"; 
  cin>>n; 
  nqueen(n);
  return 0; 
  }
