package com.example.points;

import com.example.promotion.rules.Rule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Nicholas Drone on 2/18/18.
 */
@Configuration
public class PointsConfiguration
{
    @Bean("pointsRule")
    public Rule pointsRule()
    {
        System.out.println("Adding PointRule to context.");
        return new PointsRule();
    }

}
