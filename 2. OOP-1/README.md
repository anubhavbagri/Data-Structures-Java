## Coding Problem 1

Problem Name: **Complex Number Class**<br>
Problem Level: MEDIUM<br>
Problem Description: OOP1.A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
#### Implement the Complex numbers class that contains following functions -

##### 1. constructor
    You need to create the appropriate constructor.

##### 2. plus -
    This function adds two given complex numbers and updates the first complex number.
#### e.g.
    if C1 = 4 + i5 and C2 = 3 +i1
    C1.plus(C2) results in:
    C1 = 7 + i6 and C2 = 3 + i1

##### 3. multiply -
    This function multiplies two given complex numbers and updates the first complex number.
    if C1 = 4 + i5 and C2 = 1 + i2
    C1.multiply(C2) results in:
    C1 = -6 + i13 and C2 = 1 + i2


##### 4. print -
    This function prints the given complex number in the following format :
    a + ib
    Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.

##### Input Format :
    Line 1 : Two integers - real and imaginary part of 1st complex number
    Line 2 : Two integers - real and imaginary part of 2nd complex number
    Line 3 : An integer representing choice (1 or 2) (1 represents plus function will be called and 2 represents multiply function will be called)

##### Output format :
    Check details of 'print' function given above.


 ##### Sample Input 1 :
    4 5
    6 7
    1

##### Sample Output 1 :
    10 + i12

##### Sample Input 2 :
    4 5
    6 7
    2

##### Sample Output 2 :
    -11 + i58

## Coding Problem 2
Problem Name: **Polynomial class**<br>
Problem Level: HARD<br>
Problem Description:
#### Implement a polynomial class, that contains following functions -
##### 1. setCoefficient -
#### This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.

##### 2. add -
#### Adds two polynomials and returns a new polynomial which has the result.

##### 3. subtract -
#### Subtracts two polynomials and returns a new polynomial which has the result.

##### 4. multiply -
#### Multiplies two polynomials and returns a new polynomial which has the result.

##### 5. print -
#### Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.

#### Print pattern for a single term : `<coefficient>"x"<degree>`

#### And multiple terms should be printed separated by space. For more clarity, refer sample test cases.

##### Note : Only keep those terms which have non - zero coefficients.

 ##### Sample Input 1 :
    P1 : 1x2 2x3 4x6
    P2 : 3x4 1x2

##### Sample Output 1 :
    P1 + P2 = 2x2 2x3 3x4 4x6

##### Sample Input 2 :
    P1 : 1x2 2x3 4x6
    P2 : 3x4 1x2

##### Sample Output 2 :
    P1 - P2 = 2x3 -3x4 4x6

