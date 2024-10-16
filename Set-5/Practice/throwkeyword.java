public class throwkeyword {
    public static void main(String[] args) {
        System.out.println("User Define");
        try {
            throw new ArithmeticException("Hello");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("after");
    }
}
