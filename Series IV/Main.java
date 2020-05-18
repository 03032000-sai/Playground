#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,o;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(i%2==0)
    {
      o=pow(i,2)-2;
      std::cout<<o<<" ";
    }
    else
    {
      o=pow(i,2)-1;
    std::cout<<o<<" ";
    }
  }
}