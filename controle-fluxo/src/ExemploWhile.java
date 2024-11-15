import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
      
        while(mesada>0) {    /*enquanto a mesada for maior que 0 */
            Double valorDoce = valorAleatorio();  /*joao vai pegar um doce de vaor aleatorio */
          
            if(valorDoce > mesada) /*se o valor de doce for igual a mesada */
            valorDoce = mesada; /*o valor do doce fica igual o valor da mesada para não ter que refazer varias verificações  */
            
            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("mesada:" + mesada);
        System.out.println("Joãozinho gastou a sua mesada e doces");

    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
