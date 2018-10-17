package com.techgaint.dbservice.resource;

import com.techgaint.dbservice.model.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dbservice/quotes/")
public class DBServiceController {

    @GetMapping(value = "/getQuote")
    private String getStockQuote() {
        Quote quote = new Quote(1, "YAHOO");
        return "GOOG";
    }

}
