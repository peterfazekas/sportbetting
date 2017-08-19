package com.epam.sportbetting.domain.sportevent;

import com.epam.sportbetting.domain.outcome.Outcome;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class Result {

    private final SportEvent sportEvent;
    private final List<Outcome> outcomes;

    public Result(final SportEvent sportEvent, final List<Outcome> outcomes) {
        this.sportEvent = sportEvent;
        this.outcomes = outcomes;
    }

    public SportEvent getSportEvent() {
        return sportEvent;
    }

    public List<Outcome> getOutcomes() {
        return outcomes;
    }
}
