package builder;

import product.Hamburguer

public class Builder {

    // Important
    private String bread;
    private String meat;

    // Optional
    private boolean cheese;
    private boolean tomato;
    private boolean ketchup;
    private boolean lettuce;

    // CONFIG BUILDER

    // Constructer
    public Builder(String bread, String meat){
        this.bread = bread;
        this.meat = meat;
    }


    public Builder cheese(){
        this.cheese = cheese;
        return this; // Return object type Builder [.cheese()]
    }

    public Builder tomato(){
        this.tomato = tomato;
        return this;
    }

    public Builder ketchup(){
        this.ketchup = ketchup;
        return this;
    }

    public Builder lettuce(){
        this.lettuce = lettuce;
        return this;
    }
    
    /*
    First, the builder is configured. 
    Then, the final object is created using .build().
    */
    public Hamburguer build(){
        return new Hamburguer(this);
    }
}