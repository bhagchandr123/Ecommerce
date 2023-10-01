package com.example.Ecommerce.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    String landmark;

    String phoneNumber;

    String zipcode;

    String state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
