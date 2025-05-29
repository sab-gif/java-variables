public class SplitBills {
    public static void main(String[] args) {

        //Crea dos variables, la primera que contenga el total de la cuenta que será 7 EUR y la segunda que contenga el número de personas a dividir (esta variable deberá ser de tipo int) que serán 2 personas.
        double totalBill = 7.0;
        int numPeople = 2;

        //Haz la operación aritmética para devolver la cantidad a pagar por persona y almacénala dentro de una variable (del tipo que veas conveniente).
        double amountPerPerson = totalBill / numPeople;
        
        //Imprime el resultado (deberá devolverte 3.5)
        System.out.println("Cada persona debe pagar: " + amountPerPerson + " EUR");

    }
}
