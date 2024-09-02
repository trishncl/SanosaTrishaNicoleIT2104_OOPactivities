import java.util.*;
public class GettingInputs {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String year = inputs.nextLine();

        System.out.print("Enter the genre: ");
        String genre = inputs.nextLine();

        System.out.print("Enter the album: ");
        String album = inputs.nextLine();

        System.out.print("Enter the song title: ");
        String s_title = inputs.nextLine();

        System.out.print("Enter the artist: ");
        String artist = inputs.nextLine();

        System.out.println("--------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------------");

        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + "\"" + s_title + "\"");
        System.out.println("Artist: " + artist);
        
        inputs.close();
    }
}

