#include<iostream>
using namespace std;
int main()
{
  int age;
  float t,m;
  m=13.30;
  std::cin>>age;
  std::cin>>t;
  if(age>13)
  {
    if(t==m)
    {
    std::cout<<"$5.00";
    }
    else
      std::cout<<"$8.00";
  }
  else if(age<=13)
    {
    if(t==m)
    {
    std::cout<<"$2.00";
    }
    else
    std::cout<<"$4.00";
    }
      
}