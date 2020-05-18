#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=(2*i)-1;j++)
    {     
      if(j%2==0)
      {
        std::cout<<"*";
      } 
      else
      {
        std::cout<<i;
      }
    }
    std::cout<<"\n";
  }
  for(int i=n;i>=1;i--)
  {
    for(int j=1;j<=(2*i)-1;j++)
    {     
      if(j%2==0)
      {
        std::cout<<"*";
      } 
      else
      {
        std::cout<<i;
      }
    }
    std::cout<<"\n";
  }
}