#include<iostream>
using namespace std;
int main()
{
  int w,a,c;
  std::cin>>w>>a>>c;
  if((a*75)+(c*30)<=w)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}