
public class MyString implements IString {

    @Override
    public int f1(String string) {
        int primeCount = 0;

        for (char ch : string.toCharArray()) {

            if (ch == '2' || ch == '3' || ch == '5' || ch == '7') {
                primeCount++;
            }
        }
        return primeCount;
    }
// a32b 95cd b67

    @Override
    public String f2(String string) {
        String[] words = string.split("\\s+");
        StringBuilder reversedStr = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr.append(words[i]);
            if (i > 0) {
                reversedStr.append(" ");
            }
        }

        return reversedStr.toString();
    }

}
//a9 b1 a8 a7 a6 a5