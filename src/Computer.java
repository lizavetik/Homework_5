import java.util.Scanner;

public class Computer {
//поля процессор, оперативка,жесткий диск, количеситво циклов работы
    String processor;
    int ram;
    String hardDrive;
    static int cyclesOFWork = 5;

    static boolean isComputerOn = false;
    static boolean isComputerAlive = true;

    public void description(){
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Hard drive: " + hardDrive);
        System.out.println("Cycles of work: " + cyclesOFWork);
    }

    public static void putOn(){

        System.out.println("To turn on the computer, place a bet, what number did the computer guess, 0 or 1");

        double i = (double) (Math.round(Math.random()));
        Scanner keyboard = new Scanner(System.in);
        int myint = keyboard.nextInt();

        if(myint == i){
            System.out.println("You winnn!!! Computer is turning on");
            isComputerOn = true;
            isComputerAlive = true;
        }else{
            System.out.println("Computer CRASHED, RIP");
            isComputerAlive = false;
        }
    }
    public static void putOff(){
        System.out.println("To turn off the computer, place a bet, what number did the computer guess, 0 or 1");

        double i = (double) (Math.round(Math.random()));
        Scanner keyboard = new Scanner(System.in);

        int myint = keyboard.nextInt();

        if(myint == i){
            System.out.println("You winnn!!! Computer is turning off");
            isComputerOn = false;
            isComputerAlive = true;
        }else{
            System.out.println("Computer CRASHED, RIP");
            isComputerAlive = false;
        }
    }

    public static void sourseControll() {
            System.out.println("The computer burned down");
        }



    public static void main(String[] args){

        int iterations = 0;
        if(iterations < Computer.cyclesOFWork & isComputerOn == false & isComputerAlive == true){
            Computer.putOn();
        }else{
            sourseControll();
        }
        if(iterations < Computer.cyclesOFWork & isComputerOn == true & isComputerAlive == true){
            Computer.putOff();
            iterations ++;
        }else{
            sourseControll();
        }
    }
}
