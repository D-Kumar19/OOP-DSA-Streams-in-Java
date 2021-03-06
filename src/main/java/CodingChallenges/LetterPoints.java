package CodingChallenges;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class LetterPoints {
    private static final Map<Character, Integer> letterPoints =
            Map.ofEntries(Map.entry('A', 1), Map.entry('B', 3), Map.entry( 'C', 3), Map.entry( 'D', 2),
                            Map.entry( 'E', 1), Map.entry( 'F', 4), Map.entry( 'G', 2), Map.entry( 'H', 4),
                            Map.entry( 'I', 1), Map.entry( 'J', 8), Map.entry( 'K', 5), Map.entry( 'L', 1),
                            Map.entry( 'M', 3), Map.entry( 'N', 1), Map.entry( 'O', 1), Map.entry( 'P', 3),
                            Map.entry( 'Q', 10),Map.entry( 'R', 1), Map.entry( 'S', 1), Map.entry( 'T', 1),
                            Map.entry( 'U', 1), Map.entry( 'W', 4), Map.entry( 'V', 4), Map.entry( 'X', 8),
                            Map.entry( 'Y', 4), Map.entry( 'Z', 10));

    public static void main(String[] args) {

        System.out.println("This program will calculate the number of points you will earn according to your word!");
        System.out.println("Note: This program will only count the first word!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String word = sc.nextLine();
        System.out.println("Your word " + word + " will earn " + wordScoreCalculator(word));
    }

    static int wordScoreCalculator(String word) {
//        Using Loop:
        word = word.toUpperCase(Locale.ROOT);
        int i = 0;
        int score = 0;
        while(i < word.length()){
            if(letterPoints.get(word.charAt(i)) != null) score += letterPoints.get(word.charAt(i));
            i++;
        }
        return score;

//        Using Streams:
//        AtomicInteger score = new AtomicInteger();
//        word = word.toUpperCase(Locale.ROOT);
//        word.chars()
//                .filter(Character::isAlphabetic)
//                .mapToObj(n -> (char) n)
//                .forEachOrdered(letter -> {
//                    if(letterPoints.containsKey(letter)){
//                        score.addAndGet(letterPoints.get(letter));
//                    }
//                });
//        return score.get();
    }
}