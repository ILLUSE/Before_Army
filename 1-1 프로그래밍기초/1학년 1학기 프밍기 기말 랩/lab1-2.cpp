//#include <stdio.h>
//
//void modifyArray(int b[], int);
//void modifyElement(int c[], int,int);
//void printArray(int in[]);
//
//void main() {
//	int a[5] = { 0, };
//	int i, index, value;
//	puts("Get input value:");
//	for (i = 0; i < 5; i++)scanf_s("%d", &a[i]);
//	printArray(a);
//
//	puts("Modify Array(multify all=======");
//	printf("Get value to change: ");
//	scanf_s("%d", &value);
//	printf("%d\n", value);
//	modifyArray(a, value);
//
//	puts("Modify Element(multify all=======");
//	printf("Get index and value to change: ");
//	scanf_s("%d", &index);
//	scanf_s("%d", &value);
//	printf("%d\n", index);
//	printf("%d\n", value);
//	modifyElement(a, index, value);
//
//}
//
//
//
//void modifyArray(int b[], int value) {
//	for (int i = 0; i < 5; i++) {
//		b[i] = b[i] * value;
//		printf("%4d", b[i]);
//	}
//}
//
//void modifyElement(int c[], int index, int value) {
//	c[index] = c[index] + value;
//	for (int i = 0; i < 5; i++) {
//		printf("%4d", c[i]);
//	}
//}
//
//void printArray(int in[]) {
//	for (int i = 0; i < 5; i++) {
//		printf("%4d", in[i]);
//	}
//}