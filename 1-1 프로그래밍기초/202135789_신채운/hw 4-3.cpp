#include <stdio.h>
#include <math.h>

void root(int, int, int);

void main() {
	int a, b, c = 0;
	printf("The coefficients of ax^2 + bx + c = 0\n");
	printf("Enter values of a,b and c: ");
	scanf_s("%d %d %d", &a, &b, &c);

	root(a, b, c);
}

void root(int a, int b, int c) {
	float root1,root2,D = 0;

	D = b * b - 4 * a * c;
	D = sqrt(D);

	root1 = (-b + D) / (2 * a);
	root2 = (-b - D) / (2 * a);

	if (D > 0) {
		printf("Two real and distinct roots\n");
		printf("Roots are %f and %f", root1, root2);
	}
	else if (D == 0) {
		printf("Two real and eqal roots");
		printf("Roots are %f and %f", root1, root2);
	}
	else {
		printf("Roots are imaginary");
	}
}