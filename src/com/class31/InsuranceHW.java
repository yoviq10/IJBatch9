package com.class31;

public abstract class InsuranceHW {

    String insuranceName;
    InsuranceHW(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void  getQuote();
    public abstract void  cancelInsurance();

}

class Car extends InsuranceHW {

    String carModel;
    Car(String insuranceName, String carModel){
        super(insuranceName); //refers to parent
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {

        System.out.println("Gets a quote for car Model "+carModel+" with "+insuranceName);
    }

    @Override
    public void cancelInsurance() {

        System.out.println("Cancel the insurance "+ insuranceName+" for car model "+ carModel);

    }
}

class Pet extends InsuranceHW{


    String petType;

    Pet(String insuranceName, String petType){
        super(insuranceName);
        this.petType=petType;
    }
    @Override
    public void getQuote() {
        System.out.println("Gets a quote for "+petType+" with "+insuranceName);

    }

    @Override
    public void cancelInsurance() {

        System.out.println("Cancel the insurance "+ insuranceName+" for "+petType);

    }
}

class Health extends InsuranceHW{

    Health(String insuranceName){
    super(insuranceName);
}

    @Override
    public void getQuote() {
        System.out.println("Gets a quote from "+insuranceName);

    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName);

    }
}