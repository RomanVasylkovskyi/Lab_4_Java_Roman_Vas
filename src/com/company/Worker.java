package com.company;

import java.util.Date;

public class Worker {

    private String FirstName;
    private int narod;
    private  String work;
    private  int salary;
    private  String education;

    public  Worker(String FirstName, int narod, String work, int salary, String  education) {

        setFirstName(FirstName);
        setNarod(narod);
        setWork(work);
        setSalary(salary);
        setEducation(education);
    }

    public  void  setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public  void  setNarod(int   narod){
        this.narod = narod;
    }

    public  void  setWork(String work){
        this.work = work;
    }

    public  void  setSalary(int salary){
        this.salary = salary;
    }

    public  void  setEducation(String education){
        this.education = education;
    }

    public  String getinfo() {

        return "name : "+FirstName+", narod : "+narod+", work : "+work+", salary : "+salary+", education : "+education;
    }

    public  int getNarod () {
        return narod ;
    }

}
