// Q.1 Draw below pattern:
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
// C Program:
// #include<stdio.h>
// int main(){
//     int r,c;
//      for(r=1;r<=5;r++){
//         for(c=1;c<=r;c++){
//             printf(" *");
//         }printf("\n");
//      }
// }

// Q.2 Draw Below Pattern.
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *
// C Program:
// #include<stdio.h>
// int main(){
//     int r,c;
//     for(r=1;r<=5;r++){
//         for(c=5;c>=r;c--){
//             printf(" *");
//         }printf("\n");
//     }
// }

// Q.3 Draw below Pattern.
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *
// C Program:
// #include<stdio.h>
// int main(){
//     int r,c;
//     for(r=1;r<=5;r++){
//         for(c=1;c<=r;c++){
//             printf(" *");
//         }printf("\n");
//     }
//     for(r=1;r<=5;r++){
//         for(c=5;c>r;c--){
//             printf(" *");
//         }printf("\n");
//     }
// }

// Q.4 Draw below Pattern.
//     *
//    **
//   ***
//  ****
// *****
// C Program:
// #include<stdio.h>
// int main(){
//     int r,c,k;
//     for(r=1;r<=5;r++){
//         for(c=r;c<5;c++){
//             printf(" ");
//         }for(k=1;k<=r;k++){
//             printf("*");
//         }printf("\n");
//     }
// }

// Q.5 Draw below pattern.
// *****
//  ****
//   ***
//    **
//     *
// C program:
// #include<stdio.h>
// int main(){
//     int r,c,k;
//     for(r=1;r<=5;r++){
//         for(c=1;c<r;c++){
//             printf(" ");
//         }for(k=r;k<=5;k++){
//             printf("*");
//         }printf("\n");
//     }
// }

// Q.6 Draw below pattern.
//     *
//    **
//   ***
//  ****
// *****
// ****
//  ***
//   **
//    *
// C Program:
// #include<stdio.h>
// int main(){
//     int r,c,k;
//     for(r=1;r<=5;r++){
//         for(c=r;c<5;c++){
//             printf(" ");
//         }for(k=1;k<=r;k++){
//             printf("*");
//         }printf("\n");
//     }for(r=1;r<=5;r++){
//         for(c=1;c<r;c++){
//             printf(" ");
//         }for(k=r;k<5;k++){
//             printf("*");
//         }printf("\n");
//     }
// }

// Q.7 Draw below pattern.
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// C Program:
// #include<stdio.h>
// int main(){
//     int r,c;
//     for(r=1;r<=5;r++){
//         for(c=1;c<=5;c++){
//             printf("* ");
//         }printf("\n");
//     }
// }

// Q.8 Draw below pattern.
// *****
// *   *
// *   *
// *   *
// *****
// C Program:
// #include<stdio.h>
// int main(){
//     int r,c;
//     for(r=1;r<=5;r++){
//         for(c=1;c<=5;c++){
//             if(r==1 || r==5 || c==1 || c==5)
//             {
//                 printf("*");
//             }
//             else{
//                     printf(" ");
//                 }
//         }printf("\n");
//      }
// }

// Q.9 Draw below pattern:
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
 
// C Program:
//  #include<stdio.h>
// int main(){
//     int r,c,k;
//     for(r=1;r<=5;r++){
//         for(c=r;c<5;c++){
//             printf(" ");
//         }for(k=1;k<=r;k++){
//             printf(" *");
//         }printf("\n");
//     }
// }

// Q.10 Draw below program.
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

// C Program:
// #include<stdio.h>
// int main(){
//     int r,c,k;
//     for(r=1;r<=5;r++){
//         for(c=1;c<r;c++){
//             printf(" ");
//         }for(k=r;k<=5;k++){
//             printf(" *");
//         }printf("\n");
//     }
// }

// Q.11 Draw below pattern:
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

// C Program:
#include<stdio.h>
int main(){
    int r,c,k;
    for(r=1;r<=5;r++){
        for(c=r;c<5;c++){
            printf(" ");
        }for(k=1;k<=r;k++){
            printf(" *");
        }printf("\n");
    }for(r=1;r<=5;r++){
        for(c=1;c<r;c++){
            printf(" ");
        }for(k=r;k<=5;k++){
            printf(" *");
        }printf("\n");
    }
}


