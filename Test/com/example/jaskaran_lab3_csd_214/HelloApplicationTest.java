package com.example.jaskaran_lab3_csd_214;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void yearearning() {
        HelloApplication j= new HelloApplication();
        assertEquals(j.yearearning(4000),48000);
    }
}

