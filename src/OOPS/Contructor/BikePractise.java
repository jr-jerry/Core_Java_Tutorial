package OOPS.Contructor;

public class BikePractise {
    static void main(String[] args) {
        BikeProtoType bikeProtoType = new BikeProtoType();
        BikeProtoType bikeProtoType1 = new BikeProtoType();
        System.out.println("object 1 "+bikeProtoType +" obj 2 "+bikeProtoType1);
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