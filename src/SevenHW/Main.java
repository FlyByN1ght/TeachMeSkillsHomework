package SevenHW;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        // Создаем терапевта
        Therapist therapist = new Therapist();
        // Создаем пациента с планом лечения
        Patient patient = new Patient(3);
        Patient patient1 = new Patient(2);
        Patient patient2 = new Patient(1);

        // Назначаем врача терапевтом и выполняем лечение
        therapist.assignDoctorToPatient(patient);
        therapist.assignDoctorToPatient(patient2);
        therapist.assignDoctorToPatient(patient1);

        System.out.println("----------------------");
        Apple apple = new Apple();
        apple.printData();
        String newColor = null;
        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            newColor = (String) field.get(apple);
            field.set(apple, (String) "Orange");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        apple.printData();
    }
}