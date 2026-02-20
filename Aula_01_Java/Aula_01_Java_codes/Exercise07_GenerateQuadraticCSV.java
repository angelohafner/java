import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class GenerateQuadraticCSV {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("quadratic_data.csv");

            writer.write("x;y\n");

            double deltaX = 0.1;
            double x = 1.0;

            while (x <= 4+ deltaX) {

                double y = x * x - 5.0 * x + 6.0;

                // Format using Brazilian locale
                String xStr = String.format(Locale.forLanguageTag("pt-BR"), "%.2f", x);
                String yStr = String.format(Locale.forLanguageTag("pt-BR"), "%.2f", y);

                writer.write(xStr + ";" + yStr + "\n");
                x = x + deltaX;
            }

            writer.close();
            System.out.println("CSV file generated successfully.");

        } catch (IOException e) {

            System.out.println("Error writing CSV file.");
        }
    }
}
