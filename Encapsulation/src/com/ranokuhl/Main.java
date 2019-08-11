package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(10, 50, true);
        printer.addPagesPrinted(5);
        printer.getNumberOfPagesPrinted();
        printer.getTonerLevel();

    }
}
