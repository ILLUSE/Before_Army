#include <stdio.h>

void show(float []);  //function prototype

void main() {
	float rates[9] = { 6.5 , 8.2, 8.5, 8.3, 8.6, 9.4, 9.6, 9.8, 10 }; //setting array

	show(rates);  //function call

}

void show(float rates[9]) {     //function return

	for (int i = 0; i < 9; i++) {
		printf("\n%d's rate : %f\n",i+1, rates[i]);   //loop for print rates
	}
}






