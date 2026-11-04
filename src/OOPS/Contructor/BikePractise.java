package OOPS.Contructor;
public class BikePractise {
    static void main(String[] args) {
       Product dettolProductRef=new Product(1,"dettol",25);
       Product unknowProductRef=new Product();
       Product dettolProductPriceCopy=new Product(dettolProductRef);
       dettolProductPriceCopy.setId(2);

        System.out.println("unknowProductRef "+unknowProductRef);
        System.out.println("dettolProductRef "+dettolProductRef);
        System.out.println("dettolProductPriceCopy "+dettolProductPriceCopy);
        //rightCLikc-->source action-->toString,Getter,Setter,Constructor
    }
}
class BikeProtoType{
    private String companyName;

    @Override
    public String toString() {
        return "BikeProtoType{" +
                "companyName='" + companyName + '\'' +
                ", materialType='" + materialType + '\'' +
                ", typeNumber=" + typeNumber +
                '}';
    }

    public BikeProtoType( ){
        this.companyName="TVS";
        this.materialType="Carbon Fibre";
        this.typeNumber=2;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public int getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(int typeNumber) {
        this.typeNumber = typeNumber;
    }

    private String materialType;
    private int typeNumber;
}
class Human{
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private int age;
    private double height;

    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
class Product{
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int id;
    private String productName;
    private double price;

    public Product(int id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }
    public Product(){
        this.id=0;
        this.productName="";
        this.price=0;
    }
    public Product(Product previousProduct){
        this.price=previousProduct.price;

        this.productName=previousProduct.productName;
    }
}