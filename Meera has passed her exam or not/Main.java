#include<iostream>
int main()
{
  int n,m,pass;
  std::cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
  std::cin>>m;
  for(int i=0;i<n;i++)
  {
    if(arr[i]==m)
    {
      std::cout<<"She passed her exam";
      return 0;
    }
  }
    std::cout<<"She failed";
}