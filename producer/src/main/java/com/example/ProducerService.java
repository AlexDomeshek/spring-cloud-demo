package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProducerService {
    @Value("${consumer.resource}")
    private String consumerResource;
    @Autowired
    private RestTemplate restTemplate;

    public int ship(Item... items) {
        Shipment shipment = new Shipment();
        for (Item item : items) {
            shipment.add(item);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Shipment> request = new HttpEntity<Shipment>(shipment, headers);
        ResponseEntity<Integer> response = restTemplate.postForEntity(consumerResource, request, Integer.class);
        return response.getBody();
    }
}
