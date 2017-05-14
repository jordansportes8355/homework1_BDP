package display.tree;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class displaytree {

    public static void main(String[] args) {

        String csvFile = "data/arbres.csv";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] arbre = line.split(";");

                System.out.println("Arbre [annee= " + arbre[5] + " , hauteur=" + arbre[6] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}