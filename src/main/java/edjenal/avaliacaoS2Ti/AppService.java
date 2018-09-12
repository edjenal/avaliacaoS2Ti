package edjenal.avaliacaoS2Ti;

public class AppService {
	
	public int questao8(int inteiroA, int inteiroB) {

		String stringA = String.valueOf(inteiroA);
		String stringB = String.valueOf(inteiroB);
		String stringC = "";

		int size = stringA.length() < stringB.length() ? stringA.length() : stringB.length();

		for (int x = 0; x < size; x++) {
			stringC += stringA.charAt(x);
			stringC += stringB.charAt(x);
		}

		if (stringA.length() < stringB.length())
			stringC += stringB.substring(size);

		if (stringA.length() > stringB.length())
			stringC += stringA.substring(size);

		int retorno = Integer.valueOf(stringC);

		if (retorno > 1000000)
			return -1;
		else
			return retorno;
	}
	
	public int questao9(BinaryTree binaryTree) {
		int valor = binaryTree.getValor();

		if (binaryTree.getLeft() != null) {
			valor += questao9(binaryTree.getLeft());
		}

		if (binaryTree.getRight() != null) {
			valor += questao9(binaryTree.getRight());
		}

		return valor;
	}

}
