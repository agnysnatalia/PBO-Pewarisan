package pewarisankelas.pewarisanmember;

    public class main {
        public static void main(String[] args) {
        tim mamamoo = new tim("mamamoo");
        
        member m1 = new member("Solar", 29);
        member m2 = new member("Moonbyul", 28);
        trainee t1 = new trainee("Wheein", 25, 3);
        trainee t2 = new trainee("Hwasa", 25, 3);

        mamamoo.addmember(m1); 
        mamamoo.addmember(m2);
        mamamoo.addmember(t1);
        mamamoo.addmember(t2);

        System.out.println("Full Member:");
        mamamoo.displayfullmember();
        System.out.println("\nTrainee");
        mamamoo.displaytrainee();    
        }
    }          
