package LastDayRevise;

public class SearchSubstring {
    public static void main(String[] args) {
        String sentence="She  shares her breakfast";
        String[]  words=sentence.split("\\s+");
        for(String word:words){
            for(int i=0;i<word.length()-2;i++){
                if(word.regionMatches(true,i,"sh",0,2)){
                    System.out.println("Word Containg sh :"+word);
                    break;
                }
            }
        }
    }
}
