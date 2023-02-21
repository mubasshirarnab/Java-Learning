package MidQuestion.fall2020_3b;

public class Flower {
    public int getPetals() {
        return nPetals;
    }

    public void setPetals(int nPetals) {
        this.nPetals = nPetals;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int nPetals;
        private String color;

        public Flower(int nPetals, String color){
            this.nPetals = nPetals;
            this.color = color;
        }
        public void printName(){
            System.out.println("Flower");
        }
}
class childFlower extends Flower{
    private String flowerName;

    public childFlower(String flowerName){
        super(5,"Red");
        this.flowerName = flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getFlowerName(){
        return flowerName;
    }

    @Override
    public void printName(){
        System.out.println(getFlowerName());
    }

    public void printFlower(childFlower a){
        a.printName();
    }

    public void printDetails(){
        System.out.println("Name: " + getFlowerName() + "\nPetals: " + getPetals() + "\nColour: " + getColor());
    }

}

class information{
    public static void main(String[] args) {
        childFlower f1 = new childFlower("Rose");

        f1.printDetails();
    }
}
