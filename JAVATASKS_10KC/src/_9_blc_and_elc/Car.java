package _9_blc_and_elc;
public class Car {
    int carId;
    String brand;
    String model;
    int rentalPricePerDay;
    void setCarId(int pid){
        carId=pid;
    }
    void setBrand(String pname){
        brand=pname;
    }
    void setModel(String pmodel){
        model=pmodel;
    }
    void setrentalPricePerDay(int prentalPricePerDay){
        rentalPricePerDay=prentalPricePerDay;
    }
    int getCarId(){
        return carId;
    }
    String getbrand(){
        return brand;
    }
    String getmodel(){
        return model;
    }
    int getrentalPricePerDay(){
        return rentalPricePerDay;
    }
}