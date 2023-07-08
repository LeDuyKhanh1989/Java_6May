package ReadAndWWrite;

import Management.ProductManager;
import Product.Product;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteProduct {
    ProductManager productManager = new ProductManager();
    File productData = new File("Modul2/src/ProductData.csv");
    Scanner inputNum = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);
    public List<Product> readProduct() throws IOException {
        FileReader file = new FileReader(productData);
        BufferedReader buff = new BufferedReader(file);
        String line = null;
        String[] newArr = new String[5];
        while ((line = buff.readLine()) != null) {
            newArr = line.split(",");
            Product product = new Product(newArr[1], newArr[2], newArr[3], Double.parseDouble(newArr[4]));
            productManager.productArr.add(product);
        }
        buff.close();
        return productManager.productArr;
    }

    public void writeProduct() throws IOException {
        String data=null;
        for (int i = 0; i <productManager.productArr.size(); i++) {
            data+=productManager.productArr.get(i).getProductID()+","+productManager.productArr.get(i).getProductName()+","
                    +productManager.productArr.get(i).getProductColor()+","+productManager.productArr.get(i).getProductTechnicalInfo()+","
                    +productManager.productArr.get(i).getPrice()+"\n";
        }
        FileWriter writer1= new FileWriter( productData);
        BufferedWriter bufer1= new BufferedWriter(writer1);
        bufer1.write(data);
        bufer1.close();
    }
}

