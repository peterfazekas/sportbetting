package com.epam.sportbetting.domain.common;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class Money {

    private BigDecimal amount;
    private final Currency currency;

    public Money(final BigDecimal amount, final Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {

        return currency;
    }
}
