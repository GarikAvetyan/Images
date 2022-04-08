package CodeSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ex.1,2
        /*
        System.out.print("Height: ");
        int height =sc.nextInt();
        System.out.print("Width: ");
        int width =sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         */


        //Ex.3
        /*
        System.out.print("Height: ");
        int height = sc.nextInt();
        System.out.print("Width: ");
        int width = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || i == height - 1 || j == width - 1) {
                    System.out.print("* ");
                }
                else if(j>=1 && j<width-1) {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
         */


        //Ex.4
        /*
        System.out.print("Lenght: ");
        int lenght = sc.nextInt();
        String asterisk="* ";

        for (int i = 0; i < lenght; i++) {
            System.out.print(asterisk);
            asterisk+="* ";
            System.out.println();
        }
         */


        //Ex.5
        /*
        System.out.print("Lenght: ");
        int lenght = sc.nextInt();
        int k=0;

        for (int i = 0; i < lenght; i++) {
            for (int j = k; j < lenght; j++) {
                System.out.print("* ");
            }
            System.out.println();
            k++;
        }
         */


        //Ex.6
        /*
        System.out.print("Lenght: ");
        int lenght = sc.nextInt();
        int k=0;

        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j <= k; j++) {

                if(j==0 || i==lenght-1 || i==j) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
            k++;
        }
         */


        //Ex.7
        /*
        System.out.print("Lenght: ");
        int lenght = sc.nextInt();
        if (lenght % 2 == 0) {
            lenght++;
        }

        int s = 0;
        int h = 1;

        for (int i = 0; i < lenght; i++) {

            for (int j = s; j < lenght / 2; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l < h; l++) {
                System.out.print("* ");
            }

            if (i < lenght / 2) {
                s++;
                h += 2;
            } else if (i >= lenght / 2) {
                s--;
                h -= 2;
            }
            System.out.println();

        }
         */


        //Ex.8
        /*
        System.out.print("Lenght: ");
        int lenght = sc.nextInt();
        if (lenght % 2 == 0) {
            lenght++;
        }

        int s = 0;

        for (int i = 0; i < lenght; i++) {

            for (int j = 0; j < lenght; j++) {

                if (j == lenght / 2 - s) {
                    System.out.print("* ");
                } else if (j == lenght / 2 + s) {
                    System.out.print("* ");
                    break;
                } else {
                    System.out.print("  ");
                }

            }

            if (i < lenght / 2) {
                s++;
            } else if (i >= lenght / 2) {
                s--;
            }

            System.out.println();

        }
         */


        //Ex.9
        System.out.print("Height: ");
        int i1 = sc.nextInt();
        System.out.print("Width: ");
        int j1 = sc.nextInt();

        for (int i = 0; i <= 4*i1; i++) {
            for (int j = 0; j <= 4*j1; j++) {
                  if(i%4==0 || j%4==0){
                      System.out.print("* ");
                  }else{
                      System.out.print("  ");
                  }
            }
            System.out.println();
        }
    }
}
