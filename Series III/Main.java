#include<iostream>
int main()
{
  int a,o,f=6;
  std::cout<<f<<" ";
  std::cin>>a;
  for(int i=1;i<=a-1;++i)
  {
    o=f+(5*i);
    std::cout<<o<<" ";
    f=o;
  }
}