// Q.1 Write a logic for the following pattern in c?
//     0
//     1 0
//     0 1 0
//     1 0 1 0
//     0 1 0 1 0 
// C Program:
// #include<stdio.h>
// int main(){
//     int r,c;
//     for(r=1;r<=5;r++){
//         for(c=1;c<=r;c++){
//             printf(" %d",(c+r)%2);
//         }printf("\n");
//     }
// }

// Q.2 Write a logic for the following pattern in c?
// 	1
//     1  2
//     3  5  8
//     13 21 34 55

// C Program:
// #include<stdio.h>
// int main(){
//     int a=0,b=1,d;
//     for(int r=1;r<=4;r++){
//         for(int c=1;c<=r;c++){
//             d=a+b;
//             printf("%d ",b);
//             a=b;
//             b=d;
//         }printf("\n");
//     }
// }

// Q.3 Write a logic for the following pattern in c?
//     1
//     2  6
//     3  7  10
//     4  8  11  13
//     5  9  12  14  15

// C program:
#include<stdio.h>
int main(){
    int r,c,a;
    for(r=1;r<=5;r++)
    {
        a=r;
        for(c=1;c<=r;c++){
            printf(" %d",a);
            a=(a+5)-c;
        }
        printf("\n");
    }
}

Q.4 Write a logic for the following pattern in c?
    A 
    B A
    C B A
    D C B A
    E D C B A
C Program:
#include<stdio.h>
int main(){
    int r,c;
    char ch='A';
    for(r=1;r<=5;r++){
        int d=ch;
        for(c=1;c<=r;c++){
            printf(" %c",d);
            d--;
        }printf("\n");
        ch++;
    }
}

Q.5 Write a logic for the following pattern in c?
    0  
    0 1
    0 1 0
    0 1 0 1
    0 1 0 1 0
    0 1 0 1 0 1
C Program:

Q.6 Write a logic for the following pattern in c?
	1
    2  3
    3  4  5
    4  5  6  7
    5  6  7  8  9
C Program:

Q.7 Write a logic for the following pattern in c?
    1
    2  3
    4  5  6
    7  8  9  10
    11 12 13 14 15
C Program:


Q.8 Write a logic for the following pattern in c?
    0
    0 1 
    0 1 1
    0 1 1 2
    0 1 1 2 3
C Program:


