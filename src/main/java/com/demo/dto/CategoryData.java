package com.demo.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryData {

    @NotEmpty(message = "Name is required")
    private String name;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
