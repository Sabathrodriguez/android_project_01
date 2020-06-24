package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
   static List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("jack amber");
            brands.add("red moose");
        } else {
            brands.add("jail pale ale");
            brands.add("gout stout");
        }
        return brands;
    }
}
