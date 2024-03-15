#include <stdio.h>
void main() {
	
	int array[81];
	int i,t = 0;
	int largest, lowest = 0;
	float total, average = 0;

	for (t = 0; t <= 79; t++) {
		printf("type an integer: ");
		scanf_s("%d", &i);
		if (i == -1) {
			break;
		}
		array[t] = i;
		
	}

	largest = 0;
	lowest = 0;

	for (int h = 0; h <= t; h++) {
		if (array[h] == -1) {
			break;
		}
		if (largest < array[h]) {
			largest = array[h];
		}
		if (lowest ==0) {
			lowest == array[0];
			}
		else if (lowest < array[h]) {
			lowest = array[h];
		}
			
		
		
	}

	
	total = 0;
	for (int d = 0; d <= t; d++) {
		total = total + array[d];
	}

	printf("largest: %d,lowest: %d, and average : %f", largest, lowest, total / t);
}