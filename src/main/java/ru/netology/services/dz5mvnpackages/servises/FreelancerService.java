package ru.netology.services.dz5mvnpackages.servises;

public class FreelancerService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int restMonths = 0; // счётчик месяцев отдыха

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                restMonths++;
                money = (money - expenses) / 3; // Отдых: вычитаем expenses, затем остаток делим на 3
            } else {
                money += income;
                money -= expenses;
            }
        }
        return restMonths;
    }
}