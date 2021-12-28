package com.example.demo;

import com.example.demo.pojo.FruitProperty;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PropertyTests {

    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void test() {
        List<Map> fruitData = fruitProperty.getList();

        assertThat(fruitData.get(0).get("name")).isEqualTo("banana");
        assertThat(fruitData.get(0).get("color")).isEqualTo("yellow");

        assertThat(fruitData.get(1).get("name")).isEqualTo("apple");
        assertThat(fruitData.get(1).get("color")).isEqualTo("red");

        assertThat(fruitData.get(2).get("name")).isEqualTo("water melon");
        assertThat(fruitData.get(2).get("color")).isEqualTo("green");
    }
}
