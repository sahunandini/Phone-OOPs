public class Main {
    public static void main(String[] args) {

        Landline l1 = new Landline("3626372");
        Landline l2 = new Landline("2743287");

        l1.callNumber("2743287");
        l2.receiveCall("3626372");
        System.out.println(l2.answerCall());

    }
}