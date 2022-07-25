package com.example.IdeaBackend;
import com.example.IdeaBackend.entity.Room;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RoomControllerTest {

    @LocalServerPort
    int randomServerPort;

    private final RestTemplate REST_TEMPLATE = new RestTemplate();


    @Test
     public void RoomTest() throws URISyntaxException{


        final String baseUrl = "http://localhost:" + randomServerPort + "/api/room/";
        URI uri = new URI(baseUrl);
        Room employee = new Room("Biologiya");

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RAM-PERSIST", "true");

        HttpEntity<Room> httpEntity = new HttpEntity<>(employee, headers);

        ResponseEntity<String> responseEntity = this.REST_TEMPLATE.postForEntity(uri, httpEntity,
                String.class);

        // Verify request succeed
        Assert.assertEquals(201, responseEntity.getStatusCodeValue());

    }


    @Test
    public void testGetRoom() throws URISyntaxException
    {
        final String baseUrl = "http://localhost:" + randomServerPort + "/api/room/";
        URI uri = new URI(baseUrl);

        ResponseEntity<Room> responseEntity = this.REST_TEMPLATE.getForEntity(uri,Room.class);

        Room room = responseEntity.getBody();
        System.out.println("room = " +  room);

        // Verify request succeed
        Assert.assertEquals(200, responseEntity.getStatusCodeValue());
    }
















}
