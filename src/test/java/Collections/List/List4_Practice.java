package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List4_Practice {
    public static void main(String[] args) {


        List<String> colors = new ArrayList<>();
        Collections.addAll(colors, "red", "YeLLOw", "BlUe", "BlAck", "WhiTE");

        for (int i = 0; i < colors.size(); i++) {
            String firstUp = colors.get(i).substring(0, 1).toUpperCase();
            String restLo = colors.get(i).substring(1).toLowerCase();
            System.out.println(firstUp + restLo
            );

        }
    }
}