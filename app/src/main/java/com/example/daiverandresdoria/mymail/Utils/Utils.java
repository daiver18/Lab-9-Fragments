package com.example.daiverandresdoria.mymail.Utils;

import android.graphics.Color;

import com.example.daiverandresdoria.mymail.Models.Mails;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {

    public static List<Mails> getDummyData(){
        return new ArrayList<Mails>(){{
           add(new Mails("tema1","Message 1 hello","Daiver@gamil.com"));
            add(new Mails("tema2","Message 2 hello","Juan@gamil.com"));
            add(new Mails("tema3","Message 3 hello","Raul@gamil.com"));
            add(new Mails("tema4","Message 4 hello","Pablo@gamil.com"));
            add(new Mails("tema5","Message 5 hello","juanita@gamil.com"));
            add(new Mails("tema6","Message 6 hello","Jose@gamil.com"));
            add(new Mails("tema7","Message 7 hello","Lorena@gamil.com"));
            add(new Mails("tema8","Message 8 hello","Carlos@gamil.com"));
        }};
    }

   /* public static int getRandomColor(){
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);

        int color = Color.rgb(red,green,blue);
        return color;
    }*/

    public static int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}
