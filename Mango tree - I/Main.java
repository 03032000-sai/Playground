#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  std::cin>>r>>c>>t;
  if((t>=1)&&(t<=r))
  {
    std::cout<<"Yes";
  }
  else if(t>(c*r)-r&&(t<=(c*r)))
  {
     std::cout<<"Yes";
} else if(t==1+r||t==1+(2*r)||t==1+(3*r))
  {
  std::cout<<"Yes";
  }
  else
    std::cout<<"No";
}