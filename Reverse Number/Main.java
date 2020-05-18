#include <iostream>
int main() 
  
{
	int num,r=0;
std::cin>>num;
  while (num != 0)
  {
    r = r * 10;
    r = r + num%10;
    num = num/10;
  }
  std::cout<<r;
	return 0;
}