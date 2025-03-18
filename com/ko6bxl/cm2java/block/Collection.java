package com.ko6bxl.cm2java.block;

import java.util.Arrays;

public class Collection {
    private Base[] blocks;
    private Connection[] connections = new Connection[] {};
    private Offset Position;

    public Base[] getBlocks() {
        return blocks;
    }

    public Connection[] getConnections() {
        return connections;
    }

    public Offset getPosition() {
        return Position;
    }

    public Base Append(Base block) {
        try {
            this.blocks = Arrays.copyOf(this.blocks, this.blocks.length + 1);
            this.blocks[this.blocks.length - 1] = block;
            return block;
        } catch (Exception e) {
            this.blocks = new Base[] {};
            this.blocks = Arrays.copyOf(this.blocks, 1);
            this.blocks[0] = block;
            return block;
        }

    }

    public void Connect(Base from, Base to) {
        Connection connection = new Connection();
        connection.setFrom(from);
        connection.setTo(to);

        this.connections = Arrays.copyOf(this.connections, this.connections.length+1);
        this.connections[this.connections.length-1] = connection;
    }

    public void Merge(Collection with) {
        Base base = new Base();
        Base[] newBase = new Base[this.blocks.length+with.blocks.length];
        Connection[] newConnection = new Connection[this.connections.length + with.connections.length];
        Integer mostX = 0;
        Integer mostY = 0;
        Integer mostZ = 0;
        for (Base block : this.getBlocks()) {
            int x = (int) Math.ceil(block.getOffset().getX());
            if (x > mostX) {
                mostX = x;
            }
        }
        for (Base block : this.getBlocks()) {
            int y = (int) Math.ceil(block.getOffset().getY());
            if (y > mostY) {
                mostY = y;
            }
        }
        for (Base block : this.getBlocks()) {
            int z = (int) Math.ceil(block.getOffset().getZ());
            if (z > mostZ) {
                mostZ = z;
            }
        }

        for (Base block : with.getBlocks()) {
            Float mostFloatX = (float) mostX;
            Float mostFloatY = (float) mostY;
            Float mostFloatZ = (float) mostZ;
            block.getOffset().setX(block.getOffset().getX()+mostFloatX);
            block.getOffset().setY(block.getOffset().getY()+mostFloatY);
            block.getOffset().setZ(block.getOffset().getZ()+mostFloatZ);
        }
        System.arraycopy(this.blocks, 0, newBase,0, this.blocks.length);
        System.arraycopy(with.blocks, 0, newBase, this.blocks.length, with.blocks.length);
        this.blocks = newBase;

        System.arraycopy(this.connections, 0, newConnection, 0 , this.connections.length);
        System.arraycopy(with.connections, 0 , newConnection, this.connections.length, with.connections.length);
        this.connections = newConnection;
    }
}
