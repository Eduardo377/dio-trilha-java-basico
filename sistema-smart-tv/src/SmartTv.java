public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void setLigar() {
        ligada=true;
    }
    public void setDesligar() {
        ligada = false;
    }

    public void setAumentarVolume(){
        volume++;
    }

    public void setDiminuirVolume(){
        volume--;
    }

    public void setAumentarCanal(){
        canal++;
    }

    public void setDiminuirCanal(){
        canal--;
    }

    public void setMudarCanal(int novoCanal){
        canal = novoCanal;
    }
}