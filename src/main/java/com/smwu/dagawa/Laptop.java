package com.smwu.dagawa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Laptop implements Item {

    @Id @GeneratedValue
    @Column(name = "laptop_id")
    private Long id;

    private String name;


}
