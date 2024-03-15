#include <stdio.h>

void star(int,int);

void main() {
	int rows = 0;
	int cols = 0;

	printf("Type how many rows: ");
	scanf_s("%d", &rows);

	printf("Type how many cols: ");
	scanf_s("%d", &cols);

	star(rows, cols);
}

void star(int rows, int cols) {
	for (int i = 1; i <= rows; i++) {
		for (int t = 1; t <= cols; t++) {
			printf("*");
			if (t == cols) {
				printf("\n");
			}
		}
	}
}