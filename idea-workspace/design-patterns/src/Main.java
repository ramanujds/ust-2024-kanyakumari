import designpatterns.creational.builder.Pizza;
import designpatterns.creational.builder.PizzaBuilder;
import designpatterns.creational.singleton.PlayService;
import designpatterns.structural.adapter.IPhone;
import designpatterns.structural.adapter.TypeCToLightningAdapter;
import interfacesegregation.BasicHPPrinter;
import interfacesegregation.HPPrinter;
import interfacesegregation.Printer;
import liskovsubstitution.AdvancedCalculator;
import liskovsubstitution.BasicCalculator;
import liskovsubstitution.Calculator;
import opencloseprinciple.Phone;

public class Main {
    public static void main(String[] args) {


//        Pizza pizza1 = new PizzaBuilder("Medium")
//                .withExtraCheese()
//                .build();
//
//        System.out.println(pizza1);
//
//        Pizza pizza2 = new PizzaBuilder("Large")
//                .withExtraCheese()
//                .withPepperoni()
//                .build();
//
//        System.out.println(pizza2);

        IPhone iPhone14 = new IPhone();

//        iPhone14.charge();

        TypeCToLightningAdapter adapter = new TypeCToLightningAdapter(iPhone14);

        adapter.chargeWithTypeC();


    }
}