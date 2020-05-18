#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  for(int i=n;i<=n+3;i++)
  {
    for(int j=n;j<=i;j++)
    {
      std::cout<<i;
    }
    std::cout<<"\n";
  }
  for(int i=n+3;i>=n;i--)
  {
    for(int j=n;j<=i;j++)
    {
      std::cout<<i;
    }
    std::cout<<"\n";
  }
}