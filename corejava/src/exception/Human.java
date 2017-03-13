package exception;

/**
 * @author hochean by 2017/3/7
 */
class Annoyance extends Exception {
    private static final long serialVersionUID = 7114626907989144914L;
}

class Sneeze extends Annoyance {
    private static final long serialVersionUID = 152689765156342740L;
}

class Human {

    //Caught Annoyance
    //Caught Sneeze
    //Hello World!

    public static void main(String[] args) throws Exception {
        try {
            try {
                throw new Sneeze();
            } catch (Annoyance a) {
                System.out.println("Caught Annoyance");
                throw a;//a : exception.Sneeze
            }
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } finally {
            System.out.println("Hello World!");
        }
    }
}
