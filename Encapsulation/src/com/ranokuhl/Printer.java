package com.ranokuhl;

public class Printer {

    private int tonerLevel = 0;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int addTonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {


        this.tonerLevel = addTonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void addToner(int tonerAddition) {
        this.tonerLevel = this.tonerLevel + tonerAddition;
        System.out.println("Toner level added: " + this.tonerLevel);
    }

    public void addPagesPrinted(int addNumberOfPages) {
        this.numberOfPagesPrinted = this.numberOfPagesPrinted + addNumberOfPages;
        System.out.println("Number of pages printed " + this.numberOfPagesPrinted);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
