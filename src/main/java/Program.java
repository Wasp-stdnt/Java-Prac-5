public class Program {
    public static void main(String[] args) {
        System.out.println(WordDetectionFSM.examineString("TEST"));
        System.out.println(WordDetectionFSM.examineString("Not Test"));
        System.out.println(WordDetectionFSM.examineString("First letter T"));
        System.out.println(WordDetectionFSM.examineString("Second letter TE"));
        System.out.println(WordDetectionFSM.examineString("Third letter TES"));
        System.out.println(WordDetectionFSM.examineString("Within a string abcTESTabc"));
        System.out.println(WordDetectionFSM.examineString("Not within a string abcTeSTabc"));
        System.out.println(WordDetectionFSM.examineString("Two in a row TESTTEST"));
    }
}
