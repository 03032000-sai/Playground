#include<iostream>
using namespace std;
int main()
{
    int n1,n2,n3,n4;
    int small=0;
    std::cin>>n1>>n2>>n3;
    if(n1<=n2&&n1<=n3)
    small=n1;
else if(n2<=n1&&n2<=n3)
    small=n2;
else
    small=n3;
  if(n1>=n2 && n1 >= n3)
    {
        if(n2 >= n3)
        {
            cout<<"The treasure is in box which has number "<<n2;
        }
        else
        {
            cout<<"The treasure is in box which has number "<<n3;
        }
    }
    else if(n2 >= n1 && n2 >= n3)
    {
        if(n1 >= n3)
        {
            cout<<"The treasure is in box which has number "<<n1;
        }
        else
        {
            cout<<"The treasure is in box which has number "<<n3;
        }
    }

    else if(n1 >= n2)
    {
        cout<<"The treasure is in box which has number "<<n1;
    }
    else
    {
        cout<<"The treasure is in box which has number "<< n2;
    }
    int gcd=0;
    while(small>=1)
    {
        if(n1%small==0&&n2%small==0&&n3%small==0)
        {  
          gcd=small;
            break;
        }
        small--;
    }
std::cout<<"\nThe code to open the box is "<<gcd;
  
}