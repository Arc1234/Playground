#include<stdio.h>

int main()
{
  int n;
  int r;
  scanf("%d",&n);
  if(n%2==0){
    r = (n/2)-1;
    printf("%d",r);
  } else 
  {
      if(n%2==1)
        r= n-1;
  printf("%d",r); 
  }
  return 0;
}
