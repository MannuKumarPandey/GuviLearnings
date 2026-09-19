package Day7.DataEncapsulations;

public class DEC {
    //Data encapsulation: process to hide the information for direct accessing:(with the hellp of modifier keywords)
    // direct access: not allowed
    //Indirect access allowed : another alternate way to access that info using methods
    public static void main(String[] args) {
        Key a = new Key();
       // System.out.println(a.name);

        System.out.println(a.getName());

        a.setName("Mannu ");
        System.out.println(a.getName());
    }
}



class Key{
    //private information in visible as public via methods
    private String name = "2Wheeler";//direct accessing of this variable name is not possible

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}