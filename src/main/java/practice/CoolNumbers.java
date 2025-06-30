package practice;

import java.util.*;

public class CoolNumbers {

    private static final List<Character> LETTERS =
            Arrays.asList('А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х');
    private static final int COUNT_OF_NUMBERS = 2000000;
    private static final Random THIS_IS_CONSTANT = new Random();

    public static List<String> generateCoolNumbers() {

        Set<String> coolNumbers = new HashSet<>(COUNT_OF_NUMBERS);

        while (coolNumbers.size() < COUNT_OF_NUMBERS) {
            String number = generateRandomCoolNumbers();
            coolNumbers.add(number);
        }
        return new ArrayList<>(coolNumbers);
    }
    private static String generateRandomCoolNumbers() {

        char carsAmountX = LETTERS.get(THIS_IS_CONSTANT.nextInt(LETTERS.size()));
        char carsAmountY = LETTERS.get(THIS_IS_CONSTANT.nextInt(LETTERS.size()));
        char carsAmountZ = LETTERS.get(THIS_IS_CONSTANT.nextInt(LETTERS.size()));
        int digits = THIS_IS_CONSTANT.nextInt(10) * 100 +
                THIS_IS_CONSTANT.nextInt(10) * 10 +
                THIS_IS_CONSTANT.nextInt(10);
        int region = THIS_IS_CONSTANT.nextInt(199) + 1;
        return String.format("%c%03d%c%c%02d", carsAmountX, digits, carsAmountY, carsAmountZ, region);

    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {

        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {

        return Collections.binarySearch(sortedList, number) >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {

        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {

        return treeSet.contains(number);
    }

}

