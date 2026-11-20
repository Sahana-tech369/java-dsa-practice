class Main {
    public static void main(String[] args) {
        int n = 121;
        String s = String.valueOf(n);
        String rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
