public class Car {
    private String model;
    private String name;
    private int speed;

    public Car(String model, String name, int speed) {
        this.model = model;
        this.name = name;
        this.speed = speed;
    }

    public void print () {
        System.out.println("Modellen är " + this.model + " och körs av " + this.name + " och körs i " + this.speed + " km/h ");
    }
    public void StartCar() {
        this.speed = 0;
        System.out.println("Bil model " + this.model + " som körs av "  + this.name + " har startat");
    }
    public void StopCar() {
        if (this.speed < 0){
        System.out.println(this.name + " kan inte stanna för hen har inte startat än");
        
        }
        else { 
           this.speed = -1;
        System.out.println(this.name + " har stannat");

        }
    }
    public void increaseSpeed () {
        if (this.speed >= 0) {
        this.speed = this.speed + 20;
        System.out.println(this.name + " Har ökat hastighet och kör nu i " + this.speed);
        } else {
            System.out.println(this.name + " har inte startat bilen än");
        }
    }
    public void decreaseSpeed () {
        if (this.speed >= 20) {
        this.speed = this.speed - 20;
        System.out.println(this.name + " Har ökat hastighet och kör nu i " + this.speed);
        }
        else {
            this.speed = 0;
        }


    }
    }
