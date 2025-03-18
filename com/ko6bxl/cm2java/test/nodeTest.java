package com.ko6bxl.cm2java.test;

import com.ko6bxl.cm2java.Compile.Compile;
import com.ko6bxl.cm2java.block.*;

public class nodeTest {
    public static void main(String[] args) {
        Collection test = new Collection();
        Preset preset = new Preset();
        Offset nodeOff = new Offset();
        Offset nodeOff2 = new Offset();
        Compile compile = new Compile();
        Base node = test.Append(preset.NODE());

        nodeOff.setX(0f);
        nodeOff.setY(0f);
        nodeOff.setZ(0f);

        node.setOffset(nodeOff);
        Base node2 = test.Append(preset.NODE());
        nodeOff2.setX(1f);
        node2.setOffset(nodeOff2);

        test.Connect(node, node2);
        String str = compile.CompileCollection(test);

        System.out.println(str);
    }
}
