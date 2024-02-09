package src;

import java.util.ArrayList;

public class Invoice {
    private String id;

    private ArrayList<Product> products;

    public Invoice(String id){
        this.id = id;
        products = new ArrayList<>();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public int getTotalGross(){
        int totalGross = 0;

        for(Product p: products){
            totalGross += p.getGrossPrice();
        }

        return totalGross;
    }

    public int getTotalNet(){
        int totalNet = 0;

        for(Product p: products){
            totalNet += p.getNetPrice();
        }

        return totalNet;
    }

    public void print(){
        int position = 1;
        System.out.println("===========================");
        System.out.println("src.Invoice "+id);
        for(Product p: products){
            System.out.printf("%d . %s\n", position, p.getDescription());
            position++;
        }
        System.out.println("Total: " + getTotalNet() + " / " + getTotalGross());
        System.out.println("===========================");
    }

    public int getNumberOfItems(){
        return products.size();
    }

    public String toString() {
        return "src.Invoice " + id;
    }

    public String removeProduct(int position){
        if(position < 0 || position >= getNumberOfItems()) {
            return "not removed";
        }
        else {
            String s = products.get(position).toString();
            products.remove(position);
            return "removed:" + s;
        }
    }
}
