package Lab6;

public class SearchSubstrings {
    public static void main(String[] args) {
        String sentence = "She shares her shell by the shore.";
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            for (int i = 0; i <= word.length() - 2; i++) {
                if (word.regionMatches(true, i, "sh", 0, 2)) {
                    System.out.println("Word containing 'sh': " + word);
                    break;
                }
            }
        }
    }
}
