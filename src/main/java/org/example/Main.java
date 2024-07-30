package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Yatak odası", new Wall("kuzey"), new Wall("güney"), new Wall("doğu"), new Wall("batı"),
                new Ceiling(3, PaintColor.RED),new Bed("Çift Kişilik",2,2,2,2),
                new Lamp(LampType.NEON, true, 5), new Wardrobe(3,4, 2.5),
                new Carpet(5, 5, PaintColor.GREEN));

        System.out.println(bedroom.toString());
    }
}