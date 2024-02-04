package com.smwu.dagawa;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "laptops")
@Getter
public class Laptop implements Item {

    @Id
    @Field(value = "laptop_id, targetType = FieldType.OBJECT_ID")
    private Long id;

    @Field("brand")
    private String brand;

    @Field("name")
    private String name;

    @Field("cpu")
    private String cpu;

    @Field("size_inch")
    private float size;

    @Field("ram_gb")
    private int ram;

    @Field("ssd_gb")
    private int ssd;

    @Field("weight_kg")
    private float weight;

    @Field("price")
    private String price;

    @Field("gpu")
    private String gpu;

    @Field("url")
    private String url;

    @Field("imge_url")
    private String imgUrl;




}
