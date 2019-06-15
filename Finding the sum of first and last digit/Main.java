#include <stdio.h>
int main() {
   int n,first,last,sum=0;
  scanf("%d",&n);
  last = n%10;
  first = n;
  while(n>=10){
    n = n/10;
  }
  first = n;
  sum = last + first;
  printf("%d",sum);
	return 0;
}