public class VirtualPet {
    String name;
    int health;
    String description;
    String type;

    public VirtualPet(String type, String description, String name) {
        this.name = name;
        this.health = (int)Math.random() * 99 + 1;
        this.description = description;
        this.type = type;
    }
    public VirtualPet(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getStats(){
        System.out.println("\n"+name +"\nDescription: " + description + "\nCurrent Health: " + health +"\n");
    }

    public void feed(){
        health += Math.random()*10+7;
    }
}
