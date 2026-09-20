package Day8.Inheritence;


//if you write any java class: by default its parent is Object class

public class NatureOfObjectClass {
    public static void main(String[] args) {
        System.out.println(NatureOfObjectClass.class.getSuperclass());

        Object o = new Object();//ultimate parent of All java classes: class Object
    }
}


