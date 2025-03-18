package com.ko6bxl.cm2java.block;

public class Base {
    private String name = "";
    private Integer id = 0;
    private Integer[] properties = new Integer[] {};
    private Color color = new Color();
    private Offset offset = new Offset();
    private Boolean state = false;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Offset getOffset() {
        return offset;
    }

    public void setOffset(Offset offset) {
        this.offset = offset;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer[] getProperties() {
        return properties;
    }

    public void setProperties(Integer[] properties) {
        this.properties = properties;
    }

}
