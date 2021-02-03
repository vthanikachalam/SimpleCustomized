package com.example.demo;

//import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//@ApiModel(description = "Details about the Contact")
public class Contact {

    @ApiModelProperty(notes = "The unique id of the Contact")
    private String id;
    @ApiModelProperty(notes = "Name of the Contact")
    private String name;
    @ApiModelProperty(notes = "Mobile number of the Contact")
    private String mobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
