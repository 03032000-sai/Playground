#include<iostream>
using namespace std;
int main()
{
    int r,c;
  int arrt[100][100];
  cin>>r>>c;
  int arr[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
     arrt[j][i]=arr[i][j];     
    }
  }
 for(int i=0;i<c;i++)
 {
   for(int j=0;j<r;j++)
   {
     cout<<arrt[i][j]<<" ";
     if(j==r-1)
       cout<<"\n";
   }
 }
}