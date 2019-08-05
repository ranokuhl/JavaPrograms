package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account(); //"12345", 0.00, "Bob Brown", "myemail@bob.com",
                // "(087) 123-456-789");


        bobsAccount.withdrawal(10.0);

        bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        System.out.println("=============================");

        VipCustomer myVip = new VipCustomer();
        System.out.println(myVip.getCreditLimit());
        System.out.println(myVip.getEmailAddress());
        System.out.println(myVip.getName());


    }
}
