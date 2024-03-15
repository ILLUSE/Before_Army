#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
/*
file name : [0930] Practice Result
author : 202135789 ╫ец╓©Н
date : 10/3
Course : Problem Solving Methods
description :
-Store the dataset in a struct array(Each line contains name,age and hobby)
-create an index (struct array) by name in the order in the dataset
-For names(Lee and Park),do the following:
(*You should write a function and call it twice , once lee, once Park)
-Search the index for a name,and find and print the (name) age and hobby in the dataset corresponding to the name.
*/

struct dataset {

	char name[10];
	int age;
	char hobby[10];

};

struct {
	char name[10];
}index[5];

struct dataset dataset[5];

void search(char[]);

void main() {

	strcpy(dataset[0].name, "Kim");       // store dataset 
	dataset[0].age = 39;
	strcpy(dataset[0].hobby, "Tennis");

	strcpy(dataset[1].name, "Ko");
	dataset[1].age = 15;
	strcpy(dataset[1].hobby, "Soccer");

	strcpy(dataset[2].name, "Lee");
	dataset[2].age = 17;
	strcpy(dataset[2].hobby, "Soccer");

	strcpy(dataset[3].name, "Choi");
	dataset[3].age = 21;
	strcpy(dataset[3].hobby, "Tennis");

	strcpy(dataset[4].name, "Park");
	dataset[4].age = 10;
	strcpy(dataset[4].hobby, "Tennis");


	for (int i = 0; i < 5; i++) {                 

		strcpy(index[i].name, dataset[i].name);

	}

	char partner[10];

	printf("\nPlease type name: ");
	gets_s(partner);

	search(partner);                     //first function call

	printf("\nPlease type name: ");
	gets_s(partner);

	search(partner);                     // second function call

}

void search(char partner[10]) {


	for (int i = 0; i < 5; i++) {
		if (strcmp(partner, index[i].name) == 0) {
			printf("Name: %s / Age: %d / Hobby: %s", dataset[i].name, dataset[i].age, dataset[i].hobby);
		}
		else {
			continue;
		}
	}
}