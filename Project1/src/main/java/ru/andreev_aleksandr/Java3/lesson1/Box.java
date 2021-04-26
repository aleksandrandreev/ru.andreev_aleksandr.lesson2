package ru.andreev_aleksandr.Java3.lesson1;

import java.util.ArrayList;

public class Box < T extends Fruit> {

    ArrayList <T> fruitNumb;

    public Box(ArrayList<T> fruitNumb) {
        this.fruitNumb = fruitNumb;
    }

    float getWeight (Box <?> box) {
        return fruitNumb.size()*fruitNumb.get(0).getMass();
    }

    boolean compare (Box<? extends Fruit> box){
return (Math.abs(getWeight(this) -getWeight(box)))<0.0001;
    }


}
