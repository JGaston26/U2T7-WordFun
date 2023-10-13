public class WordFun {
    public boolean longerThan(String myString, int maxLength)
    {
        if(myString.length() > maxLength)
        {
            return true;
        }else{
            return false;
        }
    }
    public String funnyString(String str, int idx)
    {
        int idxAfter = idx + 1;
        String character = str.substring(idx, idxAfter);
        return character + str + character;
    }

    public String halvesReversed(String myString)
    {
        int half = myString.length() /2;


        return myString.substring(half) + myString.substring(0,half);
    }

    public String pigLatin(String orig) {
        String firstLetter = orig.substring(0,1);
        String restWord = orig.substring(1);
        return restWord + firstLetter + "ay";
    }

    public String removeCharacter(String myString, int removeIdx) {
        if(removeIdx > myString.length()-1) {
            return myString;
        }
        else {
            String firstPart = myString.substring(0,removeIdx);
            String secondPart = myString.substring(removeIdx + 1);
            return firstPart + secondPart;
        }
    }

    public String insertAt(String orig, String insertText, String searchStr) {

        if (!orig.contains(searchStr))
        {
            return orig + insertText;
        }
        int getLetter = orig.indexOf(searchStr);
        String firstHalf = orig.substring(0,getLetter);
        String secondHalf = orig.substring(getLetter);
        return firstHalf + insertText + secondHalf;
    }

    public String endUp(String myString, int numToCap){
        if(myString.length() < numToCap)
        {
            return myString.toUpperCase();
        }else{
            int endPart = myString.length()-numToCap;
            String firstHalf = myString.substring(0,endPart);
            String secondHalf = myString.substring(endPart).toUpperCase();
            return firstHalf + secondHalf;
        }
    }

    public String yellOrWhisper(String myString) {
        if(myString.substring(0,1).equals(myString.toUpperCase().substring(0,1))){
            return myString.toUpperCase();
    }else{
            return myString.toLowerCase();
        }
}

}
