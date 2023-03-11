package exercise;

// BEGIN
public class ReversedSequence implements CharSequence{

    private final String str;
    private String revStr;
    private final String[] temp;
    private String[] revTemp;

    public ReversedSequence(String str, String revStr, String[] temp, String[] revTemp) {
        this.str = str;
        this.revStr = revStr;
        this.temp = temp;
        this.revTemp = revTemp;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (String ch : revTemp) {
            res.append(ch);
        }
        return res.toString();
    }

    @Override
    public int length() {
        return revTemp.length;
    }

    @Override
    public char charAt(int index) {
        char[] ch = revStr.toCharArray();
        return ch[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return revStr.substring(start, end);
    }

//    private void setRevTemp(String[] arr) {
//        String[] reverse = new String[str.length()];
//        int num = 0;
//        for (int i = temp.length - 1; i >= 0; i--) {
//            reverse[num] = arr[i];
//            num++;
//        }
//        this.revTemp = reverse;
//    }
//
//    private void setRevStr() {
//        StringBuilder res = new StringBuilder();
//        for (String ch : revTemp) {
//            res.append(ch);
//        }
//        this.revStr = res.toString();
//    }
}

// END
