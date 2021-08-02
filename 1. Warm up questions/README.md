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

## Problem 4

Problem Name: **Maximum Subarray Sum**<br>
Problem Level: MEDIUM<br>
Problem Description: Given an array of numbers, find the maximum sum of any contiguous subarray of the array.

#### For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.

#### Given the array [-5, -1, -8, -9], the maximum sum would be -1.

#### Follow up: Do this in O(N) time.

##### Input Format:
#### The first line of input contains size of array, which is denoted by N and second line of input contains N space separated integers.

##### Output Format:
#### The first and only line of output should print the maximum subarray sum, as described in the description.

## Problem 5

Problem Name: **Organizational Woes**<br>
Problem Level: MEDIUM<br>
Problem Description:
#### 1. You are given structure of an organization in the form of a tree.
#### 2. Data of each node contains name of a designation and data of its child nodes contains the name of designation reporting to it. The data of root node will always contain the string: "CEO", as it is the apex designation.
#### 3. The designation "individual_contributors" have nobody reporting to them. This means they are no child nodes to designation containing the data "individual_contributors".
#### 4.  There are levels of hierarchy. The level of CEO or root node is 1 and levels of its reporting designations or child nodes is 2 and so on.
#### 5. You have to tell whether all the "individual_contributors" are at same level of hierarchy. You have to answer in either "true" or "false".

##### Input Format:
    The input has already been taken for you. You have to just complete the given function.
##### Constraints:
    Time Limit: 1 second
    All the designations are comprised of lowercase letter. The length of string is in the range: [1, 30].
##### Output Format:
    The output has already been taken for you. You have to just complete the given function.

 ##### Sample Input 1:
    ceo 3 cto cfo individual_contributors 2 individual_contributors individual_contributors 1 accountant 0 0 0 1 individual_contributors 0

##### Sample Output 1:
    false

##### Sample Input 2:
    ceo 2 cto cfo 2 individual_contributors individual_contributors 1 individual_contributors 0 0 0
##### Sample Output 2:
    true

## Problem 6

Problem Name: **Count how many people are not working** <br>
Problem Level: MEDIUM <br>
Problem Description:
#### 1. You are given structure of an organization in the form of a tree.
#### 2. Data of each node contains name of a designation and data of its child nodes contains the name of designation reporting to it. The data of root node will always contain the string: "CEO", as it is the apex designation.
#### 3. The designation "individual_contributors" have nobody reporting to them. This means they are no child nodes to designation containing the data "individual_contributors".
#### 4.  There are levels of hierarchy. The level of CEO or root node is 1 and levels of its reporting designations or child nodes is 2 and so on.
#### 5. It is believed that only people at designation "individual_contributors" are working. If we go by this myth, can you tell us how many people are not working in the organization.
##### Input Format:
    The input has already been taken for you. You have to just complete the given function.
##### Constraints:
    Time Limit: 1 second
    All the designations are comprised of lowercase letter. The length of string is in the range: [1, 30].
##### Output Format:
    The output has already been taken for you. You have to only complete the given function.

 ##### Sample Input 1:
    ceo 3 cto cfo individual contributors 2 individual_contributors individual_contributors 1 accountant 0 0 0 1 individual_contributors 0

##### Sample Output 1:
    4

## Problem 7

Problem Name: **Bringing them together** <br>
Problem Level: MEDIUM <br>
Problem Description:
#### 1. Rohit was organizing a party. He made his friends stand linearly in a queue and gave a cap with number printed on its top to each of its friend.
#### 2. He wanted to bring all the people whose cap number is less than or equal to 'X' together. But he wanted to achieve it in minimum transitions of his friends.
#### 3. Given the initial position of friends with their cap numbers, can you tell us minimum number of transitions required to bring all the people whose cap number is less than or equal to 'X' together.

##### Input Format:
    The first line contains the number of friends that came to the party. Let it be denoted by n.
    The following line contains n space separated integers, that denotes the cap of his standing friends. The following line contains the value of X.

##### Constraints:
    Time Limit: 1 second
    The value of n lies in the range: [1, 10000]
    The value of X lies in the range: [1, 1000]

##### Output Format:
    The first and only line of output contains the value of minimum number of transitions, as described in the task.

 ##### Sample Input 1:
    7
    12 17 19 15 18 17 14
    15
##### Sample Output 1:
    2
##### Explanation:
    There are three elements which are less than or equal to 'X'. Following are those three elements: 12, 14, 15.
    The minimum number of transitions will be two. One of the many subarrays, where the minimum transitions will be two is first subarray of size 3, i.e. [12, 17, 19]. We can bring all elements together by swapping (17 & 15) and (19 & 14).

## Problem 8

Problem Name: **Three Teams** <br>
Problem Level: MEDIUM<br>
Problem Description:
#### 1. There are N players, linearly standing. Each player has a chest number. The number also denotes the strength of that player. So, greater the number, stronger the player.
#### 2.  You have to form 3 teams from these N players. Each team has to be of k size.
#### 3. There are two restrictions in selections of players. First, a particular player can only be selected for one team. So, two teams cannot have the same player. Second, you can only select consecutively standing players for a particular team
#### 4. Can you tell us the maximum possible cumulative sum of selected players chest number, if the selection is done according to the above mentioned conditions.

##### Input Format:
    The first line of input contains the value of N.
    The following line contains N space separated integers, that denotes the value of players chest number. The following line contains the value of k. Input would be provided in such a way that selection of 3 teams will always be possible.

##### Constraints:
    Time Limit: 1 second
    The value of N lies in the range: [1, 10000]
    The value of N space separated integers lies in the range: [1, 65535]. The values can be duplicate. As value denotes chest number and chest number denotes strength and since, two players can have similar strength, hence, there can be duplicate values in the array.
    The value of k lies in the range: [1, 1000].

##### Output  Format:
    The first and only line of output contains the maximum sum, as described in the task.
 ##### Sample Input 1:
    8
    1 2 1 2 6 7 5 1
    2
##### Sample Output 1:
    23
##### Explanation:
    For selections, following 3 teams will have maximum sum: [1,2], [2, 6], [7, 5]