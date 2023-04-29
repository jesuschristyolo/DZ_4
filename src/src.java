import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class src
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> firstname = new ArrayList<>();
        ArrayList<String> secondname = new ArrayList<>();
        ArrayList<String> otchestvo = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();


        String text = " ";
        FileReader reader = new FileReader("db.sql");

        while (reader. ready ()) {
            text += (char) reader. read();
        }
        reader.close();

        String [] str = text.split("\n");
        for (int i = 1; i < str.length; i++){
            String [] sb = str[i].split(" ");

            firstname.add(sb[0] + " ");
            secondname.add(sb[1].substring(0, 1) + ".");
            otchestvo.add(sb[2].substring(0, 1) + "." + " ");
            age.add(Integer.valueOf(sb[3]));
            gender.add(sb[4] == "M" ? true : false);
            index.add(i);
        }




        for (int i = 0; i < index.size(); i++){
            System.out.printf(firstname.get(i));
            System.out.printf(secondname.get(i));
            System.out.printf(otchestvo.get(i));
            System.out.printf(age.get(i).toString());
            System.out.printf((gender.get(i) ? "M" : "Ж"));
            System.out.println();
        }



    }

}

    