#include <stdio.h>
int main() {
	int n,sum = 0,r,i,f,temp;
   scanf("%d",&n);
   temp = n;
   while(n){
     i=1,f=1;
     r = n%10;
     while(i<=r){
       f = f*i;
       i++;
     }
     sum = sum+f;
     n = n/10;
   }
  if(sum==temp)
    printf("Yes",temp);
  
    else
      printf("No",temp);
	return 0;
}
