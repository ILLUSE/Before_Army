
#include <stdio.h>


void main( )
{
	float weight, height, BMI;

	printf("type your weight: ");
	scanf_s("%f", &weight);

	printf("type your height: ");
	scanf_s("%f", &height);

	BMI = weight * 703 / height * height;

	if (BMI < 18.5)
	{
		printf("you are underweight");
	}

	else if ((BMI >= 18.5) && (BMI <= 24.9))
	{
		printf("you are normal");
	}

	else if ((BMI > 24.9) && (BMI <= 29.9))
	{
		printf("you are overweight");
	}

	else if (BMI > 29.9)
		printf("you are obese");

}
