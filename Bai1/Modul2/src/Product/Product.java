package Product;

public class Product {
    private String productID;
    private String productName;
    private String productColor;
    private String productTechnicalInfo;

    public Product() {
    }

    public Product(String productID, String productName, String productColor, String productTechnicalInfo) {
        this.productID = productID;
        this.productName = productName;
        this.productColor = productColor;
        this.productTechnicalInfo = productTechnicalInfo;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductTechnicalInfo() {
        return productTechnicalInfo;
    }

    public void setProductTechnicalInfo(String productTechnicalInfo) {
        this.productTechnicalInfo = productTechnicalInfo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productColor='" + productColor + '\'' +
                ", productTechnicalInfo='" + productTechnicalInfo + '\'' +
                '}';
    }
}
