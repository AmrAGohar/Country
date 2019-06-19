/*
@author: agohar
since : 6/15/2019
*/
package hello.model;

import java.io.Serializable;

public class CountryModel extends BasicModel implements Serializable{
    private String name;
    private String continent;
    private Integer population;
    private Integer life_expectancy;
    private String country_language;

    public CountryModel() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(Integer life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public String getCountry_language() {
        return country_language;
    }

    public void setCountry_language(String country_language) {
        this.country_language = country_language;
    }

}
