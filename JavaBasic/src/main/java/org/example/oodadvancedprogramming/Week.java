package org.example.oodadvancedprogramming;

public enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public static Week getByValue(int value){
        Week[] values = Week.values();
        if(value >0 && value <= values.length){
            return values[value-1];
        }
        return null;
    }
}
