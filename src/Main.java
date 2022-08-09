public class Main {
    public static void main(String[] args) {
        byte a = 12;
        short b = 100;
        int c = 2003;
        long d = 10005L;
        float e = 1.24f;
        double f = 58.657;
        char j = 33;

        float boxerOne = (float) 78.2;
        float boxerTwo = (float) 82.7;
        float boxersWeight = (float) (boxerOne + boxerTwo);
        System.out.println("Общий вес двух бойцов " + boxersWeight + " кг!");
        float weightDifference = (float) (boxerTwo - boxerOne);
        System.out.println("Разница между бойцами " + weightDifference + " кг!");

        int banana = 80;
        int bananaVolume = 5;
        int bananaWeight = (banana * bananaVolume);
        int milk = 105;
        int milkVolume = 2;
        int milkWeight = (milk * milkVolume);
        int eskimo = 100;
        int eskimoVolume = 2;
        int eskimoWeight = (eskimo * eskimoVolume);
        int egg = 70;
        int eggVolume = 4;
        int eggWeight = (egg * eggVolume);
        float weightGr = (bananaWeight + milkWeight + eskimoWeight + eggWeight);
        int grPerKg = 1000;
        float weightKg = (float) (weightGr / grPerKg);
        System.out.println("Вес спорт-завтрака " + weightKg + " кг!");

        int weightLose = 7;
        float dietOne = (float) 250;
        float dietTwo = (float) 500;
        float dietGrOne = (float) (dietOne / grPerKg);
        float dietGrTwo = (float) (dietTwo / grPerKg);
        float averageDays1 = (float) (weightLose / dietGrOne);
        float averageDays2 = (float) (weightLose / dietGrTwo);
        System.out.println("Количество дней первой диеты: " + averageDays1);
        System.out.println("Количество дней второй диеты: " + averageDays2);
        float bothDiets = (float) (averageDays1 + averageDays2);
        float daysQuantity = (float) (bothDiets / 2);
        System.out.println("Среднее количество дней для похудения: " + daysQuantity);

        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        int fullSalary = 100;
        int increase = 10;
        float salaryIncrease = (fullSalary + increase);
        float percentTurn = (salaryIncrease / 100);
        float mashaGrow = (masha * percentTurn);
        float mashaDifference = (mashaGrow - masha);
        float denisGrow = (denis *percentTurn);
        float denisDifference = (denisGrow - denis);
        float kristinaGrow = (kristina * percentTurn);
        float kristinaDifference = (kristinaGrow - kristina);
        System.out.println("Маша теперь получает " + mashaGrow + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisGrow + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaGrow + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}


