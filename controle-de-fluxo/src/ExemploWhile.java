import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0 ) {
            double valorDoce = valorAleatorio();
            /*
            if(valorDoce > mesada)
                valorDoce = mesada;
            */
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;

            
        }
        System.out.println();

        
    }
    private
}
