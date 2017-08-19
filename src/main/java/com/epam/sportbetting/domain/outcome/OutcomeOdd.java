package com.epam.sportbetting.domain.outcome;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class OutcomeOdd {

    private final Outcome outcome;
    private final BigDecimal oddValue;
    private final LocalDateTime validFrom;
    private final LocalDateTime validTo;

    public OutcomeOdd(final Outcome outcome, final BigDecimal oddValue, final LocalDateTime validFrom, final LocalDateTime validTo) {
        this.outcome = outcome;
        this.oddValue = oddValue;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public BigDecimal getOddValue() {
        return oddValue;
    }

    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    public LocalDateTime getValidTo() {
        return validTo;
    }
}
