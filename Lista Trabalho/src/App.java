import java.util.Scanner;

public class App {
    static List list = new LinkedList();

    static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String message){

        System.out.println(message);
        int value = scanner.nextInt();
        return value;
        
    }
    public static void outputText(String message){
        System.out.println(message);
    }
    public static void insertOp(){
        int num = inputInt("Informe o Numero: ");
        list.add(num);
    }
    public static void search(){
        int num = inputInt("Informe o Numero: ");
        System.out.println("\n" + "-->>"+ list.search(num) + "<<--"+ "\n");
    }
    public static void showOp(){
        outputText("mostrando.. \n" + list.show());
    }
    public static void removeOp(){
        int num = inputInt("Informe o numero: ");
		list.remove(num);
    }
    public static void updateOp() {
		int num = inputInt("Informe o numero: ");

		int pos = inputInt("Informe a posicao: ");

		list.update(pos, num);
    }
    public static void main(String[] args){
        boolean toBeContinue = true;
        
        while(toBeContinue){
            int option = inputInt("Informe a opcao desejada:"
					+ "\n 0 - Parar"
					+ "\n 1 - Inserir"
					+ "\n 2 - Listar"
					+ "\n 3 - Atualizar"
					+ "\n 4 - Remover"
					+ "\n 5 - Prorcurar\n>> ");
          if(option == 0){
            toBeContinue = false;
				outputText("Teminando Aplicacao...");
			} else if (option == 1) {
				insertOp();
			} else if (option == 2) {
			    showOp();
			} else if (option == 3) {
				updateOp();
			} else if (option == 4) {
				removeOp();
			}else if  (option == 5){
				search();
			}else {
				outputText("Opção invalida...");
          }
        }
     }
}