## Problem 1

Problem Name: **Gather Rain Water**
<br>
Problem Level: MEDIUM
<br>
Problem Description: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
#### Please refer to Sample test case for more details.
##### Input format:
    The first line of input contains size of the array, n.
    The following line of input contains n space separated integers.

##### Output format:
    The first and only line of output contains integer, in accordance to the task.

##### Constraints:
    1 <= n <= 10000



 ##### Sample Input 1:
    6
    3 0 0 2 0 4

##### Sample Output 1:
    10

##### Sample Input 2 :
    5
    90 70 20 80 50


##### Sample Output 2 :
    70


##### Explanation for Sample Input 1 :
    Refer to the image for better comprehension:
![Alt Text](https://ninjasfiles.s3.amazonaws.com/0000000000001829.png)

## Problem 2

Problem Name: **Chocolate Carton Distribution Problem**
<br>
Problem Level: MEDIUM
<br>
Problem Description: Anuj is one of the finest instructors at Coding Ninjas. He takes a batch of m students. He has been given n number of chocolate cartons. Each carton can have a variable number of chocolates. He has been given a task to distribute the chocolates to his students on the occasion of Holi. Now, here is the tricky part, he needs to distribute the chocolates in such a way that:<br>
&emsp;&emsp;1. Each student gets one carton of chocolate.<br>
&emsp;&emsp;2. The difference between the chocolate carton with the maximum number of chocolates and the carton with the minimum number of chocolates given to the students is minimum.

##### Input format:
    The first line of input contains number of chocolate cartons, n. The following line contains n space separated integers. The following line of input contains number of children to whom those n carton are to be distributed, m.

##### Output format:
    The first and only line of output contains the minimum difference possible between the student with maximum number of chocolates and the one with the minimum number of chocolates.

##### Constraints :
    1 <= n <= 100
    1 <= m <= n
 ##### Sample Input 1 :
    7
    7 3 2 4 9 12 56
    3

##### Sample Output 1 :
    2

##### Sample Input 2 :
    6
    1 2 3 4 78 80
    3

##### Sample Output 2 :
    2

## Problem 3

Problem Name: **Warm Reception**<br>
Problem Level: MEDIUM<br>
Problem Description: There is only one beauty parlour in the town CodingNinjasLand. The receptionist at the beauty parlor is flooded with appointment requests because the “Hakori” festival is round the corner and everyone wants to look good on it.
#### She needs your help. The problem is they don’t have chairs in reception. They are ordering chairs from NinjasKart. They don’t want to order more than required. You have to tell the minimum number of chairs required such that none of the customers have to stand.

##### Input Format :
    First line contains the number of customers that will come. Second line contains N space-separated integers which represent the arrival timings of the customer. Third line contains N space-separated integers which represent the departure timings of the customer. Arrival and departure timings are given in 24-hour clock.

##### Constraints:
    1<= N <= 100
    Arrival and departure timings lie in the range [0000 to 2359]
    Time Limit: 1 second

##### Output Format :
    You have to print the minimum number of chairs required such that no customer has to wait standing.

#### Sample Test Cases:
##### Sample Input 1 :
    5
    900 1000 1100 1030 1600
    1900 1300 1130 1130 1800

##### Sample Output 1:
    4

#### Explanation:
    4 because at 1100 hours, we will have maximum number of customers at the shop, throughout the day. And that maximum number is 4.

