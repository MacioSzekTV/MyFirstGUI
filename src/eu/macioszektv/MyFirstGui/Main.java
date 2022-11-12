package eu.macioszektv.MyFirstGui;

import eu.macioszektv.adagio.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args){
        Frame frame = new Frame();
        frame.create(600, 500, "Moje pierwsze gui");
        try {
            URL url = new URL("https://avatars.githubusercontent.com/u/47892486");
            frame.setIcon(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        Panel panel = new Panel();
        frame.add(panel);
        panel.setTitle("Moj panel");
    }
}
