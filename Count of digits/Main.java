#include<iostream>
int main()
{
    long num;
    int count = 0;   
    std::cin>>num;
    do
    {
        count++;
        num=num/10;
    } while(num != 0);

    std::cout<<count;
}