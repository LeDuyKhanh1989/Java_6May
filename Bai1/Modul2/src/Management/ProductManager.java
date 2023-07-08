package Management;

import Product.Product;

import java.util.ArrayList;

public class ProductManager implements Manager<Product>{
    public ArrayList <Product> productArr= new ArrayList<>();
    public void add(Product product) {
        productArr.add(product);
    }

    @Override
    public void edit(String id, Product product) {
    int index= findIndex(id);
    productArr.set(index,product);
    }

    @Override
    public void delete(String id) {
        int index= findIndex(id);
        productArr.remove(index);
    }

    @Override
    public int findIndex(String id) {
        for (int i = 0; i <productArr.size() ; i++) {
           if( productArr.get(i).getProductID()==id){
               return i;
           }
        }
        return -1;
    }

    @Override
    public void showall() {
        System.out.println(productArr);

    }
}
