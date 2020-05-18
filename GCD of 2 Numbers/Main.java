#include<iostream>
int findgcd(int n1,int n2,int small)
{
    int gcd=0;
    while(small>=1)
    {
        if(n1%small==0&&n2%small==0)
        {
            gcd=small;
            break;
        }
        small--;
    }
    return gcd;
}
int main()
{
    int n1,n2;
    int small=0;
    std::cin>>n1>>n2;
    if(n1<=n2)
    small=n1;
else
    small=n2;
    std::cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<findgcd(n1,n2,small);
}