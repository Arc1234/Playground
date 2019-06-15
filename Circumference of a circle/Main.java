#include <stdio.h>
int main(){
   float r;
  float circumference;
  float pi = 3.14;
  scanf("%f",&r);
  circumference = pi*r*r;
  printf("%.2f",circumference);
  return 0;
}