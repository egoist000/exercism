#include <stdio.h>
#include <math.h>
#include "armstrong_numbers.h"

/* Expecting a base 10 positive number */
bool is_armstrong_number(int candidate)
{
    int number = candidate;
    int k = (int)log10(candidate) + 1;
    int sum = 0;
    for (int i = 0; i <= k - 1; i++)
    {
        int digit = number % 10;
        sum += (int) pow(digit, k);
        number = number / 10;
    }
    return candidate == sum;
}
