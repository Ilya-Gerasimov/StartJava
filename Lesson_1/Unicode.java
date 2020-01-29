public class UnicodeChar {
    public static void main(String[] args) {
        for (int i = 33; i <= 126; i++) {
            System.out.println(Character.valueOf((char) i));
        }
    }
}