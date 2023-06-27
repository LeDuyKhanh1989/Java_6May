package WareHouse;

import Product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Warehouse {
    private String productID;
    private String receiveDate;
    private String expirationDate;
    private int productNumber;
    private double productPrice;
    private List<Product> productArrayList = new ArrayList<>();
    Scanner inputNumber = new Scanner(System.in);
    Scanner inputString=new Scanner(System.in);

    public Warehouse(String receiveDate, String expirationDate, int productNumber, double productPrice) {
        this.receiveDate = receiveDate;
        this.expirationDate = expirationDate;
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public void addProduct(){
        System.out.println("Nhập vào ID của sản phẩm: ");
        String productID= inputString.nextLine();
        System.out.println("Nhập vào tên sản phẩm: ");
        String productName= inputString.nextLine();
        System.out.println("Nhập vào mầu sắc của sản phẩm: ");
        String productColor= inputString.nextLine();
        System.out.println("Nhập vào thông số kỹ thuật của sản phẩm: ");
        String productInfo= inputString.nextLine();
        Product newProduct = new Product(productID,productName,productColor,productInfo);
        productArrayList.add(newProduct);
        System.out.println("Nhập vào ngày nhập hàng: ");
        String receiveDate = inputString.nextLine();
        System.out.println("Nhập vào ngày hết hạn: ");
        String expirationDate = inputString.nextLine();

    }

}
