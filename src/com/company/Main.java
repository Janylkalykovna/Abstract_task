package com.company;

public class Main {

    public static void main(String[] args) {
        // ±Класс Cow (weight, age, gender, nickName)
        //±Класс Sheep(weight, age, gender, nickName)
        //±Класс Horse(weight, age, color, gender, nickName)
        //±Класс Farm(address, cows, horses, sheep, OwnerName)
        //±2 Farm тузунуз.
        //±1-Farmда 3 sheep, 5 cows, 2 horses болсун.
        //±2-Farmда 1 sheep, 1 cow, 1 horse болсун.

        Cow cow1 = new Cow(50, 4, "female", "Lolly");
        Cow cow2 = new Cow(125, 6, "male", "Pitty");
        Cow cow3 = new Cow(180, 3, "male", "Kitty");
        Cow cow4 = new Cow(100, 2, "female", "Pepe");
        Cow cow5 = new Cow(150, 12, "male", "Molly");
        Cow cow6 = new Cow(85, 4, "female", "Humy");
        Cow[] cows1 = new Cow[]{cow1, cow2, cow3, cow4, cow5};
        Cow[] cows2 = new Cow[]{cow6};

        Sheep sheep1 = new Sheep(35, 5, "female", "Lucky");
        Sheep sheep2 = new Sheep(50, 3, "male", "Teddy");
        Sheep sheep3 = new Sheep(70, 7, "female", "Suzzy");
        Sheep sheep4 = new Sheep(22, 2, "male", "Bob");
        Sheep[] sheep_1 = new Sheep[]{sheep1, sheep2, sheep3};
        Sheep[] sheep_2 = new Sheep[]{sheep4};

        Horse horse1 = new Horse(100, 12, "female", "Blaedy", "Black");
        Horse horse2 = new Horse(125, 12, "male", "Whitty", "White");
        Horse horse3 = new Horse(100, 12, "female", "Grace", "Gray");
        Horse[] horses_1 = new Horse[]{horse1, horse2};
        Horse[] horses_2 = new Horse[]{horse3};

        Farm farm1 = new Farm("John", "Michigan", horses_1, sheep_1, cows1);
        Farm farm2 = new Farm("Jane", "Osh", horses_2, sheep_2, cows2);

        System.out.println(farm1.toString());
        System.out.println("_________________________________");
        System.out.println(farm2.toString());

    }
}
