/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jktvkalender;

import java.util.Scanner;

/**
 *
 * @author kostj
 */
public class JKTVKalender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите любой год начиная с 1984 года: ");
        String[] color = {"зелённой","красного","желтой","белой","чёрной"};
        String[] animals = {"крысы","коровы","тигра","зайца","дракона","змея","лошади","овцы","обезьяны","курицы","собаки","свиньи"};
        int year = scanner.nextInt();
        if(year < 1984){
            System.out.println("Вы ввели год который меньше 1984 года");
            
        }else{
        int colorIndex = ((year - 1984)/12)%5;
        int animalIndex = (year - 1984)%12;
        System.out.println("Это будет год " + color[colorIndex] + " " + animals[animalIndex]);
        }
    }
    }

