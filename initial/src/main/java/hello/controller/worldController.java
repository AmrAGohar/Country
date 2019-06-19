/*
@author: agohar
since : 6/15/2019
*/
package hello.controller;


import hello.model.CountryModel;
import hello.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class worldController {

    @Autowired
    CountryService countryService;

    @RequestMapping(value = "/{countryCode}", method = RequestMethod.GET)
    public ResponseEntity<CountryModel> home(@PathVariable("countryCode") String countryCode) {
        CountryModel result = countryService.getData(countryCode);
        return ResponseEntity.status(result.getReplyCode()).body(result);
    }
}
