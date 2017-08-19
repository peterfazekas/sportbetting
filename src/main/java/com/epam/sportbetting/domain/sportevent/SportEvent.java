package com.epam.sportbetting.domain.sportevent;

import java.time.LocalDateTime;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public abstract class SportEvent {

    private final String title;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;

    public SportEvent(final String title, final LocalDateTime startDate, final LocalDateTime endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "SportEventScenario[" + "title='" + title + '\'' + ", startDate=" + startDate + ", endDate=" + endDate + "]";
    }
}
