#include<stdio.h>
int main()
{
  int n1,n2,n,sum;
  scanf("%d",&n1);
  n = n1%10;
  n2 = n1/100;
  sum = n+n2;
  printf("%d",sum);
  return 0;
}