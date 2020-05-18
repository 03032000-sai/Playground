#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int mar[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>mar[i];
  }
  for(int i=1;i<n;i++)
  {
    if(mar[0]<mar[i])
      mar[0]=mar[i];
  }
  std::cout<<mar[0];
}