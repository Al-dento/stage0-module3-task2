package lang.print.gaps.task2;

public class AdvancedNamingConvention {

    private final static int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;

    void callToFriend() {
        System.out.println(phoneNumber + "" + ADULT_AGE);
    }

    void callByNumber(int phoneNumber) {
        System.out.println(phoneNumber + "" + age);
    }
}
