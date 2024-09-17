package designpatterns.structural.adapter;

public class TypeCToLightningAdapter implements TypeCCharger{

    private IPhone iPhone;

    @Override
    public void chargeWithTypeC() {
        System.out.println("TypeC-To-Lightning Adapter");
        iPhone.charge();
    }

    public TypeCToLightningAdapter(IPhone iPhone){
        this.iPhone=iPhone;
    }

}
