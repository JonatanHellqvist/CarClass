import java.util.Scanner;

public class RaceTrack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int menuOption = 0;

        Car car1 = new Car("Volvo 240","Börje Lundin",-1);
        Car car2 = new Car("Volvo 142","Börje Lundin2",-1);
        Car car3 = new Car("Volvo 245","Börje Lundin3",-1);
        System.out.println("Vad heter du?");
        String name = input.nextLine();
        System.out.println("Modellen på bilen: ");
        String model = input.nextLine();
        Car userCar = new Car(model,name,0);

        while(run) {

        
        System.out.println("Vad vill du göra? \n1. Starta\n2. Stoppa \n3. Öka hastigheten \n4. Minska hastigheten");
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1: {
                    userCar.StartCar();
                    break;
                }
                case 2: {
                    userCar.StopCar();
                    break;
                }
                case 3:
                {
                    userCar.increaseSpeed();
                    break;
                }
                case 4: {
                    userCar.decreaseSpeed();
                    break;
                }
            }
        }
        

        /*car1.print();
        car1.StartCar();
        car1.increaseSpeed();
        car1.increaseSpeed();
        car1.increaseSpeed();
        car1.decreaseSpeed();
        car1.StopCar();
        car2.increaseSpeed();*/

        


    }
}
