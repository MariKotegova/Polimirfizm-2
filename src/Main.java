import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        TaxServise taxServise = new TaxServise();

        Bill[] payments = new Bill[] {
                new Bill(100_000.00, new IncomeTaxType(), taxServise),
                new Bill(30_000.00, new VATaxType(), taxServise),
                new Bill(50_000.00, new ProgressiveTaxType(), taxServise),
                new Bill(40_000.00, new VATaxType(), taxServise)
        };

        BigDecimal r = new BigDecimal("0");

        for (int i = 0; i < payments.length; i++){
            Bill bill = payments[i];
            BigDecimal v = BigDecimal.valueOf(bill.payTaxes());

            r = r.add(v);

        }

        System.out.format("Итоговый налог %.2f%n", r);
    }
}
