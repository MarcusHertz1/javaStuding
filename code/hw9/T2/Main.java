package code.hw9.T2;

/*
Создать программу для имитации работы клиники.
Пусть в клинике будет три врача: хирург, терапевт и дантист.
Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
Так же предусмотреть класс «Пациент» и класс «План лечения».
Создать объект класса «Пациент» и добавить пациенту план лечения.
Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
*/

public class Main {
    public static void main(String[] args) {
        Patient petya = new Patient(new TreatmentPlan(5));
        Patient steam = new Patient(new TreatmentPlan(1));
        Patient gaben = new Patient(new TreatmentPlan(2));

        petya.getDoctor().healingMethod();
        steam.getDoctor().healingMethod();
        gaben.getDoctor().healingMethod();
    }
}
