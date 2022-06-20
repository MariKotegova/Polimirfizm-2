public class IncomeTaxType  extends TaxType{
    public String nameTax = " Подоходный налог 13%";

    public String name (){
        return nameTax;
    }

    @Override
    public double calculateTaxFor(double amount) {
        int procent = 13;

        return amount / 100 * 13;
    }
}
