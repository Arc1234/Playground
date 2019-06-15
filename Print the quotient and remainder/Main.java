#include<stdio.h>
int main()
{
  int quotient;
  int remainder;
  int a = 365;
  int b = 4;
  quotient = a/b;
  remainder = a%b;
  printf("Quotient: %d", quotient);
  printf("\nRemainder: %d", remainder);
  return 0;
}