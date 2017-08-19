package com.epam.sportbetting.service.create;

import com.epam.sportbetting.domain.sportevent.SportEvent;
import com.epam.sportbetting.service.create.sportevent.SportEventScenario;

import java.time.LocalDateTime;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class Initiate {

    private CreateItem createItem;

    public Initiate() {
        createItem = new CreateItem();
    }

    public void init() {
        SportEvent fotballEvent = createItem.createSportEvent(
                SportEventScenario.FOOTBALL,"Southampton v Bournemoth",
                LocalDateTime.of(2016, 10, 27, 19, 0, 0),
                LocalDateTime.of(2016, 10, 27, 21, 0, 0));
        SportEvent tennisEvent = createItem.createSportEvent(
                SportEventScenario.TENNIS,"Rafael Nadal vs. Alexander Zverev, Indian Wells 4th Round",
                LocalDateTime.of(2016, 8, 10, 19, 0, 0),
                LocalDateTime.of(2016, 8, 10, 22, 0, 0));
    }
}
