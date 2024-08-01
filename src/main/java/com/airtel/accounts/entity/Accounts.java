package com.airtel.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity {

    private Long customerId;

    @Id
    @Column(name = "account_number") //just for reference as it is not necessary.
    private Long accountNumber;

    private String accountType;

    private String branchAddress;

}
