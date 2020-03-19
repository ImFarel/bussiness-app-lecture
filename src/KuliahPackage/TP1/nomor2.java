package KuliahPackage.TP1;

public class nomor2 {
    public static void main(String[] args) {
        String array1[] = {"A", "B", "C", "D", "E"};
        String array2[] = {"C", "D", "E"};
        compareArray(array1, array2);
    }

    /**
     * Test ALL given element
     *
     * @param array2
     * @param array1
     */
    private static void compareArray(String[] array2, String[] array1) {
        boolean b = false;
        for (String s : array2) {

            for (String value : array1) {

                if (s == value) {
                    b = true;
                    String trueVal = "true => %s == %s";
                    String res = String.format(trueVal, s, value);

                    System.out.println(res);
                } else {
                    b = false;
                    String falseVal = "false => %s == %s";
                    String res = String.format(falseVal, s, value);

                    System.out.println(res);
//                    break;
                }
            }
        }
    }
}
