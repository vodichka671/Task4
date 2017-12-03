package controller;

import model.OwnEnum;

import static controller.Main.Seasons.*;

public class Main {


    public static class Seasons extends OwnEnum {

        protected Seasons(String name) {
            super(name);
        }


        public  static final Seasons AUTUMN = new Seasons("AUTUMN");
        public  static final Seasons WINTER = new Seasons("WINTER");
        public  static final Seasons SPRING = new Seasons("SPRING");
        public  static final Seasons SUMMER = new Seasons("SUMMER");


    }

    public static void main(String[] args) {
        System.out.println(AUTUMN.getValues());
        System.out.println(WINTER.equals(WINTER));
        System.out.println(WINTER.getOrdinal());

    }
}
