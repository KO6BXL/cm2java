package com.ko6bxl.cm2java.block;

public class Preset {
    public Base NOR() {
        Base block = new Base();
        Color color = new Color();

        block.setName("NOR");
        block.setId(0);
        color.setR(255);
        color.setG(9);
        color.setB(0);
        block.setColor(color);
        return block;
    }
    public Base AND() {
        Base block = new Base();
        Color color = new Color();
        block.setName("AND");
        block.setId(1);
        color.setR(0);
        color.setG(121);
        color.setB(255);
        block.setColor(color);
        return block;
    }

    public Base OR() {
        Base block = new Base();
        Color color = new Color();
        block.setName("OR");
        block.setId(2);
        color.setR(0);
        color.setG(241);
        color.setB(29);
        block.setColor(color);

        return block;
    }

    public Base XOR() {
        Base block = new Base();
        Color color = new Color();
        block.setName("XOR");
        block.setId(3);
        color.setR(168);
        color.setG(0);
        color.setB(255);
        block.setColor(color);

        return block;
    }

    public Base BUTTON() {
        Base block = new Base();
        Color color = new Color();
        block.setName("BUTTON");
        block.setId(4);
        color.setR(255);
        color.setG(127);
        color.setB(0);
        block.setColor(color);

        return block;
    }

    public Base FLIPFLOP() {
        Base block = new Base();
        Color color = new Color();
        Integer[] props = new Integer[] {2, 0};
        block.setName("FLIPFLOP");
        block.setId(5);
        color.setR(30);
        color.setG(30);
        color.setB(30);
        block.setColor(color);
        block.setProperties(props);

        return block;
    }

    public Base LED(LedParam params){
        Base block = new Base();
        Integer analogOn = 0;
        block.setName("LED");
        block.setId(6);
        if (params == null) {
            LedParam param = new LedParam();
            Color ledColor = new Color();
            ledColor.setR(175);
            ledColor.setG(175);
            ledColor.setB(175);

            param.setColor(ledColor);
            param.setOpacityOn(100);
            param.setOpacityOff(25);
            param.setAnalog(false);

            block.setColor(ledColor);
        } else {
            block.setColor(params.getColor());
            if (params.getAnalog()) {
                analogOn = 1;
            }
            Integer[] props = new Integer[] {params.getColor().getR(), params.getColor().getG(), params.getColor().getB(),params.getOpacityOn(), params.getOpacityOff(), analogOn};
            block.setProperties(props);
        }
        return block;
    }
    public Base SOUND(Integer freq, Integer instrument) {
        Base block = new Base();
        Color color = new Color();
        Integer[] props = new Integer[] {freq, instrument};
        block.setName("SOUND");
        block.setId(7);
        color.setR(175);
        color.setG(131);
        color.setB(76);
        block.setColor(color);
        block.setProperties(props);

        return block;
    }

    public Base CONDUCTOR() {
        Base block = new Base();
        Color color = new Color();
        block.setName("CONDUCTOR");
        block.setId(8);
        color.setR(73);
        color.setG(185);
        color.setB(255);
        block.setColor(color);

        return block;
    }

    public Base CUSTOM() {
        Base block = new Base();
        Color color = new Color();
        block.setName("CUSTOM");
        block.setId(9);
        color.setR(255);
        color.setG(72);
        color.setB(72);
        block.setColor(color);

        return block;
    }
    public Base NAND() {
        Base block = new Base();
        Color color = new Color();
        block.setName("NAND");
        block.setId(10);
        color.setR(0);
        color.setG(42);
        color.setB(89);
        block.setColor(color);

        return block;
    }
    public Base XNOR() {
        Base block = new Base();
        Color color = new Color();
        block.setName("XNOR");
        block.setId(11);
        color.setR(213);
        color.setG(0);
        color.setB(103);
        block.setColor(color);

        return block;
    }

    public Base RANDOM() {
        Base block = new Base();
        Color color = new Color();
        block.setName("RANDOM");
        block.setId(12);
        color.setR(84);
        color.setG(54);
        color.setB(35);
        block.setColor(color);

        return block;
    }

    public Base TEXT(Integer character) {
        Base block = new Base();
        Color color = new Color();
        Integer[] props = new Integer[] {character};
        block.setName("TEXT");
        block.setId(13);
        color.setR(25);
        color.setG(71);
        color.setB(84);
        block.setColor(color);
        block.setProperties(props);

        return block;
    }

    public Base TILE(Color color, Integer mat) {
        Base block = new Base();
        Integer[] props = new Integer[]{color.getR(), color.getG(), color.getB(), mat};
        block.setName("TILE");
        block.setId(14);
        block.setColor(color);
        block.setProperties(props);

        return block;
    }

    public Base NODE(){
        Base block = new Base();
        Color color = new Color();
        block.setName("NODE");
        block.setId(15);
        color.setR(165);
        color.setG(177);
        color.setB(200);
        block.setColor(color);

        return block;
    }

    public  Base DELAY(Integer ticks) {
        Base block = new Base();
        Color color = new Color();
        Integer[] props = new Integer[] {ticks};
        block.setName("DELAY");
        block.setId(16);
        color.setR(98);
        color.setG(24);
        color.setB(148);
        block.setColor(color);
        block.setProperties(props);

        return block;
    }

    public Base ANTENNA(Integer channel) {
        Base block = new Base();
        Color color = new Color();
        Integer[] props = new Integer[] {channel};
        block.setName("ANTENNA");
        block.setId(17);
        color.setR(235);
        color.setG(233);
        color.setB(183);
        block.setColor(color);
        block.setProperties(props);

        return block;

    }

    public Base CONDUCTORV2() {
        Base block = new Base();
        Color color = new Color();
        block.setName("CONDUCTORV2");
        block.setId(18);
        color.setR(52);
        color.setG(132);
        color.setB(182);
        block.setColor(color);

        return block;
    }
}
