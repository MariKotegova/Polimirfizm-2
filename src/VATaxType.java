public class VATaxType extends TaxType{
    public String nameTax = " НДС 18%";

    public String name (){
        return nameTax;
    }

    @Override
    public double calculateTaxFor(double amount) {
        int procent = 18;

        return amount / 118 * procent;
    }
}
