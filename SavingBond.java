public class SavingBond {
    public String name;
    public double balance, rate;
    public int term, monthsRemaining;

    public void seTermAndRate(int term) {
       int t = 0;
       if(t>=0 && t<=12)
          rate = 0.005;
       else if(t>=12 && t<=24)
            rate = 0.010;
         else if(t>=24 && t<=36)
            rate = 0.015;
         else if(t>=36 && t<=48)
            rate = 0.012;
        else if(t>=48 && t<=60)
            rate = 0.025;
        else{
            System.out.println("Invalid term.");
            t = 0;
        }
        this.term = t;
        this.monthsRemaining = t;
             
    }

    public void earnMonthlyInterest() {
        if (monthsRemaining > 0) {
            balance += (balance * rate) / 12;
            monthsRemaining--;
            System.out.println("Balance: $" + balance);
            System.out.println("Rate: " + rate);
            System.out.println("Months Remaining: "
                               + monthsRemaining);
        } else {
            System.out.println("Bond Matured");
        }//endif
    }//end earnMonthlyInterest
}//end class Bond



