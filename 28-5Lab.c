// Q.1 Write the logic for thee below pattern in c ?
// 1       2       3
// 6       5       4
// 7       8       9
// 12      11     10
// 13     14     15
// C Program:
#include<stdio.h>
int main(){
    int value=0;
    for(int r=1;r<=5;r++){
        if(r%2!=0){
            for(int c=1;c<=3;c++){
                value=value+1;
                printf("%4d",value);
            }
        }
        else{
            int temp=value+1;
            for(int c=value+3;c>=temp;c--){
                value=value+1;
                printf("%4d",c);
            }
        }printf("\n");
    }
}

// Q.2 Write the logic for the below program in c ?
//                 1

//         4       9

// 16     25       36

// 49   64     81   100

// Q.3 Write the logic for the below program ?
//                     1
//           2       4

//   3      6       9

// 4    8    12     16

// Q.4 Write the logic for the below program in c?
// 1

// 1  2   1

// 1  2   3   2   1

// 1  2   3   4   3   2   1

// 1  2   3   4   5   4   3   2   1