package com.example.promotion.rules;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Nicholas Drone on 2/18/18.
 */
@Configuration
public class RulesConfiguration
{
    @Bean("promoRule")
    public Rule promotionRule()
    {
        System.out.println("Adding PromotionRule to context.");
        return new PromotionRule();
    }
}
