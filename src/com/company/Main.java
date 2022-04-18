package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int task = sc.nextInt();
        if (task ==1)
        {
            Task1();
        }
        if (task == 2)
        {
            Task2();
        }
    }

    public  static int  calculateAge (int narod) {
        int yearlimit= 2022-narod;
        return yearlimit;
    }

    public  static void Task1()
    {
        int workersOver60 =0;

         Worker [] arr = new Worker[5];

         arr[0] = new Worker("Андрійченко", 1950, "Водій", 800, "Школа");
         arr[1] = new Worker("Дмитренко", 1984, "Прибиральник", 500, "Школа");
         arr[2] = new Worker("Олександренко", 1959, "Рамшут", 849, "Школа");
         arr[3] = new Worker("Василенко", 1954, "Замшут", 482, "Школа");
         arr[4] = new Worker("Максименко", 1965, "Начаніка", 985, "Школа");

         for (int i=0; i< arr.length ;i++){

             if (calculateAge(arr[i].getNarod()) > 60){
                 System.out.println(arr[i].getinfo());
                 workersOver60++;
             }
         }
         System.out.println("\n Кількість прачівників старших 60 >> "+ workersOver60);
    }

    public  static  void Task2(){
        Cinema mas [] = new Cinema[4];

        mas[0] = new Cinema("Квіточка галактики",new Date(2022,11,05,13,30),
                90, Cinema.FilmGanres.comedy,66666666);
        mas[1] = new Cinema("Козаки",new Date(2022,11,05,18,30),
                70, Cinema.FilmGanres.comedy,6031206);
        mas[2] = new Cinema("Привид Києва",new Date(2023,11,05,17,30),
                89, Cinema.FilmGanres.comedy,999999999);
        mas[3] = new Cinema("Чорнобаївка",new Date(2023,11,05,15,30),
                89, Cinema.FilmGanres.comedy,999999999);

        for (int i =0;i<mas.length;i++){
            if (mas[i].getFilmDate().getHours()<18 && mas[i].getDurationFilm()<90)
            {
                System.out.println(mas[i].getinfo());
            }
        }



    }
}

