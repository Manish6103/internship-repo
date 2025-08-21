package com.ServiceRegistery;

import java.util.*;

public class graphicCards {
    String brand;
    String model;
    int price;
    String vram;
    double rating;

    // Constructor
    public graphicCards(String brand, String model, int price, String vram, double rating) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.vram = vram;
        this.rating = rating;
    }

    public String toString() {
        return brand + " " + model + " - ₹" + price + " | " + vram + " | " + rating ;
    }

    public static void main(String[] args) {

        List<graphicCards> cards = new ArrayList<>();

        cards.add(new graphicCards("NVIDIA", "GeForce RTX 3060", 32999, "8GB", 4.6));
        cards.add(new graphicCards("AMD", "Radeon RX 6600", 28499, "8GB", 4.4));
        cards.add(new graphicCards("Zotac", "RTX 3060 Twin Edge", 30999, "8GB", 4.5));
        cards.add(new graphicCards("ASUS", "Dual RTX 3060 V2", 34999, "8GB", 4.6));
        cards.add(new graphicCards("MSI", "Radeon RX 6600 Mech 2X", 29499, "8GB", 4.3));
        cards.add(new graphicCards("Gigabyte", "GeForce RTX 3050", 27999, "8GB", 4.4));

        System.out.println("All Graphics Cards:");
        for (graphicCards card : cards) {
            System.out.println(card);
        }
        System.out.println("Cards under ₹30,000:");
        for (graphicCards card : cards) {
            if (card.price < 30000) {
                System.out.println(card);
            }
        }
        graphicCards topCard = cards.get(0);
        for (graphicCards card : cards) {
            if (card.rating > topCard.rating) {
                topCard = card;
            }
        }
        System.out.println("Highest-rated card:" + topCard);
        System.out.println( " average price "+calculateAveragePrice(cards));
    }
    public static double calculateAveragePrice(List<graphicCards> cards) {
        int total = 0;
        for (graphicCards card : cards) {
            total += card.price;
        }
        return (double) total / cards.size();
    }
}

