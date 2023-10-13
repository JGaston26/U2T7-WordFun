public class WordFunRunner {
    public static void main(String[]args)
    {
        WordFun methods = new WordFun();

        String str1 = methods.pigLatin("computer");
        System.out.println(str1);
        String str2 = methods.removeCharacter("Halloween", 5);
        System.out.println(str2);
        String str3 = methods.insertAt("ghost", "BOO!", "o");
        System.out.println(str3);
        String str4 = methods.endUp("It's Thursday", 3);
        System.out.println(str4);
        String str5 = methods.yellOrWhisper("Hello James!");
        System.out.println(str5);
        boolean bool = methods.longerThan("apple", 4);
        System.out.println(bool);
        String str6 = methods.funnyString("computer", 3);
        System.out.println(str6);
        String str7 = methods.halvesReversed("computer");  //even # of letters
        System.out.println(str7);
    }

}
