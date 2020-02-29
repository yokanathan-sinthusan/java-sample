package com.sinthu.sample;

import javafx.application.Application;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Appilication{
    public static void main(String[] args) {

/*
        List<String> students=new ArrayList<>();

        students.add("Saman");
        students.add("Sinthu");
        students.add("Kaji");
        students.add("Pirana");
        students.add("Vithya");
        System.out.println(students);

        List<String> filtereddata=students.stream()

                .filter(s->s.length()>5)
                .collect(Collectors.toList());
        System.out.println(filtereddata);
*/

List<Sensors> sensors=new ArrayList<>();


Sensors sensor1=new Sensors("Living room", 28);
sensors.add(sensor1);
Sensors sensor2=new Sensors("Office room", 26);
sensors.add(sensor2);
Sensors sensor3=new Sensors("Bed room", 29);
sensors.add(sensor3);
Sensors sensor4=new Sensors("Kitchen room", 30);
sensors.add(sensor4);
Sensors sensor5=new Sensors("Bath room", 25);
sensors.add(sensor5);
List<Sensors> hotsensors=sensors.stream()

         .filter(sensor-> sensor.getValue ()<28)
                .collect(Collectors.toList());
        System.out.println(hotsensors);





    }
}