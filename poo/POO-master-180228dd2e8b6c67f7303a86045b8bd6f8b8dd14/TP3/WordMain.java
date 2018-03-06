public class WordMain{
    /*
     * Constructor of WordMain
     */
    public WordMain(){}

    /*
     * Main function
     */
     public static void main(String[] args){
     Word word = new Word(args[0]);
     //System.out.println();
     //System.out.println("length of word 1: "+word.nbOfChars());
     //System.out.println("toString: "+word.toString());
     System.out.println();
     System.out.println("Reverse: "+word.reverse());
     //Word word2 = new Word(word.extractBefore('l')[0].toString());
     //Word word3 = new Word(word.extractBefore('l')[1].toString());
     //System.out.println("extract: "+word3.toString());
     //System.out.println("extract: "+word2.toString());
     System.out.println();
     //System.out.println();
     //System.out.println("contains: "+word.contains(new Word(word.extractBefore('l')[0].toString())));
     //System.out.println("contains: "+word.contains(new Word(word.extractBefore('l')[1].toString())));
     System.out.println("isProperNoun: "+word.isProperNoun());
     System.out.println("isPalindrome: "+word.isPalindrome());
     //System.out.println("isAnagram: "+word.isAnagram(new Word(args[1])));
     System.out.println("rhymes with: "+word.rhymesWith(new Word(args[1])));
    }
}
