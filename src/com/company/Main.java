package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String employeeID;
        double payRate;
        int hoursWorked;
        double pay =0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's ID");
        employeeID = input.nextLine();
        System.out.println("Enter employee's payrate");
        payRate = input.nextDouble();
        System.out.println("Enter hours worked by employee");
        hoursWorked = input.nextInt();

        if(payRate <= 25 && hoursWorked <=60){
            if(hoursWorked > 35){
                pay = 35 * payRate +((hoursWorked-35)* payRate*1.5);
            }else{
                pay = hoursWorked * payRate;
            }
        }else{
            if(payRate > 25){
                System.out.println("Payrate is over $25, please correct: " +payRate);
            }else{
                System.out.println("Hours entered are over 60, please correct: "+ hoursWorked);
            }
        }
        System.out.println("Employee Number: " +employeeID + "\nPayrate: "+payRate+"\nHours Worked: "
        +hoursWorked+"\nNet Pay: "+pay);
    }
}
