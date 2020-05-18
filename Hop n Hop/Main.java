#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
 int x1,y1,x2,y2,d;
  x1=3;
  y1=4;
  std::cin>>x2>>y2;
  d= sqrt(pow(x2-x1,2)+pow(y2-y1,2)*1.0);
  std::cout<<d;
}
