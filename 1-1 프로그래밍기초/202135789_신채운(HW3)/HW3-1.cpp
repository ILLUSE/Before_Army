#include <stdio.h>

void main()
{
	int i, k,g;
	i, k,g= 0;

	printf("type a number: ");
	scanf_s("%d", &i);

	for (k = 2; k <= (i - 1); k++) {
		
		if (i == 1) {
			break;
		}

		if ((i % k) == 0) {
			g = g + 1;
		}
		
	}
	if(i == 1) { printf("number is not prime number."); }
	else if (g == 0) { printf("number is prime number"); }
	else if (g != 0) { printf("number is not prime number."); }

}





