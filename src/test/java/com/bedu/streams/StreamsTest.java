package com.bedu.streams;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamsTest {

    private static ObjectMapper mapper = new ObjectMapper();
    private static List<Client> clients;

    @BeforeAll
    public static void load() throws Exception{
        clients = mapper.readValue(
                Paths.get(StreamsTest.class.getClassLoader().getResource("clients.json").toURI()).toFile(),
                new TypeReference<List<Client>>() {});
    }

    @Test
    public void countingFemalesAndMales(){
        int males = 0;
        int females = 0;
        // TODO: compute the right value of males and females using streams

        assertThat(males).isEqualTo(3);
        assertThat(females).isEqualTo(2);
    }

    @Test
    public void averageAgeByGender(){
        Double maleAvgAge= 0.0;
        Double femaleAvgAge = 0.0;
        // TODO: compute the right value of males and females using streams

        assertThat(maleAvgAge).isEqualTo(3);
        assertThat(femaleAvgAge).isEqualTo(2);
    }

    @Test
    public void numberOfMexicans(){
        int mexicans = 0;
        // TODO: compute the right value of males and females using streams

        assertThat(mexicans).isEqualTo(3);
    }

    @Test
    public void numberOfFemalesInSpainBelow25YearsOld(){
        int result = 0;
        // TODO: compute the right value of males and females using streams

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void filterOutInvalidRecords(){
        // TODO: A record is valid if all fields are valid.
        // TODO: Phone number must be 10 digits only
        // TODO: A country code should be ISO 3166. You can check all valid country codes in
        //      TODO: https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html#getISOCountries--


    }

    @Test
    public void averageAgeByCountry(){
        /**
         * BONUS!
         * Compute the average age by country
         *
         */
        int males = 0;
        int females = 0;
        // TODO: compute the right value of males and females using streams

        assertThat(males).isEqualTo(3);
        assertThat(females).isEqualTo(2);
    }
}
