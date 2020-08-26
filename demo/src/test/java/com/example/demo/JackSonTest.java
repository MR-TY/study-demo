package com.example.demo;

import com.example.demo.dto.JsonDto;
import com.example.demo.dto.JsonRootBeanDto;
import com.example.demo.dto.StormOrderMatchingJsonDto;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author tangyu
 * @date 2020-07-28 11:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JackSonTest {

    @Test
    public void testToObject() {
        JsonFactory jsonFactory = new JsonFactory();
        JsonGenerator jsonGenerator = null;
        try {
            File file = new File("D:\\json.txt");
            jsonGenerator = jsonFactory.createGenerator(file, JsonEncoding.UTF8);
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("shuaige", "很帅");
            jsonGenerator.writeFieldName("tangyu");
            jsonGenerator.writeStartObject();
            jsonGenerator.writeNumberField("age", 18);
            jsonGenerator.writeNumberField("height", 180);
            jsonGenerator.writeEndObject();
            jsonGenerator.writeEndObject();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                jsonGenerator.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testToObjectList() {
        JsonFactory jsonFactory = new JsonFactory();
        JsonGenerator jsonGenerator = null;
        try {
            File file = new File("D:\\json.txt");
            jsonGenerator = jsonFactory.createGenerator(file, JsonEncoding.UTF8);
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("shuaige", "很帅");
            jsonGenerator.writeFieldName("tangyu");
            jsonGenerator.writeStartArray();
            for (int i = 5; i > 1; i--) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeNumberField("age", 18);
                jsonGenerator.writeNumberField("height", 180);
                jsonGenerator.writeEndObject();
            }
            jsonGenerator.writeEndArray();
            jsonGenerator.writeEndObject();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                jsonGenerator.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        //List<Map<String, String>> list = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("a1", "c");
        //list.add(map);
        try {
            String s = objectMapper.writeValueAsString(map);
            System.out.printf(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        ObjectMapper objectMapper = new ObjectMapper();
        StormOrderMatchingJsonDto dto = new StormOrderMatchingJsonDto();
        dto.setBlNo("123");
        dto.setErChehngBlNo("5454");
        StormOrderMatchingJsonDto dto2 = new StormOrderMatchingJsonDto();
        dto2.setBlNo("1234");
        dto2.setErChehngBlNo("8787");
        List<StormOrderMatchingJsonDto> stormOrderMatchingDtoList = Arrays.asList(dto, dto2);
        Map<String, List<StormOrderMatchingJsonDto>> map = new HashMap<>();
        map.put("json1", stormOrderMatchingDtoList);
        try {
            String s = objectMapper.writeValueAsString(map);
            System.out.printf(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() {
        String json = "{\"companyId\":\"123\",\"operationType\":\"5454\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonDto dto = objectMapper.readValue(json, JsonDto.class);
            System.out.printf("success");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
