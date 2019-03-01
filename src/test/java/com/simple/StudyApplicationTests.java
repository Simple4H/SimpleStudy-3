package com.simple;

import com.simple.common.RabbitMqSender;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StudyApplicationTests {

    @Autowired
    RabbitMqSender rabbitMqSender;

    @Test
    public void sendLog() {
        rabbitMqSender.send();
    }

    @Test
    public void testHashMap() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 13; i++) {
            hashMap.put(i, i);
        }
        for (Integer key : hashMap.keySet()) {
            log.info("hashMap values is:{}", hashMap.get(key));
        }

    }

}
