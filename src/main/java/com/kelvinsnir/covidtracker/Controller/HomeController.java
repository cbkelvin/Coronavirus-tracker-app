package com.kelvinsnir.covidtracker.Controller;

import com.kelvinsnir.covidtracker.models.RegionStats;
import com.kelvinsnir.covidtracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<RegionStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(RegionStats::getCurrentTotalCases).sum();
        int totalNewCases = allStats.stream().mapToInt(RegionStats::getDiffFromPrevDay).sum();
        model.addAttribute("regionStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return  "home";
    }
}
