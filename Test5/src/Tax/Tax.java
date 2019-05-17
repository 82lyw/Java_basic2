package Tax;

public class Tax {

    public static void main(String[] args) {
        int[][] bracketsFor2009 = {
                {8350,33950,52250,171550,372950},
                {16700,67900,137050,208850,372950},
                {8350,33950,68525,104425,186475},
                {11950,45500,117450,190200,372950}
        };
        double[] ratesFor2009 = {0.1,0.15,0.25,0.28,0.33,0.35};

        Tax taxFor2001 = new Tax();
        System.out.println("2001 Tax Table");
        System.out.println("Income  Single    Joint     Separate  a house");
        for (int taxableIncome = 50000;taxableIncome <= 60000;taxableIncome += 1000) {
            taxFor2001.setTaxableIncome(taxableIncome);
            System.out.printf("%-8d",taxableIncome);
            System.out.printf("%-10.2f",taxFor2001.findTax());
            for (int a = 1;a <= 3;a++) {
                taxFor2001.setFilingStatus(a);
                System.out.printf("%-10.2f",taxFor2001.findTax());
            }
            System.out.println();
        }
        System.out.println();

        Tax taxFor2009 = new Tax(0,bracketsFor2009,ratesFor2009,50000);

        System.out.println("2009 Tax Table");
        System.out.println("Income  Single    Joint     Separate  a house");

        for (int taxableIncome = 50000;taxableIncome <= 60000;taxableIncome += 1000) {
            taxFor2009.setTaxableIncome(taxableIncome);
            System.out.printf("%-8d",taxableIncome);
            System.out.printf("%-10.2f",taxFor2009.findTax());
            for (int a = 1;a <= 3;a++) {
                taxFor2009.setFilingStatus(a);
                System.out.printf("%-10.2f",taxFor2009.findTax());
            }
            System.out.println();

        }
    }

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    double taxableIncome;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    public Tax(){
        int[][] person = {
                {27050,65550,136750,297350},
                {45200,109250,166500,297350},
                {22600,54625,83250,148675},
                {36250,93650,151650,297350}
        };
        double[] rate = {0.15,0.275,0.305,0.355,0.391};
        filingStatus = 0;
        brackets = person;
        rates = rate;
        taxableIncome = 0;
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus(){
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus){
        this.filingStatus = filingStatus;
    }

    public double getTax(){
        return taxableIncome;
    }

    public int[][] getBrackets(){
        return brackets;
    }

    public void setBrackets(int[][] brackets){
        this.brackets = brackets;
    }

    public double[] getRates(){
        return rates;
    }

    public void setRates(double[] rates){
        this.rates = rates;
    }

    public void setTaxableIncome(double tax) {
        taxableIncome = tax;
    }

    public double findTax() {
        double tax = 0;
        if (taxableIncome <= brackets[filingStatus][0])
            return tax = taxableIncome * rates[0];
        else
            tax = brackets[filingStatus][0] * rates[0];
        int i;
        for (i = 1;i < brackets[0].length;i++) {
            if (taxableIncome > brackets[filingStatus][i])
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
            else {
                tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];
                break;
            }
        }
        if (i == brackets[0].length && taxableIncome > brackets[filingStatus][i - 1])
            tax += (taxableIncome - brackets[filingStatus][i-1]) * rates[i];
        return tax;
    }

}
