#include <stdio.h>

void star(char,int,int);

void main() {
	char fill;
	int rows = 0;
	int cols = 0;

	printf("Type char what you want: ");
	scanf_s("%c", &fill);

	printf("Type how many rows: ");
	scanf_s("%d", &rows);

	printf("Type how many cols: ");
	scanf_s("%d", &cols);

	star(fill,rows, cols);
}

void star(char fill,int rows, int cols) {
	for (int i = 1; i <= rows; i++) {
		for (int t = 1; t <= cols; t++) {
			printf("%c ",fill);
			if (t == cols) {
				printf("\n");
			}
		}
	}
}