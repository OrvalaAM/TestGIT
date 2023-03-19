package Paket;


import java.time.LocalDate;
//import java.util.Date;
import java.util.ArrayList;

class Penjumlahan{
    static void jumlahTigaAngka(int a, int b, int c){
        System.out.println(a + b + c);
    }
}

class SimpleDataBase <T>{
    private ArrayList<T> storedData;
    private ArrayList<LocalDate> inputDate;

    public SimpleDataBase() {
        this.storedData = new ArrayList<>();
        this.inputDate = new ArrayList<>();
    }
    
    public void addNewData(T data){
        this.storedData.add(data);
        this.inputDate.add(LocalDate.now());
    }
    
    public void printAllData(){
        for(int i = 0; i < storedData.size(); i++){
            System.out.println(storedData.get(i) + " " +inputDate.get(i));
        }
    }
}

public class NewMain {

    public static void main(String[] args) {

        Penjumlahan.jumlahTigaAngka(12, 12, 12);

        SimpleDataBase db = new SimpleDataBase();
        db.addNewData("Orvala");
        db.addNewData(12);
        db.addNewData(2.5);
        db.addNewData('f');
        db.printAllData();
    }
    
}
