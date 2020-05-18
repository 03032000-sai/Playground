#include<iostream>
#include<cmath>
int drstrange(int,int);
int main()
{
  int m,n,req,a;
  std::cin>>m>>n>>req;
  a=pow(m,n);
  drstrange(a,req);
  return 0;
}
int drstrange(int ans,int num)
{
  if(ans>=num)
     {
       std::cout<<"Doctor, you can proceed with your experiment.";
     }
     else
     std::cout<<"Sorry Doctor! You need more bacteria.";
}