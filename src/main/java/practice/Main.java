package practice;

import java.util.*;

import static practice.CoolNumbers.*;

public class Main {
    public static void main(String[] args) {

        List<String> coolNumbers = generateCoolNumbers();
        HashSet<String> hashSet = new HashSet<>(coolNumbers);
        TreeSet<String> treeSet = new TreeSet<>(coolNumbers);
        String numberToFind = coolNumbers.get(new Random().nextInt(coolNumbers.size()));

        long startTimeOverdoingTheSymbol = System.nanoTime();
        boolean foundOverdoingTheSymbol = bruteForceSearchInList(coolNumbers, numberToFind);
        long durationOverdoingTheSymbol = System.nanoTime() - startTimeOverdoingTheSymbol;
        System.out.println("Поиск перебором: номер " + (foundOverdoingTheSymbol ? "найден" : "не найден") + ", " +
                "поиск занял " + durationOverdoingTheSymbol + "нс");

        Collections.sort(coolNumbers);
        long startTimeBinary = System.nanoTime();
        boolean foundBinary = binarySearchInList(coolNumbers, numberToFind);
        long durationBinary = System.nanoTime() - startTimeBinary;
        System.out.println("Бинарный поиск: номер " + (foundBinary ? "найден" : "не найден") + ", " +
                "поиск занял " + durationBinary + "нс");

        long startTimeHashSet = System.nanoTime();
        boolean foundHashSet = searchInHashSet(hashSet, numberToFind);
        long durationHashSet = System.nanoTime() - startTimeHashSet;
        System.out.println("Поиск в HashSet: номер " + (foundHashSet ? "найден" : "не найден") + ", " +
                "поиск занял " + durationHashSet + "нс");

        long startTimeTreeSet = System.nanoTime();
        boolean foundTreeSet = searchInTreeSet(treeSet, numberToFind);
        long durationTreeSet = System.nanoTime() - startTimeTreeSet;
        System.out.println("Поиск в TreeSet: номер " + (foundTreeSet ? "найден" : "не найден") + ", " +
                "поиск занял " + durationTreeSet + "нс");

    }
}

