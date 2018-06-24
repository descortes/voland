package juego.walk;

import juego.walk.model.Stage;

public class Walk {

    private Stage level;

    private void init() {
        level = new Stage(500,500);
        level.addPerson();
    }


    private void loop(){
        while(true){
            level.move();
            level.repaint();
            try{
                Thread.sleep(5);
            }catch (Exception e){
                System.out.println("sleep");
            }

        }
    }
    public void run(){
        init();
        loop();
    }




    public static void main(String args[]){
        System.out.println("Walk");
        new Walk().run();
    }
}
