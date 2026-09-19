package Day7.Folder1;

public class File2WhichHasAllData {

    private String name ="file 222222222222";

     String lastName ="9999999999999";//here we have not written any modifier :
    //thats why it is considered as default : available in any file under same folder
    //means avaiuable in any java class under same package but not in opther folders/packages

    protected String brand = "HCL";
    //prtotected : Its visibility will be in same class, same package any otehr classes as well,
    // its visibility : even in inter folders with inheritance special condition


    public String desc ="We are learning !!!!!!!";//its visibility is highest one: any where in all the folders as well :
    //throught out the projects


}
//private -> only visible inside that java class or java file
//even inside the same folder : other files(java classes): this will not bve available


//java class = file
//package = folders


//final : private -> deafult -> protected  -> public