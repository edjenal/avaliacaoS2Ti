package edjenal.avaliacaoS2Ti;

import edjenal.avaliacaoS2Ti.AppService;
import edjenal.avaliacaoS2Ti.BinaryTree;

/**
 * 
 *
 */
public class App {
	
	public static void main(String[] args) {
		AppService appService = new AppService();
		System.out.println(appService.questao8(10256,512));
		
		BinaryTree binaryTree4 = new BinaryTree(40, null, null);
		BinaryTree binaryTree3 = new BinaryTree(3, binaryTree4, null);
		BinaryTree binaryTree2 = new BinaryTree(2, null, null);
		BinaryTree binaryTree1 = new BinaryTree(1, binaryTree2, binaryTree3);
		
		System.out.println(appService.questao9(binaryTree1));
	}
}
