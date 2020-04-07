package com.sunderville.tanksmvc.controllers;

import com.sunderville.tanksmvc.models.DetailedInfo;
import com.sunderville.tanksmvc.models.TankEntry;
import com.sunderville.tanksmvc.repo.TankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class CreateLogController {

    @Autowired
    private TankRepository tankRepository;

    @GetMapping("/createlog")
    public String createlog(Model model) {
        Iterable<TankEntry> tankEntries = tankRepository.findAll();
        model.addAttribute("tankEntries", tankEntries);
        model.addAttribute("title", "Создание отчёта");
        return "createlog";
    }

    @PostMapping("/createlog")
    public String createNewEntry(@RequestParam String company, @RequestParam String tankType, @RequestParam DetailedInfo detailedInfo, Model model) {
//        TankEntry tankEntry = new TankEntry(LocalDateTime.now(), company, tankType, detailedInfo);

//        тестовые данные (заглушка)
        detailedInfo = new DetailedInfo("10430", "6", "6", "6", "6", "5", "5", "5", "5", "", "", "", "",
                "4", "8", "6", "1", "2", "внутр. трубопровод", "3", "молниеприёмники", "4", "Ст3", "", "");
        company = "Рога&Копыта";
        tankType = "~РВС-1000";


        TankEntry tankEntry = new TankEntry(LocalDateTime.now(), company, tankType/*, detailedInfo*/);
        tankRepository.save(tankEntry);
        return "";
    }

}
