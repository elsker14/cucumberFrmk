package org.example.services;

// Clasa de obiect = reprezinta schita unui obiect pe care il putem caracteriza dupa diverse trasaturi sau comportamente

public class Calculator {
    // Atribute = trasaturile caracteristice ale unui obiect
    public String tipCalculator;

    // Constructor = este un mecanism de initializare a unui obiect in functie de atributele clasei
    // default = neparametrizat, scopul lui este de a seta niste informatii generale pt atribute
    public Calculator() {
        this.tipCalculator = "";
    }

    // parametrizat, scopul lui e de a seta niste informatii specifice din start
    public Calculator(String tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    // comportament = reprezinta o serie de metode care definesc functionalitatile clasei
    public float sum(float a, float b) {
        float result = a + b;
        return result;
    }

    public float subtract(float a, float b) {
        float result = a - b;
        return result;
    }

    public float divide(float a, float b) {
        float result = a / b;
        return result;
    }

    public float multiply(float a, float b) {
        float result = a * b;
        return result;
    }

    // static = defineste o metoda necorelata de instanta clasei
    // adica nu are nevoie de un obiect pt a fi apelata, ci doar de numele clasei
    public static void suntFloricel() {
        System.out.println("sunt floricica");
    }
}
