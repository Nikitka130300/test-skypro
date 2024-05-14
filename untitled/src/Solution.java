import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(palindrome("Бел хлеб"));
        System.out.println(symmetricDifference(Set.of(1,2,3),Set.of(0,1,2)));
        System.out.println(factorial(20));
    }

    /**
     * Метод, который проверяет строку, является ли она палиндромом
     */
    private static boolean palindrome(String s) {
        return s.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(s.replaceAll("\\W", "")).reverse().toString());
    }

    /**
     * Метод, который вычисляет симметрическую разность между двумя множествами Set
     */
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> newSet = new HashSet<>(set1);
        newSet.addAll(set2);
        Set<T> newNewSet = new HashSet<>(set1);
        newNewSet.retainAll(set2);
        newSet.removeAll(newNewSet);
        return newSet;
    }

    /**
     * Вычисление факториала числа
     */
    public static BigInteger factorial(int value){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
