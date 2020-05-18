#include<iostream>
int main()
{
int num,lim;
std::cin>>num;
  std::cin>>lim;
  for(num;num<=lim;num++)
  {
    int sum=0;
  for(int i=1;i<num;i++)
  {
  if(num%i==0)
    sum=sum+i;
    }
    if(sum==num)
      std::cout<<num<<" "; 
  }
}