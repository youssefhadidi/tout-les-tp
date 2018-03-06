/**
 * Word class : a class to represent word with several usefull functions
 *
 * @author :
 */

public class Word {

    // ATTRIBUTS
    /* contains the string that represents the characters of this word */
    private String value;

    // CONSTRUCTEURS
    /** builds Word defined by its characters
     * @param s the string that contains the characters for this Word object
     */
    public Word(String s) {
	     this.value = s;
    }

    // METHODES
    /**
     * returns <code>true</code> if <code>o</code> is equals to this word object, ie if
     * <code>o</code> is a Word and its value is the same as this word's value
     *
     * @param o the object to be compared with this Word
     * @return <code>true</code> iff <code>o</code> is a Word with the same value as this word.
     */
    public boolean equals(Object o) {
	     if (o instanceof Word) {
	        Word theOther = (Word) o;
	     return this.value.equals(theOther.value);
	     } else {
	        return false;
	     }
    }

    /**
     * Returns nb of chars of Word object
     *@return (int) length of Word object
     */
    public int nbOfChars() {
      return this.value.length();
    }

    /**
     * Returns the value of Word object
     *@return (String) string value of Word object
     */
    public String toString() {
      return this.value;
    }

    /**
     * Returns nb of occurrences of char c in Word object
     *@return (int) nb of occurrences of char c in Word object
     */
    public int nbOccurrencesOfChar(char c) {
      int cpt = 0;
      for (int i = 0; i<this.value.length(); i++){
        if (this.value.charAt(i) == c) { cpt++; }
      }
      return cpt;
    }

    /**
     * Returns a word with reverse value of Word object
     *@return (Word) a word with reverse value of Word object
     */
    public Word reverse() {
      String value1 = new String();
      for (int i=0; i<this.nbOfChars(); i++){
        value1 += this.value.charAt(this.nbOfChars()-i -1);
      }
      return new Word(value1);
    }

    /**
    * Returns true if Word object is a palindrome, false else
    *@return (boolean) true if Word object is a palindrome, false else
     */
    public boolean isPalindrome() {
      return this.equals(this.reverse());
    }

    /**
     * Returns true if Word object contain m, false else
     *@return (boolean) true if Word object contain m, false else
     */
    public boolean contains(Word m) {
      int index = this.value.indexOf(m.toString().charAt(0));
      return this.value.substring(index,index+m.nbOfChars()).equals(m.toString());
    }

    /**
     * Returns true if 3last char of Word object and m are the same, false else
     *@return (boolean) true if 3last char of Word object and m are the same, false else
     */
    public boolean rhymesWith(Word m) {
      if (m.nbOfChars() >= 3){
          return this.value.endsWith(m.toString().substring(m.toString().length()-3));
      }
      return false;
    }

    /**
     * Returns true if first letter is an uppercase, false else
     *@return (boolean) true if first letter is an uppercase, false else
     */
    public boolean isProperNoun() {
      return Character.isUpperCase(this.value.charAt(0));
    }

    /**
     * Returns true if Word object is an anagram of Word m, false else
     *@param m (Word) other Word
     *@return (boolean) true if Word object is an anagram of Word m, false else
     */
    public boolean isAnagram(Word m) {
      for(int i = 0; i< this.nbOfChars(); i++){
        if ( this.nbOccurrencesOfChar(this.value.charAt(i)) != m.nbOccurrencesOfChar(this.value.charAt(i)) ){
          return false;
        }
      }
      return true;
    }

    /**
     * Returns 2 words splitted by c if Word object contains c, [] else
     *@return (Word[]) 2 words splitted by c if Word object contains c, [] else
     */
    public Word[] extractBefore(char c) {
      Word[] tab = new Word[2];
      if (this.nbOccurrencesOfChar(c) ==0 ){
        tab[0] = new Word("");
        tab[1] = this;
      } else{
        tab[0] = new Word( this.value.substring(0,this.value.indexOf(c)+1) );
        tab[1] = new Word( this.value.substring(this.value.indexOf(c)+1,this.nbOfChars()) );
      }
      return tab;
    }

}
