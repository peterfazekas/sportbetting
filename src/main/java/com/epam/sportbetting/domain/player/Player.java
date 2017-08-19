package com.epam.sportbetting.domain.player;

import com.epam.sportbetting.domain.common.Money;

import java.time.LocalDate;

/**
 * @author Peter_Fazekas on 2017.08.19..
 */
public class Player{

    private final String name;
    private final String accountNumber;
    private final Money money;
    private final LocalDate dateOfBirth;

    public Player(final String name, final String accountNumber, final Money money, final LocalDate dateOfBirth) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Money getMoney() {
        return money;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
