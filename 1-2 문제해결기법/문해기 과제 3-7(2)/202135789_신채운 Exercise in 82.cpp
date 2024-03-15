#include <stdio.h>
/*
Author:Shin Chae Un 202135789
Date:9/26
Course number:13967_002

-Write a C (main) program that reads two integers, N1 and N2, and calls a
function, calculate, by passing the addresses of N1 and N2. 
-calculate calculates N1*N2, N1/N2, N1%N2, N1+N2 and returns the four
results. The main program prints the results

- % have not use in printf
*/
void calculate(int *,int *,int *,int *,int *,int *);

void main() {
	int N1,N2;
	int result1,result2,result3,result4;

	printf("\nPlease type num1: ");
	scanf_s("%d", &N1);
	printf("\nPlease type num2: ");
	scanf_s("%d", &N2);

	calculate(&N1,&N2,&result1,&result2,&result3,&result4);

	printf("\nResult 1 is %d", result1);
	printf("\nResult 2 is %d", result2);
	printf("\nResult 3 is %d", result3);
	printf("\nResult 4 is %d", result4);
	
}
/*
calculate 4 results
*/
void calculate(int *n1, int *n2, int *re1, int *re2,int *re3, int *re4) {  
	*re1 = *n1 * *n2;
	*re2 = *n1 / *n2;
	*re3 = *n1 % *n2;
	*re4 = *n1 + *n2;
}



