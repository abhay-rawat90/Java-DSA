package com.abhay.enumexaples;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        //public,static and final
        //since its final you can not create child enums
        //type is Week

        Week(){
            System.out.println("Constructor called for " + this);
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for (Week day : Week.values())
        {
            System.out.println(day);
        }
        System.out.println(week.ordinal());
    }
}
