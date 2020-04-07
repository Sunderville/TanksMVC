package com.sunderville.tanksmvc.controllers;

import com.sunderville.tanksmvc.models.DetailedInfo;
import com.sunderville.tanksmvc.models.Tank;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormsController {

    private DetailedInfo detailedInfo;

    @GetMapping("/forms")
    public String forms(Model model) {
        model.addAttribute("title", "Расчёт");
        return "forms";
    }

    @PostMapping("/forms")
    public String blogPostAdd(@RequestParam String diameter,
                              @RequestParam String ring1, @RequestParam String ring2, @RequestParam String ring3,
                              @RequestParam String ring4, @RequestParam String ring5, @RequestParam String ring6,
                              @RequestParam String ring7, @RequestParam String ring8,@RequestParam String ring9,
                              @RequestParam String ring10, @RequestParam String ring11, @RequestParam String ring12,
                              @RequestParam String bottomCenter, @RequestParam String bottomRim,
                              @RequestParam String roof,
                              @RequestParam String heater, @RequestParam String insulation,
                              @RequestParam String otherWeight1name, @RequestParam String otherWeight1,
                              @RequestParam String otherWeight2name, @RequestParam String otherWeight2,
                              @RequestParam String st3, @RequestParam String s09g2s, @RequestParam String s12h18n10t,
                              Model model) {
        DetailedInfo detailedInfo = new DetailedInfo(diameter,
                ring1, ring2, ring3, ring4, ring5, ring6, ring7, ring8, ring9, ring10, ring11, ring12,
                bottomCenter, bottomRim, roof, heater, insulation,
                otherWeight1name, otherWeight1, otherWeight2name, otherWeight2, st3, s09g2s, s12h18n10t);
        Tank tank = new Tank(detailedInfo);
        String tankType = tank.defineType();
        Double totalMass = tank.calculate();

        return "";
    }

}
