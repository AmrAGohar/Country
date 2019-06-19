/*
@author: agohar
since : 6/17/2019
*/
package hello.service;

public class CommonConstants {
    public static final String getCountryByCodeQuery="select c.\"name\", c.continent,c.population,c.life_expectancy, l.language from country c left join country_language l on c.code=l.country_code where c.code=? and l.is_official = true and l.percentage IN (select max(percentage) from country_language where country_code = ? group by country_code) ";

    public static final String INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final Integer ERROR_CODE_INTERNAL_ERROR = 500;
    public static final String ERROR_INVALID_COUNTRY_CODE = "ERROR_INVALID_COUNTRY_CODE";
}
