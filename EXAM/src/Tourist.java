interface Tourist {

    int budget = 0;

    void visit();

    void visit(Bataan Bataan);

    void visit(Pampanga Pampanga);

    void visit(Boracay boracay);

    void visit(Cabanatuan Cabanatuan);

    void visit(America America);

    void visit(Mayon Mayon);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
    
}