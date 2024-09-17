package designpatterns.creational.builder;

public class PizzaBuilder {

    private String size;

    private boolean extraCheese;
    private boolean pepperoni;
    private boolean extraToppings;

    public PizzaBuilder(String size){
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isExtraToppings() {
        return extraToppings;
    }

    public Pizza build(){
        Pizza pizza = new Pizza(this);
        return pizza;
    }


    public PizzaBuilder withExtraCheese(){
        this.extraCheese=true;
        return this;
    }

    public PizzaBuilder withPepperoni(){
        this.pepperoni=true;
        return this;
    }

    public PizzaBuilder withExtraToppings(){
        this.extraToppings=true;
        return this;
    }




}
