import java.util.Scanner;

public class Quiz {
    public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);

        int income;
        int children;
        int age;
        int calculations;
        double tax = 0;
        double discount;
        double discountprice;
        double finaltax=0;

        System.out.println("What is your salary?");
        income = scan.nextInt();

        System.out.println("How many children do you have?");
        children = scan.nextInt();

        System.out.println("How old are you?");
        age = scan.nextInt();

        if( income<= 10000) {
            tax = 0;
        } else if (income<=25000 && income>10000) {
            calculations = income - 10000;
            tax = calculations*.10;   
        } else if (income<=75000 && income>25000) {
            calculations = income - 25000;
            tax = (calculations*.20)+ 1500;
        } else if(income<=250000 && income>75000) {
            calculations = income - 75000;
            tax = (calculations*.30) + 11500;
        } else if(income>250000) {
            calculations = income - 250000;
            tax = (calculations*.50) + 64000;
        } 

        if (age<=15) {
            discount = .50*tax;
            discountprice = tax - discount;
        } else if( age<=21 && age>=16) {
            discount = .25*tax;
            discountprice = tax - discount;
        } else if( age<=63 && age>=22) {
            discount = 0;
            discountprice = tax - discount;
        } else if( age<=72 && age>=64){
            discount = .33*tax;
            discountprice = tax - discount;
        } else if (age<=80 && age>=73){
            discount = .66*tax;
            discountprice = tax - discount;
        } else {
            discount = tax;
            discountprice = tax - discount;
        }

        if(children>0 && children<2.5) {
            finaltax = discountprice-1000;
        } else if( children == 0) {
            finaltax = discountprice;
        } else if( children> 2.5) {
            int d;
            d = children - 2;
            finaltax = discountprice - ((d*500)+1000);
        }

        if( income>=10000 && income <=25000 && finaltax<500 && finaltax!=0){
            finaltax = 500;
        } else if( income>=25000 && income<=75000 && finaltax<5000) {
            finaltax = 5000;
        } else if( income>=75000 && income<=250000 && finaltax<10000) {
            finaltax = 10000;
        } else if( income>=25000 && finaltax<25000) {
            finaltax = 25000;
        }

        System.out.println("Your tax is " + finaltax);
    }
}