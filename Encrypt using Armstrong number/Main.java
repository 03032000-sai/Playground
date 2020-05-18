#include<iostream>
#include<cmath>
int digits(int num)
{ 
  int x=num,count=0;
  while(x!=0)
  {
    x=x/10;
    count++;
  }
  return count;
}
int power(int a,int b)
{
  return pow(a,b);
}
int checkamstrong(int num)
  {
  int count=digits(num);
  int val=num,sum=0;
  while(val!=0)
  {
    int rem=val%10;
    sum=sum+power(rem,count);
    val=val/10;
  }
  if(sum==num)
    return 1;
  }

int main()
{
  int num;
  std::cin>>num;
  if(checkamstrong(num)==1)
    std::cout<<"Kindly proceed with encrypting";
  else
    std::cout<<"It is not an Armstrong number";
}
