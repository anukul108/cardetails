import java.util.Scanner;
public class Car {
    String manufacturer;
    int price;

    public Car(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

}

class Carmain{
    public static void main(String[] args ){
        int n = 3;
        Car arr[] = new Car[n];
        arr[0] = new Car("Honda",1000000);
        arr[1] = new Car("Hyundai",2000000);
        arr[2] = new Car("BMW",3000000);
        if(arr[0].price < arr[1].price && arr[0].price < arr[2].price ) {
            //System.out.println("manufacturer"+" : "+arr[2].manufacturer+"price"+" : "+arr[2].price);
            System.out.println("manufacturer" + " : " + arr[0].manufacturer+" "+"price" + " : " + arr[0].price);

            if (arr[1].price < arr[2].price) {
                System.out.println("manufacturer" + " : " + arr[1].manufacturer+" "+"price" + " : " + arr[1].price);
                System.out.println("manufacturer" + " : " + arr[2].manufacturer+" "+"price" + " : " + arr[2].price);
            } else {
                System.out.println("manufacturer" + " : " + arr[2].manufacturer+" "+"price" + " : " + arr[2].price);
                System.out.println("manufacturer" + " : " + arr[1].manufacturer+" "+"price" + " : " + arr[1].price);
            }
        }
        else if(arr[1].price < arr[0].price && arr[1].price < arr[2].price){
            System.out.println("manufacturer"+" : "+arr[1].manufacturer+" "+"price"+" : "+arr[1].price);

            if(arr[0].price < arr[2].price){
                System.out.println("manufacturer"+" : "+arr[0].manufacturer+" "+"price"+" : "+arr[0].price);
                System.out.println("manufacturer"+" : "+arr[2].manufacturer+" "+"price"+" : "+arr[2].price);
            }
            else{
                System.out.println("manufacturer"+" : "+arr[2].manufacturer+" "+"price"+" : "+arr[2].price);
                System.out.println("manufacturer"+" : "+arr[0].manufacturer+" "+"price"+" : "+arr[0].price);
            }
        }
        else if(arr[2].price < arr[1].price && arr[2].price <arr[0].price){
            System.out.println("manufacturer"+" : "+arr[2].manufacturer+" "+"price"+" : "+arr[2].price);
            if(arr[1].price < arr[0].price){
                System.out.println("manufacturer"+" : "+arr[1].manufacturer+" "+"price"+" : "+arr[1].price);
                System.out.println("manufacturer"+" : "+arr[0].manufacturer+" "+"price"+" : "+arr[0].price);
            }
            else{
                System.out.println("manufacturer"+" : "+arr[0].manufacturer+" "+"price"+" : "+arr[0].price);
                System.out.println("manufacturer"+" : "+arr[1].manufacturer+" "+"price"+" : "+arr[1].price);
            }
        }









    }

}
