class a {

    public static void main(String[] args) {
        int last = 5, alphabet = 1;

        for (int i = 1; i <= (last - 1 + 1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;

            System.out.println();
        }
    }
}
