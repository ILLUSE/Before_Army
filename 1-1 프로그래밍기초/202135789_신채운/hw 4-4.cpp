#include <stdio.h>

int sum(int);

void main() {
	int num;
	printf("Enter a number between 1 and 9999: ");
	scanf_s("%d", &num);

	printf("The sum of the digits of the number %d is %d", num, sum(num));
}
int sum(int num) {

	int number[4] = { 0, };
	int count = 1;
	int total = 0;

	if (num / 10 >= 1) {
		count = 2;
	}
	if (num / 100 >= 1) {
		count = 3;
	}
	if(num / 1000>= 1){
		count = 4;
	}
	
	number[3] = num / 1000;
	number[2] = num % 1000 / 100;
	number[1] = num % 1000 % 100 / 10;
	number[0] = num % 1000 % 100 % 10 / 1;

	for (int i = 0; i < count; i++) {
		total += number[i];
	}

	return total;
}