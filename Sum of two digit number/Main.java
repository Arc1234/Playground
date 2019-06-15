#include<stdio.h>
int main()
{
  int n,n1,n2,n3;
  scanf("%d",&n);
  n3 = n/10;
  n1 = n%10;
  n2 = n3+n1;
  printf("%d",n2);
  return 0;
}