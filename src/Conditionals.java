public class Conditionals {
    public static void main(String[] args) {
        Conditionals magicEightBall = new Conditionals();
    }//psvm finish


    public Conditionals(){
        String question="Do you like school?";
        System.out.println(question);
        double randomInt = Math.random();

        if (randomInt<0.16){

            System.out.print("Absolutely!");
        } else if (randomInt<0.32&&randomInt>0.16) {

            System.out.print("No!");
        }else if (randomInt<0.48&&randomInt>0.32) {

            System.out.print("Certainly not");
        }else if (randomInt<0.64&&randomInt>0.48) {

            System.out.print("Ask Again");
        }else if (randomInt<0.80&&randomInt>0.64) {

            System.out.print("Please don't ask that");
        }else if (randomInt<0.80&&randomInt>0.96){

            System.out.print("Without a doubt");
        } else {
            System.out.print("Facts you right");
        }
    }


}
