package com.epam.sportbetting.domain.outcome;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class Outcome {

    private final String description;
    private final List<OutcomeOdd> outcomeOdds;

    public Outcome(final String description, final List<OutcomeOdd> outcomeOdds) {
        this.description = description;
        this.outcomeOdds = outcomeOdds;
    }

    public String getDescription() {
        return description;
    }

    public List<OutcomeOdd> getOutcomeOdds() {
        return outcomeOdds;
    }
}
