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
        System.out.println("------------------------------------------------------");
        System.out.println("Invoice "+id);
        for(int i = 0; i < products.size(); i++){
            Product currentProduct = products.get(i);
            System.out.printf("| %d | %s |\n", i+1, currentProduct.getDescription());
        }
        System.out.println("| Total: " + getTotalNet() + " | " + getTotalGross() + " |");
        System.out.println("------------------------------------------------------");
    }

    public int getNumberOfItems(){
        return products.size();
    }

    public String toString() {
        return "I'm invoice " + id;
    }

    public String removeProduct(int position){
        if(position < 0 || position >= getNumberOfItems()) {
            return "no product to remove";
        }
        else {
            String s = products.get(position).toString();
            products.remove(position);
            return "removed: " + s;
        }
    }
}
