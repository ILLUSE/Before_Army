#define _CRT_SECURE_NO_WARNINGS
#define MAX 30
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include<malloc.h>

struct Person {
	int tag;
	int year;//중간의 -때문에 3개로 나눴습니다
	int month;
	int day;
	char feepaid[5];
	char name[25];
	int age;
	char company[35];
	char job[15];
};

struct NODE {
	int tag;
	int year;//중간의 -때문에 3개로 나눴습니다
	int month;
	int day;
	char feepaid[5];
	char name[25];
	int age;
	char company[35];
	char job[15];
	struct NODE* next;//다음노드 주소 저장포인터
}node[MAX];

char filename[] = "registraion_data.txt";
char outfilename[] = "textfile 4-1.txt";
void struct_setup(char[], struct Person[]);
void linkedlist_setup(char[]);
void search_arr(struct Person[], char[]); //P1-1
void search_link(struct NODE[], char[]); //P1-2
void searchJob_arr(struct Person[], char[]); //P2-1
void searchJob_link(struct NODE[], char[]); //P2-2
void sort_tag(struct Person*); // P3-1
void sort_age(struct Person*); // P4-1
void write_file(char[], struct Person[], int); // P4-1
void linkedlist_sort(char filename[], struct NODE*);
int Remove_arr(struct Person*, char[]);//P6-1
struct NODE* Remove_link(struct NODE*, char[]);//P6-2
void append_arr(struct Person*, int, struct Person);//P7-1
void append_link(struct NODE, struct NODE*);//P7-2

//checksum
void Checksum(struct Person* person);
void copied_Checksum(struct Person* person);
void compare(int checksum);
int checksum = 1;

void main() {
	char keystr[] = "Kim";
	char keyJob[] = "engineer";
	struct Person person[MAX];
	struct NODE age_sorted[MAX];
	struct_setup(filename, person);
	linkedlist_setup(filename);
	search_arr(person, keystr);
	search_link(node, keystr);
	searchJob_arr(person, keyJob);
	searchJob_link(node, keyJob);;

	sort_tag(person);

	/*for (int i = 0; i < 30; i++)
	{
		printf("\n%d/%d-%d-%d/%s/%s/%d/%s/%s",
			person[i].tag, person[i].year, person[i].month, person[i].day, person[i].feepaid, person[i].name, person[i].age, person[i].company, person[i].job);
	}*/

	sort_age(person);
	write_file(outfilename, person, MAX);

	linkedlist_sort(outfilename, age_sorted);

	int count = 0;
	count = Remove_arr(person, keystr);
	struct NODE* start = Remove_link(node, keystr);
	/*while (start != NULL) {
		printf("\n%d/%d-%d-%d/%s/%s/%d/%s/%s", start->tag, start->year, start->month, start->day, start->feepaid, start->name, start->age, start->company, start->job);
		start = start->next;
	}*/
	count = MAX - count;//Now count is append data`s index num

	struct Person input_arr = { MAX + 1 , 2021, 11 , 30 , "yes" , "Gildong Kang" , 25 , "Gachon","Student" };
	append_arr(person, count, input_arr);
	/*for (int i = 0; i <= count; i++)
	{
		printf("\n%d/%d-%d-%d/%s/%s/%d/%s/%s",
			person[i].tag, person[i].year, person[i].month, person[i].day, person[i].feepaid, person[i].name, person[i].age, person[i].company, person[i].job);
	}*/
	struct NODE input_link = { MAX + 1 , 2021, 11 , 30 , "yes" , "Gildong Kang" , 25 , "Gachon","Student",NULL };
	struct NODE* new_node = (struct NODE*)malloc(sizeof(struct NODE));
	append_link(input_link, new_node);
	start = node;
	/*while (start != NULL) {
		printf("\n%d/%d-%d-%d/%s/%s/%d/%s/%s", start->tag, start->year, start->month, start->day, start->feepaid, start->name, start->age, start->company, start->job);
		start = start->next;
	}
	free(new_node);*/
	
	Checksum(person); //P8
	copied_Checksum(person);
	compare(checksum);

}

