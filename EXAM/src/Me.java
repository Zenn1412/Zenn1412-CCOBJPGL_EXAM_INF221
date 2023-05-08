public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Pampanga Pampanga) {

        //Expenses
        budget -= Pampanga.airFare;

        // Define your visit
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Pumunta sa Pampanga: ");
        System.out.println("Daming pagkain");
        checkBudget();
    }

    public void visit(Bataan Bataan) {

        //Expenses
        budget -= Bataan.airFare;

        // Define your visit
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Pumunta sa Bataan: ");
        System.out.println("Nag swimming");
        checkBudget();
    }
    
    public void visit(Boracay boracay) {

        //Expenses
        budget -= boracay.airFare;
        
        // Define your visit
        System.out.print("Pumunta sa Boracay: ");
        System.out.println("Daming Shawty ah");
        checkBudget();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void visit(Cabanatuan Cabanatuan) {

        //Expenses
        budget -= Cabanatuan.airFare;

        // Define your visit
        System.out.print("Pumunta sa Cabanatuan: ");
        System.out.println("Pumunta sa kaibigan");
        checkBudget();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void visit(America America) {

        //Expenses
        budget -= America.airFare;

        // Define your visit
        System.out.print("Pumunta sa America: ");
        System.out.println("Hanap Foreign shawty ah");
        checkBudget();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void visit(Mayon Mayon) {

        //Expenses
        budget -= Mayon.airFare;

        // Define your visit
        System.out.print("Pumunta sa Mayon: ");
        System.out.println("Nature lover ah");
        checkBudget();
        System.out.println("Ipon muna 'la na pera ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

    }

    public void checkBudget() {

        System.out.println("my budget is " + budget);
    }

}