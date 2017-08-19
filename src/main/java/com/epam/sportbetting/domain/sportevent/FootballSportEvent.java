package com.epam.sportbetting.domain.sportevent;

import java.time.LocalDateTime;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class FootballSportEvent extends SportEvent {

    public FootballSportEvent(final String title, final LocalDateTime startDate, final LocalDateTime endDate) {
        super(title, startDate, endDate);
    }
}