void struct_setup(char filename[], struct Person person[]) {
	FILE* f = NULL;
	f = fopen(filename, "rt");
	if (f == NULL) {
		printf("Could not found file");
		exit(1);
	}
	for (int i = 0; i < 30; i++) {
		//printf("5\n");

		if ((fscanf(f, "%d/%d-%d-%d/%[^/]/%[^/]/%d/%[^/]/%s\n", &person[i].tag, &person[i].year, &person[i].month, &person[i].day, person[i].feepaid, person[i].name, &person[i].age, person[i].company, person[i].job)) == NULL) {
			printf("Could not found file");
			exit(1);
		};//%[^/]는 /가 나오기 전까지 모두 읽는것입니다
		//printf("%d/%d/%d/%d/%s/%s/%d/%s/%s \n", person[i].tag, person[i].year, person[i].month, person[i].day, person[i].feepaid, person[i].name, person[i].age, person[i].company, person[i].job);
	}
	fclose(f);
}
void linkedlist_setup(char filename[]) {
	int i = 0;
	FILE* f = fopen(filename, "r");
	if (f != NULL) {
		while (fscanf(f, "%d/%d-%d-%d/%[^/]/%[^/]/%d/%[^/]/%s\n", &node[i].tag, &node[i].year, &node[i].month, &node[i].day, &node[i].feepaid, &node[i].name, &node[i].age, &node[i].company, &node[i].job) != EOF) {//파일이 끝날때까지	
			node[i].next = NULL;
			if (i == 29) {
				node[i].next = NULL;
				break;
			}
			node[i].next = &node[i + 1];
			//printf("%d\n", i);
			i++;
		}

	}
	//printf("%d", node[1].age);

	//중간에 건너뜀
	fclose(f);
}

void search_arr(struct Person person[], char key[]) {
	//P1-1
	for (int i = 0; i < MAX; i++) {
		char* name = person[i].name;
		if (strstr(name, key) != NULL) {
			//printf("%d/%d-%d-%d/%s/%s/%d/%s/%s\n", person[i].tag, person[i].year, person[i].month, person[i].day, person[i].feepaid, person[i].name, person[i].age, person[i].company, person[i].job);
		}
	}
}

void search_link(struct NODE node[], char key[]) {
	//P1-2
	struct NODE* ptr;
	ptr = &node[0];
	while (ptr) {
		if (strstr(ptr->name, key) != NULL) {
			//printf("%d/%d-%d-%d/%s/%s/%d/%s/%s\n", ptr->tag, ptr->year, ptr->month, ptr->day, ptr->feepaid, ptr->name, ptr->age, ptr->company, ptr->job);
		}
		ptr = ptr->next;
	}
}

void searchJob_arr(struct Person person[], char key[]) {
	//P2-1
	for (int i = 0; i < MAX; i++) {
		if (strcmp(person[i].company, "Gachon University") == 0 && strcmp(person[i].job, key) == 0) {
			//printf("%d/%d-%d-%d/%s/%s/%d/%s/%s\n", person[i].tag, person[i].year, person[i].month, person[i].day, person[i].feepaid, person[i].name, person[i].age, person[i].company, person[i].job);
		}
	}
}

