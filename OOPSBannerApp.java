public class OOPSBannerApp {

    // Method for letter O
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " *    *",
            " *    *",
            " ***** ",
            " *      ",
            " *      ",
            " *      "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[] {
            "  *****",
            " *     ",
            " *     ",
            "  **** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] o1 = getOPattern();
        String[] o2 = getOPattern();  // second O
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        for (int i = 0; i < o1.length; i++) {
            System.out.println(o1[i] + "  " +
                               o2[i] + "  " +
                               p[i]  + "  " +
                               s[i]);
        }
    }
}