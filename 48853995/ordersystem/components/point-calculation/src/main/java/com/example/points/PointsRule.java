package com.example.points;

import com.example.Transaction;
import com.example.promotion.rules.Rule;

/**
 * @author Nicholas Drone on 2/18/18.
 */
class PointsRule implements Rule
{
    @Override
    public void invoke(Transaction transaction)
    {
        System.out.println(this.getClass().getCanonicalName() + " invoked");
    }

    @Override
    public Integer getOrder()
    {
        return 2;
    }
}
