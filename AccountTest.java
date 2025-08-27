package AccountTest;

public class AccountTest {
   

    public static void main(String[] args) {
        SavingsTest sa0001 = new SavingsTest();
        sa0001.balance = 1000;
        sa0001.name = "Marzz";
        sa0001.interestRate = 0.05;
        sa0001.cetak();
        SavingsTest sa0002 = new SavingsTest();
        sa0002.balance = 2000;
        sa0002.name = "Andre";
        sa0002.interestRate = 0.07;
        sa0002.cetak();



    }
    
}
