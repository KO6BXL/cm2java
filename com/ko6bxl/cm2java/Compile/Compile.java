package com.ko6bxl.cm2java.Compile;

import com.ko6bxl.cm2java.block.Base;
import com.ko6bxl.cm2java.block.Collection;
import com.ko6bxl.cm2java.block.Connection;

import java.util.HashMap;
import java.util.Map;
import java.lang.StringBuilder;

public class Compile {
    private void writeBlockString(Base block, StringBuilder strbuild) {
        strbuild.append(block.getId());
        strbuild.append(',');
        if (block.getState()) {
            strbuild.append('1');
        }
        strbuild.append(',');
        if (Math.ceil(block.getOffset().getX()) == Math.floor(block.getOffset().getX())){
            strbuild.append((int) Math.ceil(block.getOffset().getX()));
        } else {
            strbuild.append(block.getOffset().getX());
        }
        strbuild.append(',');
        if (Math.ceil(block.getOffset().getY()) == Math.floor(block.getOffset().getY())){
            strbuild.append((int) Math.ceil(block.getOffset().getY()));
        } else {
            strbuild.append(block.getOffset().getY());
        }
        strbuild.append(',');
        if (Math.ceil(block.getOffset().getZ()) == Math.floor(block.getOffset().getZ())){
            strbuild.append((int) Math.ceil(block.getOffset().getZ()));
        } else {
            strbuild.append(block.getOffset().getZ());
        }
        strbuild.append(',');

        int propsLength = block.getProperties().length;

        for (int i = 0; i < propsLength; i++) {
            strbuild.append(block.getProperties()[i]);

            if (i != propsLength-1) {
                strbuild.append('+');
            }
        }
    }

    public String CompileCollection(Collection collection){
        StringBuilder strBuild = new StringBuilder();
        Base[] blocks = collection.getBlocks();
        Connection[] connections = collection.getConnections();
        int blockLen = collection.getBlocks().length;
        Map<Base, Integer> blockIndex = new HashMap<>();
        for (int i = 0; i < blockLen; i++){
            blockIndex.put(blocks[i], i+1);
            writeBlockString(blocks[i], strBuild);

            if (i != blockLen-1) {
                strBuild.append(';');
            }
        }
        strBuild.append('?');
        int connectLen = collection.getConnections().length;
        for (int i = 0; i < connectLen; i++){
            Integer from = blockIndex.get(connections[i].getFrom());
            Integer to = blockIndex.get(connections[i].getTo());

            strBuild.append(from);
            strBuild.append(',');
            strBuild.append(to);
            if (i != connectLen-1){
                strBuild.append(';');
            }
        }
        strBuild.append("??");

        return strBuild.toString();
    }
}
