
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas= 1;
		boolean acompanhado;
		
		
		if (quantidadePessoas >=2) {
			acompanhado = true;
		}
		else {
			acompanhado = false;
		}
		
		System.out.println("Valor acompanhado =" + acompanhado);
		if (idade >= 18 || acompanhado) {
			
			System.out.println("Voce é maior de 18 anos");
			System.out.println("Seja bem vindo");
		}
		else {
				System.out.println("infelizmente vc nao pode entrar");
			}
			
		}

}


