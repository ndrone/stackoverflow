package com.example.promotion.rules;

import com.example.Transaction;

/**
 * @author Nicholas Drone on 2/18/18.
 */
class PromotionRule implements Rule
{
    @Override
    public void invoke(Transaction transaction)
    {
        System.out.println(this.getClass().getCanonicalName() + " invoked");
    }

    @Override
    public Integer getOrder()
    {
        return 1;
    }
}
