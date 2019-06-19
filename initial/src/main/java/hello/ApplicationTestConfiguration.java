/*
@author: agohar
since : 6/19/2019
*/
package hello;

import hello.service.CountryService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class ApplicationTestConfiguration {

    @Bean
    @Primary
    public CountryService productService() {
        return Mockito.mock(CountryService.class);
    }
}
