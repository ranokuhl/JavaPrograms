package com.ranokuhl;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {

        if (tonerLevel >= 1 && tonerLevel <= 100) {

            this.tonerLevel = tonerLevel;

        } else {
            this.tonerLevel = -1;
        }

        this.duplexPrinter = duplexPrinter;
        this.numberOfPagesPrinted = 0;
    }

    public int addToner(int tonerAddition) {

        if (tonerAddition >= 1 && tonerAddition <= 100) {

            if (this.tonerLevel + tonerAddition > 100) {
                return -1;
            }

            return this.tonerLevel = this.tonerLevel + tonerAddition;

        } else {
            return -1;
        }

    }

    public int addPagesPrinted(int addNumberOfPages) {

        int pagesToPrint = addNumberOfPages;
        if (this.duplexPrinter) {

            pagesToPrint = pagesToPrint / 2;
            System.out.println("Printing in duplex.");

        }
        this.numberOfPagesPrinted += pagesToPrint;
        return numberOfPagesPrinted;

    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

}
