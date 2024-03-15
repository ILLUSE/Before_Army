#include <stdio.h>
void main() {
	int N1, N2 = 0;
	printf("please type N1\n");
	scanf_s("%d", &N1);
	printf("please type N2\n");
	scanf_s("%d", &N2);

	if (N1 % 2 == 0 && N1 > 0) {
		printf("%d, %d,N1-N2=%d", N1, N2, N1 - N2);
	}
	if (N1 % 2 != 0 && N1 < 0) {
		printf("%d, %d,N1+N2=%d", N1, N2, N1 + N2);
	}



}