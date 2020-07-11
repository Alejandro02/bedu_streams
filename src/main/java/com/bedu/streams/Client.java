package com.bedu.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private String name;
    private int age;
    private String phoneNumber;
    private Gender gender;
    private Address billingAddress;

}
