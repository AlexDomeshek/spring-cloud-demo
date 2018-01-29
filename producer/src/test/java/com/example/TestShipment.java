package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestShipment {

    @Autowired
    ProducerService producerService;

    @Test
    public void testShipment() {
        Item item = new Item("GoPro", "12312313", 500);
        int itemsConsumed = producerService.ship(item);
        assertThat(itemsConsumed).isEqualTo(1);

    }
}