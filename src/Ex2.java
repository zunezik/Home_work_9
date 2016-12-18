import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        List<Pet> pets = new ArrayList<>();
        String song = "";
        while (true) {
            System.out.println("1) Make music");
            System.out.println("2) Add a new Cat");
            System.out.println("3) Add a new Dog");
            System.out.println("4) Add a new Parrot");
            System.out.println("5) Write composition to file");
            System.out.println("0) Exit.");
            System.out.println("Please select menu item: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) song = makeMusic(pets);
            if (choice == 2) pets.add(createCat());
            if (choice == 3) pets.add(createDog());
            if (choice == 4) pets.add(createParrot());
            if (choice == 5) writeToFile(song, findArtists(pets));
            if (choice == 0) System.exit(0);
        }

    }


    public static String findArtists(List<Pet> pets) {
        Pet pet = new Pet();
        String artists = "Artists: ";
        for (int i = 0; i < pets.size(); i++) {
            pet = pets.get(i);
            artists += pet.name + " ";
        }
        return artists;
    }

    public static void writeToFile(String song, String artists) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File("D:/" + fileName + ".txt");
        file.createNewFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        song += "\r\n";
        outputStream.write(song.getBytes());
        outputStream.write(artists.getBytes());
        outputStream.close();
        System.out.println("Successfully writen");
    }

    public static String makeMusic(List<Pet> pets) {
        Pet pet = new Pet();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song length: ");
        int songLength = sc.nextInt();
        String song = "";
        for (int i = 0; i < songLength; i++) {
            for (int j = 0; j < pets.size(); j++) {
                pet = pets.get(j);
                song += pet.say();
            }
        }

        System.out.println(song);
        return song;
    }

    public static Pet createCat() {
        Cat cat = new Cat();
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        cat.createCat(name);
        System.out.println("Cat with name " + name + ", was added.");
        return cat;
    }

    public static Pet createDog() {
        Dog dog = new Dog();
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        dog.createDog(name);
        System.out.println("Dog with name " + name + ", was added.");
        return dog;
    }

    public static Pet createParrot() {
        Parrot parrot = new Parrot();
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        parrot.createParrot(name);
        System.out.println("Parrot with name " + name + ", was added.");
        return parrot;
    }


}
