package KuliahPackage;

import java.util.Scanner;

public class StartHere {
    public static void main(String[] args) {
        String str = "This is a string";
        System.out.println("before replace : " + str);
        System.out.println("after replace : " + str.replace("is", "as"));
        System.out.println("after replaceAll : " + str.replaceAll("is", "as"));
        System.out.println("after replaceFirst : " + str.replaceFirst("is", "as"));


//        Scanner input = new Scanner(System.in);
//        System.out.println("Hello world !");
//        System.out.println("=====Menu=====");
//        System.out.println("1. String Manipulation");
//        System.out.print("Choose module : ");
//        int menu = input.nextInt();
//
//        switch (menu) {
//            case 1: {
//
//            }
//        }
    }
}
