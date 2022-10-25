#include<iostream> 
using namespace std; 

int fact(int); 

int  main()
{
    int n; 
    cout<<"enter the number to find the factorial\n "; 
    cin>>n;
    int result = fact(n); 
    return 0 ; 
}

int fact(int n ) 
{
     return (n*fact(n-1));
     if(n==1)
     return 1 ; 
}
