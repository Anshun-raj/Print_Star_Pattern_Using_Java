package org.example;

import java.util.Scanner;

public class Star
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Star obj=new Star();
        System.out.println("----Printing Star In Java----");
        System.out.println("Press 1 for Diamond");
        System.out.println("Press 2 for UpRightTriangle");
        System.out.println("Press 3 for DownRightTriangle");
        System.out.println("Press 4 for EqualAngTriangle");
        System.out.println("Press 5 for UpLeftTriangle");
        System.out.println("Enter your choice:-");
        int choice=sc.nextInt();
        System.out.println("Enter the no. of rows:-");
        int rows=sc.nextInt();
        switch(choice)
        {
            case 1:
                obj.Diamond(rows);
                break;
            case 2:
                obj.UpRightTriangle(rows);
                break;
            case 3:
                obj.DownRightTriangle(rows);
                break;
            case 4:
                obj.EqualAngTriangle(rows);
                break;
            case 5:
                obj.UpLeftTriangle(rows);
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }


    }

    public void UpRightTriangle(int rows)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void Diamond(int rows)
    {
        for(int m=1;m<=rows;m++)
        {
            for(int n=(rows-m);n>=1;n--)
            {
                System.out.print(" ");
            }
            for(int l=m;l>=1;l--)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int m=(rows-1);m>=1;m--)
        {
            for(int n=(rows-m);n>=1;n--)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=m;l++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public void DownRightTriangle(int rows)
    {
        for(int k=1;k<=(rows+1);k++)
        {
            for(int l=1;l<=(rows+1)-k;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void EqualAngTriangle(int rows)
    {
        {
            for (int m = 1; m <= rows; m++) {
                for (int n = (rows - m); n >= 1; n--) {
                    System.out.print(" ");
                }
                for (int l = m; l >= 1; l--) {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }

    public void UpLeftTriangle(int rows)
    {
        {
            for (int m = 1; m <= rows; m++) {
                for (int n = 2*(rows - m); n >= 1; n--) {
                    System.out.print(" ");
                }
                for (int l = m; l >= 1; l--) {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }

}

