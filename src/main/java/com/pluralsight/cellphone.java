package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;


    }

    public int getSerialNumber(){
        return this.serialNumber;
    }

    public void setSerialNumber(int newSerialNumber){
        this.serialNumber = newSerialNumber;


    }

    public String getModel(){
        return model;

    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public String getCarrier(){
        return carrier;

    }

    public void setCarrier(String newCarrier){
        this.carrier = newCarrier;
    }

    public String getPhoneNumber(){
        return phoneNumber;

    }

    public void setPhoneNumber( String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }

    public String getOwner() {

        return owner;
    }

    public void setOwner(String newOwner) {

        this.owner = newOwner;
    }


    public void dial(String phoneNumber){
        System.out.println( this.owner + "'s phone dialing " + phoneNumber);
    }


}



