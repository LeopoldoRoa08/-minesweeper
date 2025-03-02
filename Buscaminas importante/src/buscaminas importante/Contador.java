/**
 *
 * @author ricardo
 */
public class Contador {
    private int segundos;

    public Contador() {
    }


    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void timer_begin(boolean stop){
    int segundo = getSegundos();
    while(stop!=false){
    System.out.println("Cronometro:" + segundo);
    delay();
    segundo++;}
    
    }
    
    private void delay(){
    try{
        Thread.sleep(1000);
    }catch(Exception e){
    }
    }
}
