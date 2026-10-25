package OOPS.Contructor.PrivateContructor;

public class PrivateConstructorOverview {
    public static void main(String[] args) {
        DbConnection obj1=DbConnection.get_obj();
        System.out.println(obj1);

        DbConnection obj2=DbConnection.get_obj();
        System.out.println(obj2);
    }
}
class DbConnection{
    private static DbConnection dbConnection_obj;

    private DbConnection(){
        System.out.println("Constructor called! ");
    }

    public  static DbConnection get_obj(){
        if(dbConnection_obj == null){
            dbConnection_obj = new DbConnection();
        }
        return dbConnection_obj;
    }
}