package com.dandy.java;

public class PrintAverage {
    public static void main(String[] args) {
        int[] grades = {80, 95, 92, 70};
        // int sum = 0 // 자료형이 int인 경우 결과 : 84.0
        double sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        System.out.println("4 과목의 평균 점수 : " + average);
    }
}
