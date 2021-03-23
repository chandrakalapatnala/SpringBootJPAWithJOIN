package com.springjpa.springbootonetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int cid;

    private String firstName;

    private String lastName;


    private String emailId;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn (name = "cid_fk" , referencedColumnName = "cid")
    private List<Product> products;
}
