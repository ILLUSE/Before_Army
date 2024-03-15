#include <stdio.h>

void main()

{
	float u, a, t, v, s;

	u = 0;
	a = 0;
	t = 0;
	v = 0;
	s = 0;

	printf("\ntype initial velocityand: \n");
	scanf_s("%f", &u);

	printf("\ntype acceleration: \n");
	scanf_s("%f", &a);

	printf("\ntype time: \n");
	scanf_s("%f", &t);

	v = u + a * t;
	s = u * t + 0.5 * a * t * t;

	printf("\nv=%f", v);
	printf("\ns=%f", s);
}