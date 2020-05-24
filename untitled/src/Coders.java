public class Coders {
    private static String[] firstName = {"Agnes", "Penny", "Mitchel", "Dean", "Sam", "Rick", "Morty", "Chace", "Rhiannon", "Kelsey", "Conall", "Jensen", "Jared", "Darcey", "Alissa", "Rarita", "Lalisa", "Robert", "Antony", "Summer", "Jerry", "John", "Keanu"};
    private static String[] secondName = {"Winchester", "Ackles", "Padalecki", "Corona", "Graves", "Hawes", "Stark", "Benor", "Pemberton", "Sanchez", "Smith", "Roiland", "Trevino", "Moss", "Duggan", "Hagan", "Wick", "Reeves"};

    public static String generate() {
        return firstName[(int)(Math.random()*firstName.length)] + " " + secondName[(int)(Math.random()*secondName.length)];
    }
}
