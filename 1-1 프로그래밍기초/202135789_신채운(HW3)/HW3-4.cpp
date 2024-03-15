#include <stdio.h>
void main()
{
	float i, t=0;
	int k, h=0;

	printf("type positive float number(N): ");
	scanf_s("%f", &i);
	if (i <= 0) {
		printf("I said type positive float number! Type again: ");
		scanf_s("%f", &i);
	}
	t = i;

	printf("type integer number(P): ");
	scanf_s("%d", &k);

	for (h = 1; h <= (k-1); h++) {

		i = i * t;
	}
	if (k == 0) {
		printf("result N^P=1");
	}
	else if (k!=0) {
		printf("result N^P is %f", i);
	}


}