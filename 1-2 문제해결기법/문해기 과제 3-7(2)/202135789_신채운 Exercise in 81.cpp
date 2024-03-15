#include <stdio.h>
/*
Author:Shin Chae Un 202135789
Date:9/26
Course number:13967_002

-Write a C program that computes and prints the total salaries of people.
The program receives 5 base salaries (float) and 5 overtime payments
(float), stores them in arrays base and overtime. The program calls a
function void totpay with 3 array arguments, base, overtime and total.
-totpay computes the total pay for each person by adding the base salary
and overtime payment, and storing the result in total.
-The main program prints total.

-write [] in function prototype
*/
void totpay(float[], float[], float[]);

void main() {

	float base[5] = { 0, };
	float overtime[5] = { 0, };
	float total[5] = { 0, };

	for (int i = 0; i < 5; i++) {

		printf("\nPlease type %d's base: ", i + 1);
		scanf_s("%f", &base[i]);

	}

	for (int i = 0; i < 5; i++) {

		printf("\nPlease type %d's overtime: ", i + 1);
		scanf_s("%f", &overtime[i]);

	}

	totpay(base, overtime, total);


	for (int i = 0; i < 5; i++) {

		printf("\n%d's total is %f", i + 1, total[i]);

	}

}

void totpay(float base[5], float overtime[5], float total[5]) {

	for (int i = 0; i < 5; i++) {

		total[i] = base[i] + overtime[i];

	}
}



