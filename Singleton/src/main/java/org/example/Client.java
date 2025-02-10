package org.example;

public class Client {
    public static void main(String[] args) {
        PrinterService worker1 = PrinterService.getInstance();
        PrinterService worker2 = PrinterService.getInstance();

        worker1.setMode("Color");
        worker2.setMode("Grayscale");

        System.out.println(worker1.getPrinterStatus());
        System.out.println(worker2.getPrinterStatus());
    }
}