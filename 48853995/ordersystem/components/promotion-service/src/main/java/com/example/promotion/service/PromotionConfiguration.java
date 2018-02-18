package com.example.promotion.service;

import com.example.points.PointsConfiguration;
import com.example.promotion.rules.Rule;
import com.example.promotion.rules.RulesConfiguration;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Comparator;
import java.util.List;

/**
 * @author Nicholas Drone on 2/18/18.
 */
@Configuration
@AutoConfigureAfter({RulesConfiguration.class, PointsConfiguration.class})
public class PromotionConfiguration
{
    @Bean
    public PromotionService promotionService(ObjectProvider<List<Rule>> rules)
    {
        System.out.println("Adding PromotionService to context");
        List<Rule> ruleList = rules.getIfAvailable();
        if (!ruleList.isEmpty())
        {
            ruleList.sort(Comparator.comparingInt(Rule::getOrder));
        }
        return new PromotionServiceImpl(ruleList);
    }
}
