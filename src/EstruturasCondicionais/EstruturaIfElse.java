package EstruturasCondicionais;

public class EstruturaIfElse {
    public static void main(String[] args) {
        int idade = 15;

        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        boolean estaChovendo = true;

        if(!estaChovendo){
            System.out.println("Vamos sair para passear");
        } else {
            System.out.println("Vamos ficar em casa");
        }

        boolean temDinheiro = true;
        boolean temCartao = true;

        if (temDinheiro && temCartao){
            System.out.println("Pede um Ifood e um Zé Delivery");
        } else if (temDinheiro || temCartao) {
            System.out.println("Pede um Ifood");
        } else {
            System.out.println("Não pede nada");
        }

        String mensagem = (temDinheiro) ? "Pede um Ifood" : "Come o que tem em casa"; // expressão Ternária
        System.out.println(mensagem);
        if (temDinheiro){
            System.out.println("Pede um Ifood");
        } else {
            System.out.println("Come oq tem em casa");
        }


    }
}
