        public class App {
            public static void main(String[] args) throws Exception {
        
                Locations bataan = new Bataan();
                Locations Pampanga = new Pampanga();
                Locations boracay = new Boracay();
                Locations Cabanatuan = new Cabanatuan();
                Locations America = new America();
                Locations Mayon = new Mayon();
                
                Tourist me = new Me();
        
                bataan.accept(me);
                Pampanga.accept(me);
                boracay.accept(me);
                Cabanatuan.accept(me);
                America.accept(me);
                Mayon.accept(me);
        
        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod
        
        }
    }
