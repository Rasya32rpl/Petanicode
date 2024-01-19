package dasar;

public class Player {
    // definisi atribut
    String name;
    int speed;
    int healthPoin;
    int damage;
    int armor;

    // definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }
    void attack(){
        System.out.println("damage: "+damage);
    }
    void defense(){
        System.out.println("defending: "+armor);
    }

    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }


 
    


   
}

