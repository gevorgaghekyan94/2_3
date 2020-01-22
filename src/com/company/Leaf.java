package com.company;

import java.util.Objects;

public class Leaf {

    private Color colorOfLeaf;

    public Leaf() {
    }

    public Leaf(Color colorOfLeaf) {
        this.colorOfLeaf = colorOfLeaf;
    }

    public Color getColorOfLeaf() {
        return colorOfLeaf;
    }

    public void setColorOfLeaf(Color colorOfLeaf) {
        this.colorOfLeaf = colorOfLeaf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf = (Leaf) o;
        return colorOfLeaf == leaf.colorOfLeaf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorOfLeaf);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "colorOfLeaf=" + colorOfLeaf +
                '}';
    }
}
