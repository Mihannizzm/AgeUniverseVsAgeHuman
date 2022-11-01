public class AgeUniverseVsAgeHuman {

    public static void main(String[] args) {

        final long ageUniverse = 13000000000L;
        System.out.println("Возраст вселенной в годах: " + ageUniverse);

        final int ageHuman = 100000;
        System.out.println("Возраст человека как вида: " + ageHuman);

        final long differenceAgeUniversAndAgeHuman = ageUniverse / ageHuman;
        System.out.println("Вселенная старше людей в " + differenceAgeUniversAndAgeHuman + " раз");

    }
}