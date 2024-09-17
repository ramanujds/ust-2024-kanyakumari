package designpatterns.creational.builder;

import java.util.StringJoiner;

public class Pizza {

    private String size;
    private boolean extraCheese;
    private boolean pepperoni;
    private boolean extraToppings;

    public Pizza(PizzaBuilder pizzaBuilder){
        this.size=pizzaBuilder.getSize();
        this.extraToppings=pizzaBuilder.isExtraToppings();
        this.pepperoni= pizzaBuilder.isPepperoni();
        this.extraCheese= pizzaBuilder.isExtraCheese();
    }



    @Override
    public String toString() {
        return new StringJoiner(", ", Pizza.class.getSimpleName() + "[", "]")
                .add("size='" + size + "'")
                .add("extraCheese=" + extraCheese)
                .add("pepperoni=" + pepperoni)
                .add("extraToppings=" + extraToppings)
                .toString();
    }
}
