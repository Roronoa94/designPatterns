package bridge.example_one;

public class BridgePrinterDemo {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setTitle("The Hateful Eight");
        movie.setActor("Samuel L. Jackson");
        movie.setClassification("Drama");
        movie.setRuntime("3 hrs");

        Formatter movieFormatter = new MovieFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(movieFormatter);
        System.out.println(printedMaterial);

        Formatter anotherMovieFormatter = new MovieFormatterInDifferentFormat();
        String printedMaterialInDifferentFormat = moviePrinter.print(anotherMovieFormatter);
        System.out.println(printedMaterialInDifferentFormat);

    }
}
