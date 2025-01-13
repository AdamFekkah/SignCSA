public class Main {
    public static void main(String[] args) {
        Sign sign1 = new Sign("ABC222DE", 3);
        System.out.println(sign1.numberOfLines()); // Expected: 3
        System.out.println(sign1.getLines()); // Expected: "ABC;222;DE"

        Sign sign2 = new Sign("ABCD", 10);
        System.out.println(sign2.numberOfLines()); // Expected: 1
        System.out.println(sign2.getLines()); // Expected: "ABCD"

        Sign sign3 = new Sign("ABCDEF", 6);
        System.out.println(sign3.numberOfLines()); // Expected: 1
        System.out.println(sign3.getLines()); // Expected: "ABCDEF"

        Sign sign4 = new Sign("", 4);
        System.out.println(sign4.numberOfLines()); // Expected: 0
        System.out.println(sign4.getLines()); // Expected: null

        Sign sign5 = new Sign("AB_CD_EF", 2);
        System.out.println(sign5.numberOfLines()); // Expected: 4
        System.out.println(sign5.getLines()); // Expected: "AB;_C;D_;EF"
    }
}
