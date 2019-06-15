#include<stdio.h>
int main()
{
  int perimeter;
  int area;
  int l = 6;
  int b = 9;
  perimeter = 2*(l+b);
  area = l*b;
  printf("The perimeter of the rectangle is: %d cm", perimeter);
  printf("\nThe area of the rectangle is: %d sq cm", area);
  return 0;
}