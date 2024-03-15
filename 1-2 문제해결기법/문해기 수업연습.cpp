#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/*

name:Shin Chae Un
Date:11/3
Student number: 202135789
description:

*/

//struct node {                          
//	int key;
//	struct node* next;
//}node[3];
//
//void main() {
//
//
//	node[0].key = 100; 
//	node[1].key = 250;
//	node[2].key = 467;
//
//	node[0].next = NULL;
//	node[1].next = NULL;
//	node[2].next = NULL;
//
//	node[0].next = &node[1];
//	node[1].next = &node[2];
//}

//struct node {
//	int key;
//	struct node* next;
//};
//
//void main() {
//
//	struct node* node;
//
//	node = (struct node*) malloc(500 * sizeof(struct node));
//
//	//struct node node[500]; SAME!
//
//	if (node == NULL) {
//		printf("malloc failed");
//		exit(1);
//	}
//
//	free(node);
//
//}

//void main() {
//
//	int *nums;
//	nums = (int *)malloc(10 * sizeof(int));
//
//
//	if (nums == NULL) {
//		printf("malloc failed");
//		exit(1);
//	}
//
//	nums[0] = 1;        //use like nums[10]
//	nums[1] = 2;
//
//	printf("%d %d", nums[0], nums[1]);
//
//	free(nums);
//}

//void main() {
//	int *nums;
//	nums = (int *)malloc(10 * sizeof(int));
//
//	if (nums == NULL) {
//		printf("malloc failed");
//		exit(1);
//	}
//
//	for (int i = 0; i < 10; i++) {
//		printf("Type %d`s integer: ",i+1);
//		scanf_s("%d", &nums[i]);
//	}
//
//	for (int i = 0; i < 10; i++) {
//		printf("%d ", nums[i]);
//	}
//
//	free(nums);
//
//}

//struct NODE {
//	int key;
//	struct NODE* next;
//};
//
//void main() {
//	struct NODE* node;
//
//	node = (struct NODE*)malloc(sizeof(struct NODE));
//
//	if (node == NULL) {
//		printf("malloc failed");
//		exit(1);
//	}
//	if (node != NULL) {
//		(*node).key = 100;
//		(*node).next = NULL;
//	}
//	if (node != NULL)
//		free(node);
//
//}

//struct NODE {
//	int key;
//	struct NODE* next;
//};
//
//void main() {
//
//	struct NODE* node;
//	
//		node = (struct NODE*)malloc(3*sizeof(struct NODE));
//	
//		if (node == NULL) {
//			printf("malloc failed");
//			exit(1);
//		}
//		if (node != NULL) {
//			(node[0]).next = &node[1];
//			(node[1]).next = &node[2];
//			(node[2]).next = NULL;
//			(node[0]).key = 100;
//			(node[1]).key = 250;
//			(node[2]).key = 467;
//		}
//		if(node != NULL)
//		free(node);
//
//}

//struct NODE {
//	int key;
//	struct NODE* next;
//};
//
//void main() {
//
//	struct NODE* node;
//	
//	node = (struct NODE*)malloc(3*sizeof(struct NODE));
//	
//	if (node == NULL) {
//		printf("malloc failed");
//		exit(1);
//	}
//	if (node != NULL) {
//		(node[0]).next = &node[1];
//		(node[1]).next = &node[2];
//		(node[2]).next = NULL;
//		(node[0]).key = 100;
//		(node[1]).key = 250;
//		(node[2]).key = 467;
//	}
//
//	struct NODE* ptr;
//	ptr = &node[0];
//
//	int find_key = 250;
//	int find = 0;
//
//	while (ptr != NULL) {
//		ptr = (*ptr).next;
//		if ((*ptr).key == find_key) {
//			find = 1;
//			break;
//		}
//	}
//
//	if (find == 1) {
//		printf("search key found");
//	}
//	else printf("search key not found");
//}

//#define mask 0x80
//void displaybit(char);
//
//void main() {
//	char ch;
//
//	printf("\nplease type character: ");
//	scanf_s("%c", &ch);
//	displaybit(ch);
//
//}
//
//void displaybit(char ch) {
//	int m = mask;
//	printf("character is ");
//	char display;
//	int compare = 0x1;
//	for (int i = 0; i < 8; i++) {
//		display = m & ch;
//		if (display >= compare)
//			printf("1");
//		else printf("0");
//		
//		m = m >> 1;
//	}
//}

void BinaryMaker(int );

void main() {
	int DEC = 1;
	while (DEC != 1001) {
		printf("DEC %d: ", DEC);
		printf("BIN ");
		BinaryMaker(DEC);
		printf("  HEX %0x \n", DEC);
		DEC = DEC + 1;
	}
}

void BinaryMaker(int DEC) {
	int remainder = 0;
	
	
	if (DEC < 2) {
		if (DEC == 1) {
			printf("1");
		}
	}
	else {
		remainder = DEC % 2;
		if (remainder == 0) {
			BinaryMaker(DEC / 2);
			printf("0");
		}
		else if (remainder == 1) {
			BinaryMaker(DEC / 2);
			printf("1");
		}
	}
}



