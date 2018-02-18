package com.example.promotion.rules;

import com.example.Transaction;

/**
 * @author Nicholas Drone on 2/18/18.
 */
public interface Rule
{
    void invoke(Transaction transaction);

    Integer getOrder();
}
