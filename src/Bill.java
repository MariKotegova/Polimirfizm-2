public class Bill {   // закон
    private double amount;  // сумма
    private TaxType taxType;   // тип налога
    private TaxServise taxServise;  // налогообложение, налоговое обслуживание

    public Bill (double amount, TaxType taxType, TaxServise taxServise){
        this.amount = amount;
        this.taxType = taxType;
        this.taxServise = taxServise;
    }

    public double payTaxes(){
        double taxAmount = taxType.calculateTaxFor(amount); //TODO

       // System.out.println("Система налогообложение " + taxType.name() + "    ");
        taxServise.payOut(taxAmount);
        return taxAmount;

    }


}
