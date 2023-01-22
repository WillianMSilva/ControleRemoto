public class App {
    public static void main(String[] args) throws Exception {

        //projeto de aprendizado de encapsulamento
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.menosvolume();
        c.menosvolume();
       // c.desligar();
       c.mudo();




// sempre deixar a exbição do menu por último.
        c.abrirmenu();
        
    }
}
