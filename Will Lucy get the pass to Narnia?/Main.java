#include<iostream>
int main()
{
int a,b,x;
  std::cout<<"Enter first number : Enter second number : Menu\n";
 std::cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  std::cin>>a>>b>>x;
  switch(x)
  {
    case 1:
      std::cout<<a+b;
      break;
    case 2:
      std::cout<<a-b;
      break;
    case 3:
      std::cout<<a*b;
      break;
    case 4:
      std::cout<<a/b;
      break;
    case 5:
      std::cout<<a%b;
      break;
    default:
      std::cout<<"Invalid operation";
  }
}