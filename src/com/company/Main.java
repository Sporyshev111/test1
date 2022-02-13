package com.company;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("загружено.bmp"));
            System.out.println(img);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
