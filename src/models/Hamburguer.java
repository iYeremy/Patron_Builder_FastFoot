package models;

public class Hamburguer {

    // - NON-temporary attributes -
    // Important
    private final String bread; // final = Immutable
    private final String meat;

    // Optional
    private final boolean cheese;
    private final boolean tomato;
    private final boolean ketchup;
    private final boolean lettuce;


    // PRIVATE CONSTRUCTER
    private Hamburguer(Builder builder){
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
        this.ketchup = builder.ketchup;
        this.lettuce = builder.lettuce;
    }

    // GETTERS
    public String getBread() {
    return bread;
    }

    public String getMeat() {
        return meat;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasTomato() {
        return tomato;
    }

    public boolean hasKetchup() {
        return ketchup;
    }

    public boolean hasLettuce() {
        return lettuce;
    }

    // toString to display on console
    @Override
    public String toString() {
        return "Hamburguer {" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese=" + cheese +
                ", tomato=" + tomato +
                ", ketchup=" + ketchup +
                ", lettuce=" + lettuce +
                '}';
    }

    public static class Builder {

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
        this.cheese = true;
        return this; // Return object type Builder [.cheese()]
    }

    public Builder tomato(){
        this.tomato = true;
        return this;
    }

    public Builder ketchup(){
        this.ketchup = true;
        return this;
    }

    public Builder lettuce(){
        this.lettuce = true;
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

}