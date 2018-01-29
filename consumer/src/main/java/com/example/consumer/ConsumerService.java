package com.example.consumer;

import com.example.Shipment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerService {

    @RequestMapping(value = "/ship",
            method = RequestMethod.POST,
            consumes = "application/json")
    public int handleShipment(@RequestBody Shipment shipment) {
        // acknowledge by returning the order size
        return shipment.getItems().size();
    }
}
