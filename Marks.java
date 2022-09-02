package com.company;

public class Marks {

    private int mk1;
    private int mk2;
    private int mk3;

    public Marks(int mk1, int mk2, int mk3){
        this.mk1 = mk1;
        this.mk2 = mk2;
        this.mk3 = mk3;
    }

    public Marks(int mk1, int mk2){
        this.mk1 = mk1;
        this.mk2 = mk2;
        this.mk3 = mk3;
    }

    public int getMk1() {
        return mk1;
    }

    public void setMk1(int mk1) {
        this.mk1 = mk1;
    }

    public int getMk2() {
        return mk2;
    }

    public void setMk2(int mk2) {
        this.mk2 = mk2;
    }

    public int getMk3() {
        return mk3;
    }

    public void setMk3(int mk3) {
        this.mk3 = mk3;
    }

    public int total(){
        int total = getMk1() +getMk2() +getMk3();
        return total;
    }

    public double avg(){
        if(getMk3() == 0){
            double avg = total() / 2;
            return avg;
        }else {
            double avg = total() / 3;
            return avg;
        }
    }

    public String grade(){
        String grd;
        if(avg()>= 50){
            grd = "Pass";
        }else {
            grd = "Fail";
        }
        return grd;
    }
}
