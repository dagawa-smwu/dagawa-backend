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

    @Column(name = "brand")
    private String brand;

    @Column(name = "name")
    private String name;

    @Column(name = "cpu")
    private String cpu;

    @Column(name = "size_inch")
    private float size;

    @Column(name = "ram_gb")
    private int ram;

    @Column(name = "ssd_gb")
    private int ssd;

    @Column(name = "weight_kg")
    private float weight;

    private String price;

    private String gpu;

    private String url;




}
