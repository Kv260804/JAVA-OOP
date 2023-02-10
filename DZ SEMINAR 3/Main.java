import Animals.Cat;
import FamilyTree.Person;
import FamilyTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode dad = new Person("Куделин Алексей Андреевич");
        TreeNode mom = new Person("Веселова Марина Александровна");
        dad.setSpouse(mom);

        TreeNode son = new Person("Веселов Константин Георгиевич", dad, mom);
        TreeNode daughter = new Person("Веселова Варя Алексеевна", dad, mom);

        TreeNode grandpa = new Person("Веселов Александр Юрьевич");
        dad.setParent(grandpa);

        System.out.println(grandpa.getChildren());
        System.out.println(dad.getChildren());
        System.out.println(dad.getParent());
        System.out.println(mom.getChildren());
        System.out.println(mom.getParent());
        System.out.println(son.getParent());
        System.out.println(daughter.getParent());
        System.out.println(((Person) dad).getSpouse());


        Cat cat = new Cat("Мяукалка", (Person) mom);
        cat.callReply((Person) dad);
        cat.voice();
        System.out.println(cat);
        ((Person) mom).callPet(cat);

        System.out.println(daughter.isSibling(son));


    }
}