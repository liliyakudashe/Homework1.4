public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Первая задача");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Совершеннолетие ещё не наступило подожди немного");
        }
        //Задача 2
        System.out.println("Вторая задача");
        int ageHuman = 33;
        if (ageHuman >= 7 && ageHuman < 18) {
            System.out.println("Ты ходишь в школу");
        }
        if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("Ты закончил школу, иди в университет");
        }
        if (ageHuman > 24) {
            System.out.println("Ты окончил университет, иди работать");
        }
        //Задача 3
        System.out.println("Третяя задача");
        int totalSeats = 102;
        int seating = 60;
        int standingPlaces = totalSeats - seating;
        if (totalSeats >= 103) {
            System.out.println("Вагон полностью забит");
        }
        if (seating >= 61) {
            System.out.println("Сидячих мест не осталось");
        }
        if (standingPlaces <= 42) {
            System.out.println("Есть ещё стоячие места");
        }
        //Задача 4
        System.out.println("Четвертая задача");
        if (age >= 18) {
            System.out.println("Поздравляю,  ты совершеннолетний");
        } else {
            System.out.println("Совершеннолетие ещё не наступило, подожди немного");
        }
        //Задача 5
        System.out.println("Пятая задача");
        if (ageHuman >= 7 && ageHuman < 18) {
            System.out.println("Ты всё ходишь в школу");
        }
        if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("Ты ходишь в универ");
        } else {
            System.out.println("Иди работай!!!");
        }
        //Шестая задача
        System.out.println("Шестая задача");
        if  (standingPlaces < 41) {
            System.out.println("Есть ещё стоячие места");
        }
        if (seating >= 61) {
            System.out.println("Сидячих мест не осталось");
        } else {
            System.out.println("Вагон полностью забит");
        }
        //Седьмая задача
        System.out.println("Седьмая задача");
        String kindergarten = "в детский сад";
        String school = "в школу";
        String university = " в университет";
        String work = "на работу";
        int kinderAge = 50;

        if (kinderAge > 2 && kinderAge < 7){
            System.out.printf("Если возраст человека равен %d то ему нужно ходить %s ", kinderAge, kindergarten );
        }
        else if (kinderAge  > 7 && kinderAge < 18) {
            System.out.printf("Если возраст человека равен %d то ему нужно ходить %s ", kinderAge, school );
        } else if (kinderAge > 18 && kinderAge < 24) {
            System.out.printf("Если возраст человека равен %d то ему нужно ходить %s ", kinderAge, university );
        } else if ( kinderAge > 24 && kinderAge < 65)  {
            System.out.printf("Если возраст человека равен %d то ему нужно ходить %s \n", kinderAge, work );
        }
// Восьмая задача
        System.out.println("Седьмая задача");
        String cantRide = "ты не можешь кататься на атракционе, малыш";
        String rideWithAnEscort = "катайся на аттракционе, только в сопровождении взрослого";
        String rideWithoutAnEscort = "ты уже достаточно взрослый, что-бы кататься на аттракционе без сопровождения взрослого";
        int theLittleMan = 15;
        boolean baby = (theLittleMan < 5);
        boolean escort = (theLittleMan > 5 && theLittleMan < 14);
        if (baby){
            System.out.printf("Тебе %d лет, %s", theLittleMan, cantRide);
        } else if (escort) {
            System.out.printf("Тебе %d лет, %s", theLittleMan, rideWithAnEscort);
        }else {
            System.out.printf("Тебе %d лет, %s \n", theLittleMan, rideWithoutAnEscort);
        }
// Восьмая задача
        System.out.println("Восьмая задача");
        int one = 56;
        int two = 78;
        int free = 23;
        if ((one < two) && (one < free)) {
            System.out.println("One - наименьшее");
        } else if ((two < one) && (two < free)) {
            System.out.println("Two - наименьшее");
        } else if ((free < one) && (free < two)) {
            System.out.println("Free - наименьшее");
        }

    }

        }
