import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int age = 30;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        } else {
            System.out.println("Ты не можешь водить");
        }
        int age1 = 19;
        if (age1 >= 18 && age1 < 21) {
            System.out.println("Ты достаточно взрослый, чтобы водить, но недостаточно, чтобы пить алкоголь");
        }

        if (age1 < 7 || age1 > 18) {
            System.out.println("Я думаю ты не ходишь в школу");
        }

        boolean skyIsClear = true;
        if (skyIsClear) {
            System.out.println("Небо чистое");
        }

        int age3 = 18;
        if (age3 >= 18) {
            System.out.println("Если возраст человека равен " + age3 + " то он совершеннолетний");
        }
        if (age3 < 18) {
            System.out.println("Если возраст человека равен " + age3 + " то он не достиг совершеннолетия");
        }
        int temperature = 1;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        int speed = 90;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        int years = 25;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в университет");
        }
        if (years > 24) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить на работу");
        }
        int yearsOld = 9;
        if (yearsOld < 5) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " то ему нельзя кататься на аттракционе");
        }
        if (yearsOld >= 5 && yearsOld < 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " то ему можно ататься на аттракционе в сопровождении взрослого");
        }
        if (yearsOld >= 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        int people = 115;
        if (people <= 102) {
            System.out.println("В вагоне есть место");
        } else {
            System.out.println("В вагоне нет места");
        }
        if (people <= 60) {
            System.out.println("В вагоне есть сидячее место ");
        }
        if (people > 60 && people <= 102) {
            System.out.println("В вагоне есть стоячее место");
        }
        if (people > 102) {
            System.out.println("Вагон полностью забит");
        }

        int one = 8;
        int two = 35;
        int three = 98;
        if (two > one && two > three) {
            System.out.println("Самое большое число" + two);
        }
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else {
            System.out.println("Наибольшее число " + three);
        }
    }
}













