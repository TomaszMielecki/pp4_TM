package pl.tmielecki.creditcard;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


@Test
public class CreditCardTest {
    void itAllowsToAssignCredit() {

        CreditCard card = new CreditCard();

        card.assignCreditLimit(BigDecimal.valueOf(1000));

        assert BigDecimal.valueOf(1000).equals(card.getBalance());
    }



    void itDenyCreditBelowThreshold() {
        CreditCard card = new CreditCard();

        try {
            card.assignCreditLimit(BigDecimal.valueOf(50));

        }
    }
}
