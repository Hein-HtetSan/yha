import java.util.Scanner;

public class Day2 {
    public static void main(String args[]){
        
        // int a=23, b=20, c=10;
        // b *= (a -= (c += b));
        // System.out.println(b);

        // String gret = "Hello How are You";
        // System.out.println(gret.toUpperCase());
        // System.out.println(gret.toLowerCase());

        // System.out.println(gret.indexOf("How"));

        // int wd = 30;
        // int salary = 300000;
        // if(wd >= 30){
        //     int bonus = salary + 30000;
        //     System.out.println("Total Salary : "+bonus);
        // }

        // int year = 2023;
        // if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
        //     System.out.println("Leap year");
        // }else{
        //     System.out.println("Common year");
        // }

        Scanner scn = new Scanner(System.in);
        // System.out.print("Enter mark: ");
        
        // int mark = scn.nextInt();
        // if(mark >= 80){
        //     System.out.println("Grade A");
        // }else if(mark >= 60){
        //     System.out.println("Grade b");
        // }else if(mark >= 40){
        //     System.out.println("Grade C");
        // }else{
        //     System.out.println("Fail");
        // }

        // System.out.print("Enter Salary : ");
        // int salary = Integer.parseInt(scn.nextLine());

        // System.out.print("Enter working day: ");
        // int wd = Integer.parseInt(scn.nextLine());

        // if(wd >= 30){
        //     int bo = salary + 30000;
        //     System.out.println("You get bonus, your salary is : " + bo);
        // }else {
        //     int decSal = salary - ((30- wd) * (salary/30));

        //     System.out.println("You final salary: " + decSal);
        //     if(wd <= 25){
        //         int fineM = decSal - 5000;
        //         System.out.println("You working day under 25 salary : " + fineM);
        //     }
        // }


        // System.out.print("Enter your age : ");
        // int age = scn.nextInt();
        // if(age >= 18){
        //     System.out.println("You can sign up");
        // }else{
        //     System.out.println("You must be 18+ to sign up");
        // }

        // System.out.print("Enter Temperature : ");
        // int temperature = scn.nextInt();
        // if(temperature > 30){
        //     System.out.println("It is hot outside");
        // }else if (temperature >= 20 && temperature <= 30){
        //     System.out.println("It is warm outside");
        // }else{
        //     System.out.println("It is cold outside");
        // }

        // String d = "Sunday";
        // switch(d) {
        //     case "Monday":
        //     System.out.println("This day is monday");
        //     break;
        //     case "Sunday":
        //     System.out.println("This day is Sunday");
        //     break;
        //     default:
        //     System.out.println("This is default");
        //     break;
        // }

        // for(int i=1; i <= 10; i++){
        //     System.out.println(i);
        // }

        // int row = 10;
        // int column = 5;
        // for(int i=1; i<=row; i++){
        //     for(int j=1; j<=column; j++){
        //         System.out.print(j+"*"+i+"="+i*j+"\t");
        //     }
        //     System.out.print("\n");
        // }

        // int str_row = 5;
        // for(int i=1; i<=str_row; i++){
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int py_row = 20;
        // for(int i=1; i<=py_row; i++){
        //     //for space
        //     for(int j=py_row; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     //for star;
        //     for(int k=1; k>=py_row; k++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        // int[] arr = new int[5];

        // arr[0] = 10;
        // arr[1] = 25;
        // arr[2] = 20;
        // arr[3] = 25;
        // arr[4] = 30;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        // for(int i=1; i<=arr.length; i++)
        // {
        //     System.out.println(arr[i-1]);
        // }

        // for(int i=0; i<=arr.length -1; i++){
        //     System.out.println(arr[i]);
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // for(int a : arr){
        //     System.out.println(a);
        // }

        int arr[] = {12, 23, 44, 56, 78};
        for(int i:arr){
            System.out.println(i);
        }


    }
}
