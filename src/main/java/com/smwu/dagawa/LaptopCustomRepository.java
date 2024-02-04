package com.smwu.dagawa;

import java.util.List;

public interface LaptopCustomRepository {
    List<Laptop> findAllByBrand(String brand);
    List<Laptop> findByKeyword(String keyword);
    Laptop findById(long id);
}
