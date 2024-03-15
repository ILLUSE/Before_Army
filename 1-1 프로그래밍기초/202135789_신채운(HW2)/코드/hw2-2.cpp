#include <stdio.h>

void main()
{
	//int num,num1,num2,num3,num4,num5;

	//num = 0;
	//num1 = 0;
	//num2 = 0;
	//num3 = 0;
	//num4 = 0;
	//num5 = 0;
	

	//printf("\ntype five-digit number: \n");
	//scanf_s("%d", &num);

	//num1 = num / 10000;
	//num2 = num % 10000 / 1000;
	//num3 = num % 1000 / 100;
	//num4 = num % 100 / 10;
	//num5 = num % 10 / 1;

	//printf("%d   %d   %d   %d   %d", num1, num2, num3, num4, num5);

	int i, j;
	for (i = 1; i <= 9; i = i + 1)

	{
		printf("\n\n %d ´Ü", i);
		printf("\n------------");
		
		for (j = 1; j <= 9; j = j + 1)
		{
			printf("\n%d x %d = %d", i, j, i * j);
		}
	}




}




	
