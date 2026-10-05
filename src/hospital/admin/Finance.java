package hospital.admin;
public class Finance {
    private double bill = 500000;
    double balance = bill - 300000;
    public String report() { return "Balance due: " + balance; }
}