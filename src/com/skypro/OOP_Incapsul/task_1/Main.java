package com.skypro.OOP_Incapsul.task_1;

import com.skypro.OOP_Incapsul.task_1.transport.Car;

public class Main {

    public static void main(String[] args) {
        System.out.println("HomeWork_OOP_Object");

        System.out.println();
        System.out.println("task_1");
        Human maksim = new Human(1987, "Максим", "Минск", "бренд-менеджером");
        Human anya = new Human(1993, "Аня", "Москва", "методистом образовательных программ");
        Human katya = new Human(1994, "Катя", "Калининград", "продакт-менеджером");
        Human artem = new Human(1995, "Артем", "Москва", "директора по развитию бизнеса");
        Human Vladimir = new Human(2001, "Владимир", "Казань", "не работает");

        System.out.println();
        System.out.println("task_2");
        Car ladaGrande = new Car("lada", "Grande", 1.7, "желтый", 2015, "Россия", "МКП", "сидан", 5, "У000ВБ000", true, null, null);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКПП", "сидан", 5, "К000ЕН000", true, null, null);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "АКПП", "родстер", 2, "Г000АК000", false, null, null);
        Car kiaSportage4 = new Car("Kia", "Sportage4", 2.4, "желтый", 2018, "Южная Корея", "МКП", "кроссовер", 5, "Ц000ПР000", false, null, null);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "желтый", 2016, "Южная Корея", "АКПП", "сидан", 5, "Р000ШЛ000", null, null, null);

        System.out.println();
        System.out.println("task_3");
        Flower roseCommon = new Flower("Роза обыкновенная", null, "Голандия", 35.59, 0);
        Flower hrizantemma = new Flower("Хризантемма", null, null, 15, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.90, 1);
        Flower gipsofila = new Flower("Гипсофила", null, "Турция", 19.50, 10);

        printCompositionOfBouquet(roseCommon, roseCommon, roseCommon, pion, pion, pion, hrizantemma, hrizantemma, hrizantemma, gipsofila);

        System.out.println();
        System.out.println("Complete HomeWork");
    }

    public static void printCompositionOfBouquet(Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
            totalCost += flower.getCost();
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Стоимость букета: %.2f, Количество дней стояния: %d\n", totalCost, minLifeSpan);
    }
}
