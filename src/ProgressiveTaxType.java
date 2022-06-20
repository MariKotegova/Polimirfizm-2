public class ProgressiveTaxType extends TaxType{
    public String nameTax = " Прогрессивная ставка до 100т.р 10% далее 15%";

    public String name (){
        return nameTax;
    }

    @Override
    public double calculateTaxFor(double amount) {
        int minProcent = 10;
        int maxProcent = 15;

        if (amount < 100_000){
            return amount / 100 * minProcent;
        } else {
            return amount / 100 * maxProcent;
        }

    }
}
