package Day8.Inheritence;

public class ConceptualPoint {
}

//Inheritance : we focus on reusability of the code bases from one class into another class
//we achieve this with extends keyword
//It works on the nature of child and parent class
//Inheritance is considered as IS-A relationship
//child class obejcts can be considered as objecct of the parent
//reusability of the code bases


class xyz{
    //data memebers : n numbers
    //methods: n numbers
    //blocks: n numbers
    //constructors: n numbers
}

class Hemant{
    //time taken by Hemant to write this logic is 5 days
    int performAddition(int x, int y){
        int z = x+y;
        return z;
    }
}

//requirements: Mannu had to use the same method written inside Hemant class
//reusing the code base written by Hemant in his cclass : in Mannu class


//class Mannu : is getting the info : child class
//Parent class: Hemant : class whose data is getting inherited
class Mannu extends Hemant{

}











