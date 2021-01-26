package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessTheNumber();
        guessWord();
    }

    public static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        do {
            Random random = new Random();
            int number = random.nextInt(10);
            System.out.println("Угдай число от 0 до 9, у тебя 3 попытки");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введи свой ответ: ");
                int userAnswer = scanner.nextInt();
                if (number == userAnswer) {
                    System.out.println("Вы угадали, загаданное число было: " + number);
                    break;
                } else if (number > userAnswer) {
                    System.out.println("Загаданное число больше " + userAnswer);
                } else{
                    System.out.println("Загаданное число меньше " + userAnswer);
                }
                System.out.println((i-1) > 0 ? "У вас осталось " + (i-1) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (scanner.nextInt() == 1);
    }

    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int numberOfArray = random.nextInt(25);
        String word = words[numberOfArray];
        System.out.println("Я загадал одно из слов:\napple orange lemon banana apricot \navocado broccoli carrot cherry garlic \ngrape melon leak kiwi mango \nmushroom nut olive pea peanut \npear pepper pineapple pumpkin potato \n\nПопробуй угадать его");
        Scanner scanner = new Scanner(System.in);
        char[] dataArray = new char[15];
        for (int i = 0; i < 15; i++) {
            dataArray[i] = '#';
        }
        do{
            System.out.println("Введи свой ответ");
            String userAnswer = scanner.nextLine();

            if(userAnswer.equals(""))
                break;
            else if (userAnswer.equals(word)){
                System.out.println("Поздравляю вы угадали!");
                break;
            }
            char[] charsAnswer = userAnswer.toCharArray();
            for (int i = 0; i < charsAnswer.length; i++) {
                if(charsAnswer[i] == word.charAt(i)){
                    dataArray[i] = word.charAt(i);
                } else if(charsAnswer.length > word.length()) {
                        break;
                    }
                }
            System.out.println(dataArray); //Было трудно xD
        } while(true);
    }
}