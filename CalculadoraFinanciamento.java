public class CalculadoraFinanciamento{
public static void main(String[] args) {
    int valorDoCarro = 10000;
    int duracaoDoEmprestimo = 3;
    int taxadeJuros = 5;
    int valorEntrada = 2000;
    if (duracaoDoEmprestimo <= 0 || taxadeJuros <= 0 ){
        System.out.println("Erro! Voce deve fazer um empréstimo válido");
    }else if(valorEntrada >= valorDoCarro){
        System.out.println("O carro pode ser pago inteiramente");
    }else{
        int saldoRestante = valorDoCarro - valorEntrada;
        int numeroDeMeses = duracaoDoEmprestimo * 12;
        int saldoMensal = saldoRestante / numeroDeMeses;
        int juros = saldoMensal * taxadeJuros / 100;
        int pagamentoMensal = saldoMensal + juros;
        System.out.println("O pagamento mensal do seu carro é: $"+pagamentoMensal);
    }
    }
}