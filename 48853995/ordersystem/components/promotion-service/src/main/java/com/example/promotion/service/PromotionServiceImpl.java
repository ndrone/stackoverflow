package com.example.promotion.service;

import com.example.Transaction;
import com.example.promotion.rules.Rule;

import java.util.List;

/**
 * @author Nicholas Drone on 2/18/18.
 */
class PromotionServiceImpl implements PromotionService
{
    private final List<Rule> rules;

    PromotionServiceImpl(List<Rule> rules)
    {
        this.rules = rules;
    }

    @Override
    public void applyPromotions()
    {
        Transaction transaction = new Transaction();
        rules.forEach(rule -> rule.invoke(transaction));
    }
}
