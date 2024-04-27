package com.example.demo.controller;
import com.example.demo.entity.Saludo;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.QueryParam;

@RestController
public class GreetingController {
   private static final String template = "Hello , %s";
   private final AtomicLong counter = new AtomicLong();
   
  
@CrossOrigin(origins="http://localhost:4200")   
@GetMapping("/saludo")   
   public String holaMundo(@QueryParam("latitudeOrigen") double latitudeOrigen,
                           @QueryParam("latitudeDestino") double latitudeDestino,
                           @QueryParam("longitudOrigen") double longitudOrigen,
                           @QueryParam("longitudDestino") double longitudDestino){
       System.println.out(latitudeOrigen,latitudeDestino,longitudOrigen,longitudDestino)
       String url = "https://api.openchargemap.io/v3/poi/?client=ocm.app.ionic.8.6.1&verbose=false&output=json&includecomments=true&maxresults=40&compact=true&boundingbox=(52.3696,4.8848),(52.3098,5.0396)&key=53f3079e-75c6-40eb-bc30-8b8792c9602f";
        WebClient.Builder builder = WebClient.builder();
        String catFact = builder.build().get().uri(url)
                .retrieve().bodyToMono(String.class)
                .block();
        
        return  catFact;
        
    }
}
