#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>

/*

name:Shin Chae Un
Date:11/2
Student number: 202135789
description:
1)read file and fix salary (v1 -> v2)
2)read file and fix salary (v2 -> v3)
3)write compare-file between v1 file and v3 file

*/
void func(int );      //function prototype

float ver1_salary=0;    //global variable for calculate total 
float ver3_salary=0;

void main() {
	int version = 1;
	
	func(version);           //function call

	func(version + 1);



}

void func( int version) {
	
	if (version == 1) {     //if for divide v1 and v2

		FILE* infile;                                   //file connect
		infile = fopen("salary_v1.txt", "r");

		FILE* outfile;
		outfile = fopen("salary_v2.txt", "w");

		if (infile == NULL) {
			printf("\nFile could not be found");
		}
		else {
			char name[20];
			int age;
			float salary;

			while (fscanf(infile, "%s %d %f", &name, &age, &salary) == 3) {           //calculate total,fix salary and print next version file
				ver1_salary = ver1_salary + salary;
				if (age >= 40 && age <= 49) {
					salary = salary * 0.9;
				}
				fprintf(outfile, "%s %d %f\n", name, age, salary);
			}

			

			fclose(infile);    //close file
			fclose(outfile);
		}
	}
	else if (version == 2) {

		FILE* infile;
		infile = fopen("salary_v2.txt", "r");

		FILE* outfile;
		outfile = fopen("salary_v3.txt", "w");

		if (infile == NULL) {
			printf("\nFile could not be found");
		}
		else {
			char name[20];
			int age;
			float salary;

			while (fscanf(infile, "%s %d %f", &name, &age, &salary) == 3) {
				
				if (age >= 30 && age <= 39) {
					salary = salary * 1.2;
				}
				ver3_salary = ver3_salary + salary;
				fprintf(outfile, "%s %d %f\n", name, age, salary);
			}

			

			fclose(infile);
			fclose(outfile);
		}

		FILE* file_v1;
		file_v1 = fopen("salary_v1.txt", "r");

		FILE* file_v3;
		file_v3 = fopen("salary_v3.txt", "r");

		FILE* compareFile;
		compareFile = fopen("compare_v1_v3.txt", "w");

		char name[20];
		int age;
		float v1_salary, v3_salary;

		while (fscanf(file_v1, "%s %d %f", &name, &age, &v1_salary) == 3 && fscanf(file_v3, "%s %d %f", &name, &age, &v3_salary) == 3) {           //print compare file
			
			fprintf(compareFile, "%s %d %f -> %f\n", name, age, v1_salary, v3_salary);

		}
		fprintf(compareFile, "total :  %f -> %f", ver1_salary, ver3_salary);

		fclose(file_v1);
		fclose(file_v3);
		fclose(compareFile);
		
	}




}
