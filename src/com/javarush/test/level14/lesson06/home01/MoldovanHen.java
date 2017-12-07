package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Владислав on 22.02.2016.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }
    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
