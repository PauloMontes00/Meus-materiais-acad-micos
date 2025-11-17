package lista04;

public class InverterString {
    public String inverter(String s) {
        if (s.length() <= 1) return s;
        return inverter(s.substring(1)) + s.charAt(0);
    }

    static void main(String[] args) {
        System.out.println(new InverterString().inverter("dasd"));
    }
}
