#include<iostream>
int main()
{
  int a;
  float o,f=0.5;
  std::cout<<f<<" ";
  std::cin>>a;
  for(int i=1;i<=a-1;i++)
  {
    o=f*3;
    std::cout<<o<<" ";
    f=o;
  }
}