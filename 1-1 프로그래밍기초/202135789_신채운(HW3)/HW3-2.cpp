#include <stdio.h>

void main()
{
	int i, one , two, four,five;

	i, one, two, four, five = 0;

	printf("type five digit number:");
	scanf_s("%d", &i);

	one = i / 10000;
	two = i % 10000 / 1000;
	four = i % 100 / 10;
	five = i % 10 / 1;

	if (one == five && two == four) {
		printf("%d is palindrome",i);
	}
	else if (one!=five || two!=four){
		printf("%d is not palindrome",i);
	}
}