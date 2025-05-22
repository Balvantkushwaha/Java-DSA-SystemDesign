package PwskillJava.AssignmentCode;

import java.util.Scanner;

public class switchcase {
          public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int weakday = sc.nextInt();
            System.out.println("enter the no. check day 1 to 7 ");
            
            switch (weakday) {
                case 1:
                    System.out.print("sunday\n");
                    break;
                case 2:
                    System.out.print("monday\n");
                    break;
                case 3:    
                    System.out.println("tuesday");
                    break;
                case 4:    
                    System.out.println("webnesday");
                    break;
                case 5:    
                    System.out.println("thursday");
                    break;
                 case 6:    
                    System.out.println("friday");
                    break;
                 case 7:    
                    System.out.println("saturday");
                    break;
    
                default:
                    System.out.print("worng no . ");
            }
        }
    
    }
    
