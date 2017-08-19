package com.epam.sportbetting.domain.bet;

import com.epam.sportbetting.domain.outcome.Outcome;
import com.epam.sportbetting.domain.sportevent.SportEvent;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class Bet {

    private final SportEvent sportEvent;
    private final String description;
    private final List<Outcome> outcomes;

    public Bet(final SportEvent sportEvent, final String description, final List<Outcome> outcomes) {
        this.sportEvent = sportEvent;
        this.description = description;
        this.outcomes = outcomes;
    }

    public SportEvent getSportEvent() {
        return sportEvent;
    }

    public String getDescription() {
        return description;
    }

    public List<Outcome> getOutcomes() {
        return outcomes;
    }
}
