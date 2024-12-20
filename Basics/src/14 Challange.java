 class Operator {
    public static void main(String[] args) {
        int a=0b101011;
        int b=0b000101;

        int b_AND= a&b;
        int b_XOR=a^b;
        int b_OR=a|b;
        int leftShift=a>>2;
        int rightShift=a<<1;

        System.out.println("Bitwise &: " +Integer.toBinaryString(b_AND));//1
        System.out.println("Bitwise XOR: "+Integer.toBinaryString(b_XOR));//101110
        System.out.println("Bitwise OR: "+Integer.toBinaryString(b_OR));//101111
        System.out.println("Left Shift: "+Integer.toBinaryString(leftShift));
        System.out.println("Right Shift: "+rightShift);//010101
    }
}
