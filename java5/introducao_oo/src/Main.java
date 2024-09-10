public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto(
                "Coca-Cola", 5.0, "Refrigerante de cola", 4);

        var produto2 = new Produto(
                "Guaraná Antartica", 4.0, "Refrigerante de guaraná", 4);


        produto1.adicionarestoque(5);
        System.out.println(produto1);

    }

}