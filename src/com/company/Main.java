package com.company;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.bloom();
        System.out.println(tree.getFoliage().size());
        System.out.println(tree.getFoliage().get(0).getColorOfLeaf());
        System.out.println(tree.getFoliage().get(99).getColorOfLeaf());
        tree.makeLeafsYellow();
        System.out.println(tree.getFoliage().get(0).getColorOfLeaf());
        System.out.println(tree.getFoliage().get(99).getColorOfLeaf());
        tree.makeLeafsFall();
        System.out.println(tree.getFoliage().size());
    }
}
