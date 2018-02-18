package com.example.app;

import com.example.promotion.service.PromotionService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nicholas Drone on 2/18/18.
 */
@RestController
class SomeController
{
    private final PromotionService promotionService;

    public SomeController(PromotionService promotionService)
    {
        this.promotionService = promotionService;
    }
}
