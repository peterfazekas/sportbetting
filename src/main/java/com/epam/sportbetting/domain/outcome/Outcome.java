package com.epam.sportbetting.domain.outcome;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class Outcome {

    private final BigDecimal value;
    private final List<OutcomeOdd> outcomeOdds;

    public Outcome(final BigDecimal value, final List<OutcomeOdd> outcomeOdds) {
        this.value = value;
        this.outcomeOdds = outcomeOdds;
    }

    public BigDecimal getValue() {
        return value;
    }

    public List<OutcomeOdd> getOutcomeOdds() {
        return outcomeOdds;
    }
}
