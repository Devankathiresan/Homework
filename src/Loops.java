public class Loops {
    public static void main(String[] args) {
        Loops Zipper = new Loops();
    }
    public Loops(){
        countUp();
        countByThrees();
        countDown();
    }//end of loops method
    public void countUp(){
        for (int i=1;i<6;i=i+1){
            System.out.println(i);
        }
    }// loop code goes inside this method
    public void countByThrees(){
        for (int i=3; i<16; i=i+3){
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public void countDown(){
        for (int i=10; i>0; i=i-1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Happy loop year");
    }


}//end of class - nothing outside this gets run
