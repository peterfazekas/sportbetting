package com.epam.sportbetting.service.create;

import com.epam.sportbetting.domain.bet.Bet;
import com.epam.sportbetting.domain.outcome.Outcome;
import com.epam.sportbetting.domain.outcome.OutcomeOdd;
import com.epam.sportbetting.domain.sportevent.FootballSportEvent;
import com.epam.sportbetting.domain.sportevent.SportEvent;
import com.epam.sportbetting.domain.sportevent.TennisSportEvent;
import com.epam.sportbetting.service.create.sportevent.SportEventScenario;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class CreateItem {

    public SportEvent createSportEvent(final SportEventScenario sportEventScenario, final String title, final LocalDateTime startDate, final LocalDateTime endDate) {
        return sportEventScenario.equals(SportEventScenario.FOOTBALL)
                ? new FootballSportEvent(title, startDate, endDate)
                : new TennisSportEvent(title, startDate, endDate);
    }

    public Bet createBet(final SportEvent sportEvent, final String description, final List<Outcome> outcomes) {
        return new Bet(sportEvent, description, outcomes);
    }

    public Outcome createOutCome(final BigDecimal value, final List<OutcomeOdd> outcomeOdds) {
        return new Outcome(value, outcomeOdds);
    }

}
