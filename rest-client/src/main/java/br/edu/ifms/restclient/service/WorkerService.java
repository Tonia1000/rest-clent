package br.edu.ifms.restclient.service;

@Service
public class WorkerService{

    @Autowired
    private RestTemplate restTemplate;

    public Strind getGreetingDescription(){
        Greeting greeting = restTemplate.getForObject(url: "http://localhost:8080/greeting", Greeting.class);
        return greeting.getDescription();

    }
}