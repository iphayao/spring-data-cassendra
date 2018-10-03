package com.iphayao.demo.customer;

import com.datastax.driver.core.utils.UUIDs;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Table
public class Customer {
    @PrimaryKey
    private UUID id;

    public Customer() {
        this.id = UUIDs.timeBased();
    }

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Integer age;
    @NotNull
    private String email;
}
