package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50,true);
        System.out.println("Initial page count = " + printer.getNumberOfPagesPrinted());

        int pagesPrinted = printer.addPagesPrinted(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getNumberOfPagesPrinted());

        pagesPrinted = printer.addPagesPrinted(6);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for pinter " + printer.getNumberOfPagesPrinted());



    }
}
