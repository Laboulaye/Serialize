package com.study;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Person jacob = new Person("Jacob", 28, "ul. Lenina, 3", "Developer");
        Person mia = new Person("Mia", 25, "ul. Lenina 6", "Model");


        try(
                FileOutputStream fos = new FileOutputStream("d://test.txt");
                ObjectOutputStream ost = new ObjectOutputStream(fos);
        )
        {
            ost.writeObject(jacob);
            ost.writeObject(mia);
            System.out.println("Данные до записи:");
            System.out.println(jacob);
            System.out.println(mia);
        }
        catch (FileNotFoundException f){
            System.out.println("Файл не найден");
        }
        catch (IOException i){
            System.out.println("Ошибка записи данных");
        }

        try(
                FileInputStream fis = new FileInputStream("d://test.txt");
                ObjectInputStream oist = new ObjectInputStream(fis)
        )
        {
            Person jacobRestored = (Person)oist.readObject();
            Person miaRestored= (Person)oist.readObject();

            System.out.println("\nДанные после записи:");
            System.out.println(jacobRestored);
            System.out.println(miaRestored);
        }
        catch(ClassNotFoundException c) {
            System.out.println("Класс Person не найден");
        }
        catch(FileNotFoundException f){
            System.out.println("Файл не найден");
        }
        catch(IOException i){
            System.out.println("Ошибка чтения файла");
        }


    }

}
