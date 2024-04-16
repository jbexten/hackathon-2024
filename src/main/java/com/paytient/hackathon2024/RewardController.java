package com.paytient.hackathon2024;

import org.springframework.stereotype.Controller;

@Controller
public class RewardController {

    public RewardData getStepReward(){
        return new RewardData(RewardTier.GOLD);
    }
}
