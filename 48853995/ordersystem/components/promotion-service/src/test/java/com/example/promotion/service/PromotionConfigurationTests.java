package com.example.promotion.service;

import com.example.points.PointsConfiguration;
import com.example.promotion.rules.RulesConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Nicholas Drone on 2/18/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {
        RulesConfiguration.class,
        PointsConfiguration.class, PromotionConfiguration.class,})
public class PromotionConfigurationTests
{
    @Test
    public void contextLoad()
    {

    }
}
