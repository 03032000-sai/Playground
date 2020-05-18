#include<iostream>
using namespace std;
int main()
{
  int num,sum=0,rem,val;
  std::cin>>num;
  val=num;
  for(;val!=0;)
  {
  rem=val%10;
     val=val/10;
    sum=sum+rem;
    
  }
  if((num%sum)==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}