package com.ko6bxl.cm2java.block;

public class LedParam {
    private Color color;
    private Integer opacityOn;
    private Integer opacityOff;
    private Boolean analog;

    public Boolean getAnalog() {
        return analog;
    }

    public void setAnalog(Boolean analog) {
        this.analog = analog;
    }

    public Integer getOpacityOff() {
        return opacityOff;
    }

    public void setOpacityOff(Integer opacityOff) {
        this.opacityOff = opacityOff;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getOpacityOn() {
        return opacityOn;
    }

    public void setOpacityOn(Integer opacityOn) {
        this.opacityOn = opacityOn;
    }
}
