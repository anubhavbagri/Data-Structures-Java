## Problem 1

Problem Name: **Check AB**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:

    a. The string begins with an 'a'
    b. Each 'a' is followed by nothing or an 'a' or "bb"
    c. Each "bb" is followed by nothing or an 'a'

#### If all the rules are followed by the given string, return true otherwise return false.

##### Input format :

    String S

##### Output format :

    'true' or 'false'

##### Constraints :

    0 <= |S| <= 1000
    where |S| represents length of string S.

##### Sample Input 1 :

    abb

##### Sample Output 1 :

    true

##### Sample Input 2 :

    abababa

##### Sample Output 2 :

    false

## Problem 2

Problem Name: **Staircase**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### OOP1.A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.

##### Input format :

    Integer N

##### Output Format :

    Integer W

##### Constraints :

    1 <= N <= 30

##### Sample Input 1 :

    4

##### Sample Output 1 :

    7

##### Sample Input 2 :

    5

##### Sample Output 2 :

    13

## Problem 3

Problem Name: **Binary Search (Recursive)**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.

##### Return -1 if x is not present in the given array.

##### Note : If given array size is even, take first mid.

`Input format : `

`Line 1 : Array size`

`Line 2 : Array elements (separated by space)`

`Line 3 : x (element to be searched)`

##### Sample Input :

    6
    2 3 4 5 6 8
    5

##### Sample Output:

    3

## Problem 4

Problem Name: **Return subset of an array**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given an integer array (of length n), find and return all the subsets of input array.

##### Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.

##### Note : The order of subsets are not important.

`Input format : `

`Line 1 : Size of array`

`Line 2 : Array elements (separated by space)`

##### Sample Input:

    3
    15 20 12

##### Sample Output:

    [] (this just represents an empty array, don't worry about the square brackets)
    12
    20
    20 12
    15
    15 12
    15 20
    15 20 12

## Problem 5

Problem Name: **Print Subsets of Array**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given an integer array (of length n), find and print all the subsets of input array.

##### Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.

##### Note : The order of subsets are not important. Just print the subsets in different lines.

##### Input format :

Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)

##### Constraints :

#### 1 <= n <= 15

##### Sample Input:

    3
    15 20 12

##### Sample Output:

    [] (this just represents an empty array, don't worry about the square brackets)
    12
    20
    20 12
    15
    15 12
    15 20
    15 20 12

## Problem 6

Problem Name: **Return subsets sum to K**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given an array OOP1.A of size n and an integer K, return all subsets of OOP1.A which sum to K.

##### Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.

##### Note : The order of subsets are not important.

##### Input format :

    Line 1 : Integer n, Size of input array
    Line 2 : Array elements separated by space
    Line 3 : K

##### Constraints :

#### 1 <= n <= 20

##### Sample Input :

    9
    5 12 3 17 1 18 15 3 17
    6

##### Sample Output :

    3 3
    5 1

## Problem 7

Problem Name: **Print Subset Sum to K**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given an array OOP1.A and an integer K, print all subsets of OOP1.A which sum to K.

##### Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.

##### Note : The order of subsets are not important. Just print them in different lines.

##### Input format :

    Line 1 : Size of input array
    Line 2 : Array elements separated by space
    Line 3 : K

##### Sample Input:

    9
    5 12 3 17 1 18 15 3 17
    6

##### Sample Output:

    3 3
    5 1

## Problem 8

Problem Name: **Return all codes - String**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.

##### Note : The order of codes are not important. And input string does not contain 0s.

##### Input format :

    OOP1.A numeric string

##### Constraints :

#### 1 <= Length of String S <= 10

##### Sample Input:

    1123

##### Sample Output:

    aabc
    kbc
    alc
    aaw
    kw

## Problem 9

Problem Name: **Print all Codes - String**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.

##### Note : The order of codes are not important. Just print them in different lines.

##### Input format :

    OOP1.A numeric string S

##### Output Format :

    All possible codes in different lines

##### Constraints :

#### 1 <= Length of String S <= 10

##### Sample Input:

    1123

##### Sample Output:

    aabc
    kbc
    alc
    aaw
    kw

## Problem 10

Problem Name: **Return Permutations - String**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given a string S, find and return all the possible permutations of the input string.

##### Note 1 : The order of permutations is not important.

##### Note 2 : If original string contains duplicate characters, permutations will also be duplicates.

##### Input Format :

    String S

##### Output Format :

    All permutations (in different lines)

##### Sample Input :

    abc

##### Sample Output :

    abc
    acb
    bac
    bca
    cab
    cba

## Problem 11

Problem Name: **Print Permutations - String**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given a string, find and print all the possible permutations of the input string.

##### Note : The order of permutations are not important. Just print them in different lines.

##### Sample Input :

    abc

##### Sample Output :

    abc
    acb
    bac
    bca
    cab
    cba
