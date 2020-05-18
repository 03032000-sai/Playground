#include<iostream>
using namespace std;
int main()
{
  float fs,fd,fc,ss,sd,sc,as,ad,ac,tfcd,tscd,tacd;
  cin>>fs>>fd>>fc>>ss>>sd>>sc>>as>>ad>>ac;
  tfcd=(fs-(fs*(fd/100)))+fc;
  tscd=(ss-(ss*(sd/100)))+sc;
  tacd=(as-(as*(ad/100)))+ac;
  cout<<"In Flipkart Rs."<<tfcd<<"\nIn Snapdeal Rs."<<tscd<<"\nIn Amazon Rs."<<tacd;
if (tfcd<=tscd&& tfcd<=tacd) 
        cout <<"\nHe will prefer Flipkart"; 
  
    else if (tscd<= tfcd&&tscd<=tacd) 
        cout <<"\nHe will prefer Snapdeal"; 
  
    else
        cout <<"\nHe will prefer Amazon"; 
  
    return 0;
}