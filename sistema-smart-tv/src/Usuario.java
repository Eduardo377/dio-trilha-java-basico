public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        
        System.out.println("Tv ligada?: " + smartTv.ligada);
        System.out.println("Canal atual?: " + smartTv.canal);
        System.out.println("VOlume atual?: " + smartTv.volume);

        smartTv.setLigar();

        System.out.println("Novo status -> TV ligada? : " + smartTv.ligada);

        smartTv.setDesligar();

        System.out.println("Novo status -> TV ligada? : " + smartTv.ligada);
        smartTv.setDiminuirVolume();
        smartTv.setDiminuirVolume();
        smartTv.setDiminuirVolume();
        smartTv.setAumentarVolume();
        
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("Canal Atual: " + smartTv.canal);
        
        smartTv.setMudarCanal(13);
        
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
