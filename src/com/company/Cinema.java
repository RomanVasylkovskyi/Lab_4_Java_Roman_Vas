package com.company;

import java.util.Date;

public class Cinema {

    public  enum FilmGanres{
        Fantasy,Horror,comedy
    }

    private  String NameCinema;
    private Date FilmDate;
    private  int DurationFilm;
    private  FilmGanres Ganre;
    private  int Budget;



    public Cinema(String NameCinema,Date FilmDate,int DurationFilm,FilmGanres Ganre,int Budget){

        this.NameCinema = NameCinema;
        this.FilmDate = FilmDate;
        this.DurationFilm = DurationFilm;
        this.Ganre = Ganre;
        this.Budget=Budget;

    }

    public  String  getinfo(){

        return "Name : "+NameCinema+", Date : "+FilmDate+", Duraction : "+DurationFilm+" m , Ganre : "+Ganre+", Budget : "+ Budget+"$";
    }

    public  int getDurationFilm(){

        return DurationFilm;
    }

    public  Date getFilmDate(){
        return FilmDate ;
    }
}
