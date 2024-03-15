#pragma warning(disable :4996)
#include <stdio.h>
#include <time.h>

int keylist[100000];
int keylist_sorted[100000];
char filename_keylist[128] = "Num_list.txt";
char filename_keylist_sorted[128] = "Num_list_sorted.txt";


// verify your sorting results with the validation sequence
int check_sorted(int* sorting_result)
{
    int verfiedResult = 0;

    // Read the sorted result of the test sequence
    FILE* fs;
    fs = fopen(filename_keylist_sorted, "r");

    if (fs == NULL)
    {
        printf("The test seqeunce file (%s) is not accessible\n", filename_keylist_sorted);
        return verfiedResult;
    }


    int index = 0;
    while (fscanf(fs, "%d", &keylist_sorted[index]) == 1)
    {
        if (sorting_result[index] == keylist_sorted[index])
        {
            verfiedResult++;
        }
        index++;
    }

    fclose(fs);

    return verfiedResult;

}

void swap(int* num1, int* num2) { //swap two datas
    int temp;
    temp = *num1;
    *num1 = *num2;
    *num2 = temp;
}

// program your bubble sorting algorithm
void bubbleSorting(int* original_list, int numofkeys)
{
    
    for (int i = 0; i < numofkeys - 1; i++) {

        for (int j = 0; j < numofkeys - i - 1; j++) {
            if (original_list[j] > original_list[j + 1]) {
                swap(&original_list[j], &original_list[j+1]);
                
            };

        };

    };

}

// program your second sorting algorithm
void yourSecondSorting(int* data, int start, int end) //I will use quick sort
{
    if (start >= end) //if array`s length is 1,just done
        return;

    int key = start; //key is first element
    int i = start + 1, j = end, temp;

    while (i <= j) {  //while start pivot meets end pivot
        while (i <= end && data[i] <= data[key]) {   //if start pivot`s data <= key`s data , stop moving toward
            i++;
        }
        while (j > start && data[j] >= data[key]) { //if end pivot`s data >= key`s data , stop moving behind
            j--;
        }
        if (i > j) { 
            swap(&data[j], &data[key]); 
        }
        else {
            swap(&data[i], &data[j]);
        }
    }
    yourSecondSorting(data, start, j - 1); //separate array based on the meeting point(start pivot,end pivot) and do sort recursively  
    yourSecondSorting(data, j + 1, end);
    

}

void sorting(int* original_list, int numofkeys)
{
    //bubbleSorting(original_list, numofkeys);
    yourSecondSorting(original_list, 0 ,numofkeys - 1);
    return;
}



int main()
{

    // read the test sequence
    int numofkeys = 0;
    FILE* fs = fopen(filename_keylist, "r");
    if (fs == NULL)
    {
        printf("The test seqeunce file (%s) is not accessible\n", filename_keylist);
        return 0;
    }

    while (fscanf(fs, "%d", &keylist[numofkeys]) == 1)
    {
        numofkeys++;

    }

    fclose(fs);


    // begin sorting with the test sequence
    clock_t start, end;
    start = (double)clock();
    sorting(keylist, numofkeys);
    end = (double)clock();

    // compute the time of sorting
    float computationTime = (double)(end - start); // get the total time cost 
    printf("Total time cost(ms) : %lf \n", computationTime);


    // verify with the validation sequence
    int verifiedResult = check_sorted(keylist);

    printf("=============== RESULT =============== \n");
    if (verifiedResult == numofkeys)
    {
        printf("Your sorting algorithm resulted in the correct ascending order for the given list \n\n");
    }
    else
        printf("Your sorting algorithm failed to produce the correct ascending order for the given list \n\n");


}