#include <stdio.h>
int main() {
	int n;
    int i,f;
    i=f=1;
    scanf("%d",&n);
   while(i<=n){
     f = f*i;
     i++;
   }
  printf("%d",f);
	return 0;
}