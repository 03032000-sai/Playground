#include<iostream>
using namespace std;
int main()
{
  float t;
  int i;
  std::cin>>i>>t;
  switch(i) {
    case 2:
      std::cout<<t+(t/2);
      break;
    case 3:
      std::cout<<t+t;
      break;
    default:
      std::cout<<"Number of items is more";
  }
}