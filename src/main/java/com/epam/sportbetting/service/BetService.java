package com.epam.sportbetting.service;

import com.epam.sportbetting.domain.bet.Bet;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class BetService {

    private final List<Bet> bets;

    public BetService(final List<Bet> bets) {
        this.bets = bets;
    }
}
