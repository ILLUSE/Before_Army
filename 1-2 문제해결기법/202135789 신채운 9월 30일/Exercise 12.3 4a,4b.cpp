 #include <stdio.h>
/*
file name : Exercise 12.3 4a,4b
author : 202135789 ╫ец╓©Н
date : 9 / 30
Course : Problem Solving Methods
description :
Get two different dates
function should return recently date
*/


struct Date1 {

	int month[2];
	int day[2];
	int year[2];

};

struct recent_date {

	int month;
	int day;
	int year;

};

struct Date1 Date1;
struct recent_date recent_date;

struct recent_date recent(int[], int[], int[]);

void main() {

	printf("The first Date\n");     //store date
	printf("Please type month: ");
	scanf_s("%d", &Date1.month[0]);
	printf("Please type day: ");
	scanf_s("%d", &Date1.day[0]);
	printf("Please type year: ");
	scanf_s("%d", &Date1.year[0]);

	printf("The second Date\n");
	printf("Please type month: ");
	scanf_s("%d", &Date1.month[1]);
	printf("Please type day: ");
	scanf_s("%d", &Date1.day[1]);
	printf("Please type year: ");
	scanf_s("%d", &Date1.year[1]);


	printf("\nfirst date is %d/%d/%d", Date1.month[0], Date1.day[0], Date1.year[0]);

	printf("\nSecond date is %d/%d/%d\n", Date1.month[1], Date1.day[1], Date1.year[1]);

	printf("\nRecently date is %d/%d/%d", recent_date.month, recent_date.day, recent_date.year);


}

struct recent_date recent(int month[2], int day[2], int year[2]) {   

	if (recent_date.year < year[1]) {            //loop for compare which one is more recent
		recent_date.month = month[0];
		recent_date.day = day[0];
		recent_date.year = year[0];
	}
	else if (recent_date.year > year[1]) {

	}
	else if (recent_date.year = year[1]) {
		if (recent_date.month < month[1]) {
			recent_date.month = month[0];
			recent_date.day = day[0];
			recent_date.year = year[0];
		}
		else if (recent_date.month > month[1]) {

		}
		else if (recent_date.month = month[1]) {
			if (recent_date.day < day[1]) {
				recent_date.month = month[0];
				recent_date.day = day[0];
				recent_date.year = year[0];
			}
			else if (recent_date.day > day[1]) {

			}
			else if (recent_date.day = day[1]) {
				recent_date.month = month[0];
				recent_date.day = day[0];
				recent_date.year = year[0];
			}
		}
	}

	return recent_date;

}













