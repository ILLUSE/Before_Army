#include <stdio.h>

void extend(float [], float [], float []);      // function prototype


void main() {

	float price[10] = { 10.62, 14.89, 13.21, 16.55, 18.62, 9.47, 6.58, 18.32, 12.15, 3.98 };  //setting arrays

	float quantity[10] = { 4, 8.5, 6, 8.35 , 9 , 15.3, 3, 5.4, 2.9, 4.8 };

	float amount[10];

	extend( price, quantity, amount);    // functon call

	for (int i = 0; i < 10; i++) {
		printf("\nAmount no.%d is %f\n", i+1,amount[i]);       // loop for print amount
	}

}

void extend(float price[10], float quantity[10],float amount[10]) {    //function return

	for (int i = 0; i < 10; i++) {
		amount[i] = quantity[i] * price[i];        //loop for set amount
	}

}






