#include<iostream>
using namespace std;
int main()
{
  int l,d;
  float m;
  cin>>m;
  cin>>l;
  cin>>d;
  if((m*l)>d||(m*l)==d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}