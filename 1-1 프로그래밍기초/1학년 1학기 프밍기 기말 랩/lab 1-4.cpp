#include <stdio.h>
void update(int, char[], char[], char[]);
void main() {
	int location;
	char input[100], insert[100], result[100];
	printf("Input a string: ");
	gets_s(input);
	printf("Enter insert location (index)");
	scanf_s("%d", &location);
	getchar();
	printf("Enter insert word: ");
	gets_s(insert);
	update(location, input, insert, result);
	puts(result);

}

void update(int index, char input[], char insert[], char result[]) {

	int num= 0;
	int k = 0;
	for (int k = 0; k < 100; k++) {
		if (input[k] != '\0') num += 1;
	}

	for (int i = index; i < index + num; i++) {
		
		input[i + num] = input[i];
		input[i] = insert[k];
		k++;

	}

	for (int i = 0; i < 100; i++) {
		if (i == num)continue;
		result[i] = input[i];
		if (input[i] == '\0') break;
	}
	
	for (int i = 0; i < 100; i++) {
		printf("%c", result[i]);
		if (result[i] == '\0') break;
	}
}