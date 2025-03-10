package _1_methodtasks;
public class Store {

    static  void displayStoreHours(){
        System.out.println("StoreHours:9Am-4Pm");
    }
    static  void displayStoreAddress(){
        System.out.println("StoreAddress:G Konduru,GudiCentre");
    }
    static  void displayStoreInfo(){
        displayStoreHours();
        displayStoreAddress();
    }
    public static void main(String[] args) {
        displayStoreInfo();
    }
}
