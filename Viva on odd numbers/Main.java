#include<iostream>
#include<stdio.h>
int main()
{
   int n,count=0;
   float score=0;
   do
   {
      std::cin>>n;
      if (n<0)
      {
          score=score-1.0;
      }
      else if(n%2==1)
      {
           count++;
            score=score+1;
       }
    else
           score=score-0.5;
  }while (n>0&&count!=3);
std::cout<<score;
}