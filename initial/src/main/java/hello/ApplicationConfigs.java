/*
@author: agohar
since : 6/19/2019
*/
package hello;

import hello.model.CountryModel;
import hello.service.CommonConstants;
import hello.service.CountryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationConfigs {

    @Autowired
    CountryService countryService;

//    @Test
//    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
//        CountryModel countryModel = new CountryModel();
//        Mockito.when(countryService.getData("BHR")).thenReturn(new);
//        Assert.assertNotEquals(countryModel.getReplyMessage(), "INVALID_COUNTRY_CODE");
//    }

    @Test
    public void getHello(String countryCode) throws Exception {

        CountryModel countryModel = countryService.getData(countryCode);
        assertEquals(CommonConstants.ERROR_INVALID_COUNTRY_CODE, countryModel.getReplyMessage());

    }
}

