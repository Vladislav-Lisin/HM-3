public class Main {
    public static void main(String[] args) {
        // task 1
        int dog = 20;
        byte cat = 5;
        short pig = 15;
        long big = 10000000;
        float half = 5.5f;
        double half2 = 5.6;

        // task 2
        float one = 27.12f;
        long two = 987678965549L;
        double free = 2.786;
        int five = 569;
        short six = -159;
        int seven = 27897;
        byte nine = 67;

        // task 3
        int pavlova = 23;
        int sergeeva = 27;
        int andreeva = 30;
        int allPaper = 480;
        int papersPerson = allPaper / (pavlova + sergeeva + andreeva);
        System.out.println("На каждого ученика рассчитано " + papersPerson + " листов бумаги");



        // task 4
        int efficiency = 16;
        int time = 20;
        System.out.println("За " + time + " минут машина произвела " + efficiency * time / 2 + " штук бутылок");
        time = 24 * 60;
        System.out.println("За " + time + " минут машина произвела " + efficiency * time / 2 + " штук бутылок");
        time = 24 * 60 * 3;
        System.out.println("За " + time + " минут машина произвела " + efficiency * time / 2 + " штук бутылок");
        time = 24 * 60 * 30;
        System.out.println("За " + time + " минут машина произвела " + efficiency * time / 2 + " штук бутылок");

        // task 5
        int allBucket = 120;
        int whiteBucketPer = 2;
        int brownBucketPer = 4;
        int countClass = allBucket / (whiteBucketPer + brownBucketPer);
        System.out.println("В школе, где " + countClass + " классов, нужно " + countClass * whiteBucketPer + " банок белой краски и " + countClass * brownBucketPer + " банок коричневой краски");

        // task 6
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceСream = 2 * 100;
        int egg = 4 * 70;
        int sumKg = (bananas + milk + iceСream + egg) / 1000;
        System.out.println(sumKg);

        //task 7
        int newMass = 7 * 1000;
        int minMinus = 250;
        int maxMines = 500;
        System.out.println(((newMass / minMinus) + (newMass / maxMines)) / 2);

        //task 8
        float oldSalaryMary = 67760;
        float newSalaryMary = oldSalaryMary * 1.1f;
        float oldSalaryDen = 83690;
        float newSalaryDen = oldSalaryDen * 1.1f;
        float oldSalaryKriss = 76230;
        float newSalaryKriss = oldSalaryKriss * 1.1f;
        System.out.println("Маша теперь получает " + newSalaryMary + " рублей. Годовой доход вырос на " + ((newSalaryMary - oldSalaryMary) * 12) + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDen + " рублей. Годовой доход вырос на " + ((newSalaryDen - oldSalaryDen) * 12) + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKriss + " рублей. Годовой доход вырос на " + ((newSalaryKriss - oldSalaryKriss) * 12) + " рублей");




    }
}