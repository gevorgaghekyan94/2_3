package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Tree {

    private int height;
    private ArrayList<Leaf> foliage;

    public Tree() {
    }

    public Tree(int height, ArrayList<Leaf> foliage) {
        this.height = height;
        this.foliage = foliage;
    }

    public void bloom() {
        this.foliage = new ArrayList<Leaf>();
        for (int i = 0; i < 100; i++) {
            Leaf leaf = new Leaf(Color.GREEN);
            this.foliage.add(leaf);
        }
    }

    public void makeLeafsYellow() {
        for (int i = 0; i < this.foliage.size(); i++) {
            this.foliage.get(i).setColorOfLeaf(Color.YELLOW);
        }
    }

    public void makeLeafsFall() {
        for (int i = 0; i < this.foliage.size(); i++) {
            this.foliage.clear();
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ArrayList<Leaf> getFoliage() {
        return foliage;
    }

    public void setFoliage(ArrayList<Leaf> foliage) {
        this.foliage = foliage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return height == tree.height &&
                Objects.equals(foliage, tree.foliage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, foliage);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", foliage=" + foliage +
                '}';
    }
}
