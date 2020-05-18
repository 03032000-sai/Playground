#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  std::cin>>r>>c>>t;
  if((t>r)&&(t<=r+r))
  {
    std::cout<<"It is a mango tree";
  }
  else if(t>(c*r)-(c+r)&&(t<=(c*r)-r))
  {
     std::cout<<"It is a mango tree";
} else 
    std::cout<<"It is not a mango tree";
}