void searchJob_link(struct NODE node[], char key[]) {
	//P2-2
	struct NODE* ptr;
	char searchKey[] = "Kim";
	ptr = &node[0];
	while (ptr) {
		if (strcmp(ptr->company, "Gachon University") == 0 && strcmp(ptr->job, key) == 0) {
			//printf("%d/%d-%d-%d/%s/%s/%d/%s/%s\n", ptr->tag, ptr->year, ptr->month, ptr->day, ptr->feepaid, ptr->name, ptr->age, ptr->company, ptr->job);
		}
		ptr = ptr->next;
	}
}
void sort_tag(struct Person* ptr)
{
	int lowest; // store the minimum value between range i<= value <= 29
	struct Person  switch_2; // store the current value for switch 

	for (int i = 0; i < 30; i++)
	{
		lowest = i; // if you complete changing, go to next tag for sort
		for (int j = i; j < 30; j++)
		{// looking for the minimum
			if (ptr[j].tag < ptr[lowest].tag) //store and update the minimum value
				lowest = j;
			else
				continue;
		}
		switch_2 = ptr[i]; // store the current value
		ptr[i] = ptr[lowest]; // switching
		ptr[lowest] = switch_2; // switch complete
	}

}
void sort_age(struct Person* ptr)
{
	int minimum = 0;
	struct Person switch_2;

	for (int i = 0; i < 30; i++)
	{
		minimum = i;
		for (int j = i; j < 30; j++)
		{
			if (ptr[j].age < ptr[minimum].age)
				minimum = j;
			else
				continue;
		}
		switch_2 = ptr[i];
		ptr[i] = ptr[minimum];
		ptr[minimum] = switch_2;
	}
}
void write_file(char outfile[], struct Person data[], int length)
{
	FILE* ofile;

	ofile = fopen(outfile, "w");

	if (ofile == NULL)
	{
		printf("The file could not be opened\n");
		return;
	}
	else
	{
		for (int i = 0; i < length; i++)
		{
			fprintf(ofile, "%d/%d-%d-%d/%s/%s/%d/%s/%s\n",
				data[i].tag, data[i].year, data[i].month, data[i].day, data[i].feepaid, data[i].name, data[i].age, data[i].company, data[i].job);

		}
		fclose(ofile);
	}
}
void linkedlist_sort(char filename[], struct NODE* ptr) {
	int i = 0;
	FILE* f = fopen(filename, "r");

	if (f == NULL)
	{
		printf("The file could not be opened");
		return;
	}
	else
	{
		while (fscanf(f, "%d/%d-%d-%d/%[^/]/%[^/]/%d/%[^/]/%s\n", &ptr[i].tag, &ptr[i].year, &ptr[i].month, &ptr[i].day, &ptr[i].feepaid, &ptr[i].name, &ptr[i].age, &ptr[i].company, &ptr[i].job) != EOF) {//파일이 끝날때까지	
			ptr[i].next = NULL;
			ptr[i].next = &ptr[i + 1];
			//printf("%d\n", i);
			i++;
		}
		printf("\n\nSucceed linking age sorted data \n");
	}
	//printf("%d", node[1].age);

	//중간에 건너뜀
	fclose(f);
}
//Return value: the number of deleted data
int Remove_arr(struct Person* input, char key[]) {
	int i = 0, index, y = 0, count = 0;;
	while (i < 30) {//P6-1
		if (strstr(input[i].name, key) != NULL) {
			count++;
			index = i;
			while (index < 29) {
				(input + index)->age = (input + index + 1)->age;

				while ((input + index + 1)->company[y] != NULL) {
					(input + index)->company[y] = (input + index + 1)->company[y];
					y++;
				}
				(input + index)->company[y] = NULL;

				(input + index)->day = (input + index + 1)->day;

				y = 0;
				while ((input + index + 1)->company[y] != NULL) {
					(input + index)->feepaid[y] = (input + index + 1)->feepaid[y];
					y++;
				}
				(input + index)->feepaid[y] = NULL;

				y = 0;
				while ((input + index + 1)->job[y] != NULL) {
					(input + index)->job[y] = (input + index + 1)->job[y];
					y++;
				}
				(input + index)->job[y] = NULL;

				(input + index)->month = (input + index + 1)->month;

				y = 0;
				while ((input + index + 1)->name[y] != NULL) {
					(input + index)->name[y] = (input + index + 1)->name[y];
					y++;
				}
				(input + index)->name[y] = NULL;

				(input + index)->tag = (input + index + 1)->tag;

				(input + index)->year = (input + index + 1)->year;
				index++;
			}
		}
		i++;
	}

	//for(int i=0;i<30-count;i++)
		//printf("\n%d/%d-%d-%d/%s/%s/%d/%s/%s",input[i].tag, input[i].year, input[i].month, input[i].day, input[i].feepaid, input[i].name, input[i].age, input[i].company, input[i].job);
	return count;
}

