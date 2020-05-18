#include<iostream>
using namespace std;
int power(int a,int n)
{
  if(n!=0)
    return (a*power(a,n-1));
  else
    return 1;
}
int main()
{
  int a,n;
  std::cin>>a>>n;
  cout<<"Enter the value of a\n";
  cout<<"Enter the value of n\n";
  int ans=power(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<ans;
}