package poo;



public class Methods {

    public void playMusic(){
        System.out.println("Music playing...");
    }

    public String getMeApen(int cost){
        return "pen";
    }


    public static void main(String[] args) {


        Methods music = new Methods();
        music.playMusic();
        music.getMeApen(10);



    }
}
