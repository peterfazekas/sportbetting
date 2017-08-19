package com.epam.sportbetting.domain.wager;

import com.epam.sportbetting.domain.common.Money;
import com.epam.sportbetting.domain.outcome.OutcomeOdd;
import com.epam.sportbetting.domain.player.Player;

import java.time.LocalDateTime;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class Wager {

    private final Player player;
    private final OutcomeOdd outcomeOdd;
    private final Money money;
    private final LocalDateTime timeStamp;
    private boolean processed;
    private boolean win;

    public Wager(final Player player, final OutcomeOdd outcomeOdd, final Money money, final LocalDateTime timeStamp) {
        this.player = player;
        this.outcomeOdd = outcomeOdd;
        this.money = money;
        this.timeStamp = timeStamp;
        processed = false;
        win = false;
    }

    public Player getPlayer() {
        return player;
    }

    public OutcomeOdd getOutcomeOdd() {
        return outcomeOdd;
    }

    public Money getMoney() {
        return money;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public boolean isProcessed() {
        return processed;
    }

    public boolean isWin() {
        return win;
    }

    public void setProcessed(final boolean processed) {
        this.processed = processed;
    }

    public void setWin(final boolean win) {
        this.win = win;
    }
}
