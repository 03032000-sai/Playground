#include<iostream> 
int main()
{
  int n,count=0;
  std::cin>>n;
    for(;n != 1;) 
    { 
        std::cout << n << "\n";         
        if (n%2==0) 
             n = n/2; 
        else
            n = 3*n+1; 
       count++;
    } 
    std::cout<<n<<"\n";
  std::cout<<count;
}