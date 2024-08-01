package com.airtel.accounts.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity {

    @Id //to annotate primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //to auto generate primary key acc to database in backend
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number") //it will work fine if we don't write this as the name is same.It is just for reference.
    private String mobileNumber;

}
