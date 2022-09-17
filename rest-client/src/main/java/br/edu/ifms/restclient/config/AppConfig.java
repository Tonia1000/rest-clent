package br.edu.ifms.restclient.config;

@Configuration
public class AppConfig{

    @Bean
    public RestTemplate restTemplate(){
        return new restTemplate;

    }
    
}