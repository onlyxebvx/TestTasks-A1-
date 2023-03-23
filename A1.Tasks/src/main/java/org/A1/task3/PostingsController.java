package org.A1.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/postings")
public class PostingsController {

    @Autowired
    private PostingRepository postingsRepository;

    @GetMapping("/")
    public List<Postings> getPostings(@RequestParam String period, @RequestParam(required = false) Boolean authorizedSupply) {
        Date startDate;
        Date endDate = new Date();
        switch (period) {
            case "day":
                startDate = DateUtils.addDays(endDate, -1);
                break;
            case "month":
                startDate = DateUtils.addMonths(endDate, -1);
                break;
            case "quarter":
                startDate = DateUtils.addMonths(endDate, -3);
                break;
            case "year":
                startDate = DateUtils.addYears(endDate, -1);
                break;
            default:
                throw new IllegalArgumentException("Invalid period: " + period);
        }
        if (authorizedSupply == null) {
            return postingsRepository.findByDocDateBetween(startDate, endDate);
        } else {
            return postingsRepository.findByAuthorizedSupplyAndDocDateBetween(authorizedSupply,startDate, endDate );
        }
    }
}
