/*
***********************************************************

Topic   : Program to demonstrate SWITCH CASE in java.
Author  : Chpaone09®
Date    : Oct 14, 2020

************************************************************
*/

import java.util.*;

public class SwitchCase{
    public static void main(String[] args){
        int ch;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\n\n\t 1. Whale");
            System.out.print("\n\n\t 2. Lion");
            System.out.print("\n\n\t 3. Dog");
            System.out.print("\n\n\t 4. Exit");
            System.out.print("\n\n\t Pl. enter your choice >> ");
            ch = sc.nextInt();
            switch(ch)
            {
            case 1: System.out.print("\n\n\t You picked Whale");break;
            case 2: System.out.print("\n\n\t You picked Lion");break;
            case 3: System.out.print("\n\n\t You picked Dog");break;
            case 4: break;
            default:System.out.print("\n\n\t You picked wrong choice !");break;
            }
            System.out.print("\n\n\t to continue press 0 ?");
            ch = sc.nextInt();
        }while(ch !=4 || ch == 0);
        sc.close();
    }
}