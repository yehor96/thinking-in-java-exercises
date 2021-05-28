package com.chapters.strings.ex4;

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private static final int ITEM_WIDTH = 15;
    private static final int QTY_WIDTH = 5;
    private static final int PRICE_WIDTH = 10;

    public void printTitle() {
        f.format("%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n", "Item", "Qty", "Price");
        f.format("%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s %" + QTY_WIDTH + "d %" + PRICE_WIDTH + ".2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + ".2f\n", "Tax", "", total * 0.06);
        f.format("%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n", "", "", "-----");
        f.format("%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + ".2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
