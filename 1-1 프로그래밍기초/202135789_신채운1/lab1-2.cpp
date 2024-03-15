#include <stdio.h>
void main() {
	int i = 0;
	int t = 0;
	for (i = 100; i <= 200; i++) {
		
		if (i % 2 == 0) {
			continue;
		}
		else if (i % 3 != 0) {
			t = t + i;
		}
		else if (i % 3 == 0) {
			continue;
		}

		
	}
	printf("sum is %d", t);



}