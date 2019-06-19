/*
@author: agohar
since : 6/15/2019
*/
package hello.service;

import hello.model.CountryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CountryService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public CountryModel getData(String countryCode) {
        try {
            Map<String, Object> result =
                    jdbcTemplate.queryForMap(CommonConstants.getCountryByCodeQuery, countryCode, countryCode);
            return buildCountryModelFromMap(result);
        } catch (EmptyResultDataAccessException e) {
            return prepareErrorModel(CommonConstants.ERROR_INVALID_COUNTRY_CODE);
        } catch (Exception e) {
            return prepareErrorModel(CommonConstants.INTERNAL_ERROR);
        }
    }

    private CountryModel prepareErrorModel(String message) {
        CountryModel countryModel = new CountryModel();
        countryModel.setReplyMessage(message);
        countryModel.setReplyCode(CommonConstants.ERROR_CODE_INTERNAL_ERROR);
        return countryModel;
    }

    private CountryModel buildCountryModelFromMap(Map<String, Object> result) {
        CountryModel model = new CountryModel();
        model.setName(String.valueOf(result.get("name")));
        model.setCountry_language(String.valueOf(result.get("language")));
        model.setContinent(String.valueOf(result.get("continent")));
        model.setLife_expectancy(Math.round((Float) result.get("life_expectancy")));
        model.setPopulation((Integer) (result.get("population")));
        return model;
    }
}
