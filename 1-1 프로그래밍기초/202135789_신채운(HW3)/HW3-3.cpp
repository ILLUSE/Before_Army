#include <stdio.h>

void main()
{
	int i,k,p=0;
	int one, two, three, four, five = 0;
	printf("please type five digit number:");
	scanf_s("%d", &i);

	one = i / 10000;
	two = i % 10000 / 1000;
	three = i % 1000 / 100;
	four = i % 100 / 10;
	five = i % 10 / 1;

		if ( one == 7) {
			p = p + 1;
		}
		if (two == 7) {
			p = p + 1;
		}
		if (three == 7) {
			p = p + 1;
		}
		if (four == 7) {
			p = p + 1;
		}
		if (five == 7) {
			p = p + 1;
		}
	printf("the number %d has  %d sevens.",i,p);
}