#include<iostream>
int main()
{
int a,b,add,mul,sub,div,mod;
  std::cin>>a>>b;
  add=a+b;
  mul=a*b;
  sub=a-b;
  div=a/b;
  mod=a%b;
  std::cout<<"a+b="<<add<<"\na-b="<<sub<<"\na*b="<<mul<<"\na/b="<<div<<"\na%b="<<mod;
}