struct NODE* Remove_link(struct NODE* input, char key[]) {
	struct NODE* p = input, * start;
	start = input;
	if (strstr((p)->name, key) != NULL) {
		start = p->next;
	}
	while (p != NULL) {

		if (strstr((p->next)->name, "Kim") != NULL) {
			if ((p->next)->next == NULL) {
				p->next = NULL;
			}
			else {
				p->next = (p->next)->next;
			}
		}

		p = p->next;

	}

	return start;
}
void append_arr(struct Person* input, int count, struct Person key) {
	//P7-1
	input[count] = key;

}
void append_link(struct NODE key, struct NODE* new_node) {
	//P7-2
	struct NODE* p = node;
	while (p->next != NULL) {
		p = p->next;
	}
	p->next = new_node;
	if (p->next == NULL) {
		printf("ERROR!!");
		exit(1);
	}
	p = p->next;
	*p = key;
}

void Checksum(struct Person* person) { //P8

	FILE* infile = NULL;
	infile = fopen("textfile 4-1.txt", "r");
	if (infile == NULL) {
		printf("\nInput File Could Not Be Opened.\n");
		exit(1);
	}
	int counter1 = 0, counter2 = 0;
	while ((fscanf(infile, "%d/%d-%d-%d/%[^/]/%[^/]/%d/%[^/]/%s\n", &person[counter1].tag, &person[counter1].year, &person[counter1].month, &person[counter1].day, person[counter1].feepaid, person[counter1].name, &person[counter1].age, person[counter1].company, person[counter1].job) == 9)) {
		counter1++;
		counter2++;
	}

	FILE* outfile = NULL;
	outfile = fopen("8-1.txt", "w");
	if (outfile == NULL) {
		printf("\nInput File Could Not Be Opened.\n");
		exit(1);
	}
	int value1 = counter1;
	int value2 = counter2;
	for (counter1 = counter1 - 1; counter1 > value1-6; counter1--) {  //check the checksum
		checksum |=checksum + *person[counter1].name;  //|= 는 비트연산자입니다
	}
	fprintf(outfile, "%d\n", checksum);

	for (counter2 = counter2 - 1; counter2 > value2-6; counter2--) {
		fprintf(outfile, "%s\n", person[counter2].name); //show 5 data from back
	}
	fclose(infile);
	fclose(outfile);

}

void copied_Checksum(struct Person* person) { //copy and make copied file 

	FILE* infile = NULL;
	infile = fopen("8-1.txt", "r");
	if (infile == NULL) {
		printf("\nInput File Could Not Be Opened.\n");
		exit(1);
	}
	FILE* outfile = NULL;
	outfile = fopen("copied_data.txt", "w");
	if (outfile == NULL) {
		printf("\nInput File Could Not Be Opened.\n");
		exit(1);
	}
	
	char ch = fgetc(infile); //copy

	while (!feof(infile))
	{
		fputc(ch, outfile);
		ch = fgetc(infile);
	}
	fclose(infile);
	fclose(outfile);

}

void compare(int checksum) {       //compare checksum 
	FILE* infile = NULL;
	infile = fopen("copied_data.txt", "r");
	if (infile == NULL) {
		printf("\nInput File Could Not Be Opened.\n");
		exit(1);
	}
	
	int copied_checksum = 0;
	int counter = 0;
	char ch = fgetc(infile);
	char name[100];

	while (fscanf(infile, "%s", &name[counter]) != EOF)
	{
		counter++;
	}
	int value = counter;
	for (counter = counter - 1; counter > value-6; counter--) {
		copied_checksum |= copied_checksum + name[counter];
	}
	if (copied_checksum != checksum)
		printf("\nDifferent Checksum / Origin: %d, Copied: %d ", checksum, copied_checksum);
	else
		printf("\nSame Checksum / Checksum : %d\n", copied_checksum);
	fclose(infile);
}

