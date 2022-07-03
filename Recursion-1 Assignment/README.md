## Problem 1

Problem Name: **Multiplication (Recursive)**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.

##### Input format :

    Line 1 : Integer M
    Line 2 : Integer N

##### Output format :

    M x N

##### Constraints :

    0 <= M <= 1000
    0 <= N <= 1000

##### Sample Input 1 :

    3
    5

##### Sample Output 1 :

    15

##### Sample Input 2 :

    4
    0

##### Sample Output 2 :

    0

## Problem 2

Problem Name: **Count Zeros**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given an integer N, count and return the number of zeros that are present in the given integer using recursion.

##### Input Format :

    Integer N

##### Output Format :

    Number of zeros in N

##### Constraints :

    0 <= N <= 10^9

##### Sample Input 1 :

    10204

##### Sample Output 1 :

    2

##### Sample Input 2 :

    708000

##### Sample Output 2 :

    4

## Problem 3

Problem Name: **Geometric Sum**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given k, find the geometric sum i.e.

    1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)

#### using recursion.

##### Input format :

    Integer k

##### Output format :

    Geometric sum

##### Constraints :

    0 <= k <= 1000

##### Sample Input 1 :

    3

##### Sample Output 1 :

    1.875

##### Sample Input 2 :

    4

##### Sample Output 2 :

    1.93750

## Problem 4

Problem Name: **Check Palindrome (recursive)**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Check whether a given String S is a palindrome using recursion. Return true or false.

##### Input Format :

    String S

##### Output Format :

    'true' or 'false'

##### Constraints :

    0 <= |S| <= 1000
    where |S| represents length of string S.

##### Sample Input 1 :

    racecar

##### Sample Output 1:

    true

##### Sample Input 2 :

    ninja

##### Sample Output 2:

    false

## Problem 5

Problem Name: **Sum of digits (recursive)**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Write a recursive function that returns the sum of the digits of a given integer.

##### Input format :

    Integer N

##### Output format :

    Sum of digits of N

##### Constraints :

    0 <= N <= 10^9

##### Sample Input 1 :

    12345

##### Sample Output 1 :

    15

##### Sample Input 2 :

    9

##### Sample Output 2 :

    9

---

## Problem 6

Problem Name: **Replace pi (recursive)**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".

##### Sample Input 1 :

    xpix

##### Sample Output :

    x3.14x

##### Sample Input 2 :

    pipi

##### Sample Output :

    3.143.14

##### Sample Input 3 :

    pip

##### Sample Output :

    3.14p

## Problem 7

Problem Name: **Remove X**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given a string, compute recursively a new string where all 'x' chars have been removed.

##### Input format :

    String S

##### Output format :

    Modified String

##### Constraints :

    1 <= |S| <= 10^3
    where |S| represents the length of string S.

##### Sample Input 1 :

    xaxb

##### Sample Output 1:

    ab

##### Sample Input 2 :

    abc

##### Sample Output 2:

    abc

##### Sample Input 3 :

    xx

##### Sample Output 3:

```

```

## Problem 8

Problem Name: **String to Integer**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.

##### Input format :

    Numeric string S (string, Eg. "1234")

##### Output format :

    Corresponding integer N (int, Eg. 1234)

##### Constraints :

    0 <= |S| <= 9
    where |S| represents length of string S.

##### Sample Input 1 :

    1231

##### Sample Output 1 :

    1231

##### Sample Input 2 :

    12567

##### Sample Output 2 :

    12567

## Problem 9

Problem Name: **Pair star**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "\*".

##### Input format :

    String S

##### Output format :

    Modified string

##### Constraints :

    0 <= |S| <= 1000
    where |S| represents length of string S.

##### Sample Input 1 :

    hello

##### Sample Output 1:

    hel*lo

##### Sample Input 2 :

    aaaa

##### Sample Output 2 :

    a*a*a*a

## Problem 10

Problem Name: **Tower of Hanoi**<br>
Problem Level: MEDIUM<br>
Problem Description:

#### Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are :

    1) Only one disk can be moved at a time.
    2) OOP1.A disk can be moved only if it is on the top of a rod.
    3) No disk can be placed on the top of a smaller disk.

#### Print the steps required to move n disks from source rod to destination rod.

#### Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.

##### Input Format :

    Integer n

##### Output Format :

    Steps in different lines (in one line print source and destination rod name separated by space)

##### Constraints :

    0 <= n <= 20

##### Sample Input 1 :

    2

##### Sample Output 1 :

    a b
    a c
    b c

##### Sample Input 2 :

    3

##### Sample Output 2 :

    a c
    a b
    c b
    a c
    b a
    b c
    a c
