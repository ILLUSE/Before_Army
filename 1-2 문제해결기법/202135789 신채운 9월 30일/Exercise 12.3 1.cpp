#include <stdio.h>
/**
file name : Exercise 12.3 1
author : 202135789 ╫ец╓©Н
date : 9 / 30
Course : Problem Solving Methods
description :
1 Year=360 days
1 month=30 days
function should return the number of days from 1/1/2000 
*/
struct Date {

	int month;
	int day;
	int year;

};

int Days(int, int, int);

void main() {

	struct Date Date;
	printf("Please type month: ");     //store date
	scanf_s("%d", &Date.month);
	printf("Please type day: ");
	scanf_s("%d", &Date.day);
	printf("Please type year: ");
	scanf_s("%d", &Date.year);

	printf("\nToday is %d/%d/%d", Date.month, Date.day, Date.year);

	printf("\nNumber of days: %d", Days(Date.month - 1, Date.day - 1, Date.year - 2000));

}

int Days(int month, int day, int year) {      //function for calculate days

	int sum = 0;
	sum = sum + month * 30;
	sum = sum + day;
	sum = sum + year * 360;
	return sum;
}





