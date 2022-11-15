// Implements controlador Serve para implementar os metodos abstratos
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
// método contrutor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
// métodos getters e setters
    public int getVolume() {
        return volume;
    }public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
//métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {
        System.out.println("---- MENU -----");
        System.out.println("Está ligado " + this.getLigado());
        System.out.println("Esta tocando "+ this.getTocando());
        System.out.println("Volume " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.println(">");
        }
    }

    @Override
    public void fecharmenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisvolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
          }
        
    }

    @Override
    public void menosvolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void mudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarmudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && ! (this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && (this.getTocando())){
            this.setTocando(false);
        }
    }


}
