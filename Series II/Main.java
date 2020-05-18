#include<iostream>
int main()
{
  int a,o,f=11;
  std::cin>>a;
 for(int i=1;i<=a;i++)
  {
  o=f*f;
   std::cout<<o<<" ";
   f=f+4;
  }
}