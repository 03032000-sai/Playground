#include<iostream>
using namespace std;
int dr(int num)
{
  int sum=0,rem,s=0;
  for(;num>0;)
  {
    while(num!=0)
    {
    rem=num%10;
    sum=sum+rem;
    num=num/10;
    }
    if(sum>9)
    {
      num=sum;
      sum=0;
    }
  }
  return sum;
}
int main()
{
int num;
  cin>>num;
  cout<<dr(num);
}