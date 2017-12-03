package model;

import java.util.ArrayList;

public  class OwnEnum implements Comparable {



    private final String name;
    private final int ordinal;
    public  static int amount = 0;

    private static final ArrayList<OwnEnum> values = new ArrayList<>();

    public final ArrayList<OwnEnum> getValues (){
        return values;
    }

    public final String getName() {
        return name;
    }

    public final int getOrdinal() {
        return ordinal;
    }


    protected OwnEnum(String name) {
        this.name = name;
        values.add(this);
        ordinal = amount++;
    }



    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        OwnEnum own = (OwnEnum) o;
        if(this.getClass()!=o.getClass()) throw new ClassCastException();
        else {
            return this.getName().compareTo((own.getName()));
        }
    }

    @Override
     public boolean equals(Object o) {
            if(this==o) {
                OwnEnum own = (OwnEnum)o;
                return (own.getName()==this.getName());
            }
            else if (o==null||!(o instanceof OwnEnum)){
                return false;
            }

         return false;
     }

    }





