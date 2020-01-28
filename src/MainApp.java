import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean play = true;
        VirtualPet vp = createVirtualPet();

        while(play){
            vp.getStats();
            System.out.println("Do you wish to feed your pet to increase it's health?");
            String feed = s.nextLine();
            if(feed.toLowerCase().equals("y")||feed.toLowerCase().equals("yes")){
                vp.feed();
            } else {
                System.out.println("Do you wish to keep playing?");
                String playing = s.nextLine();
                if (playing.toLowerCase().equals("n") || playing.toLowerCase().equals("no")) {
                    play = false;
                }
            }

        }
    }

    private static VirtualPet createVirtualPet() {
        Scanner s = new Scanner(System.in);

        System.out.println("Create a virtual pet!");
        System.out.println("What type of pet is this?");
        String type = s.nextLine();

        System.out.println("What is the pet's description?");
        String description = s.nextLine();

        System.out.println("What is the pets name?");
        String name = s.nextLine();

        return new VirtualPet(type,description,name);
    }
}
