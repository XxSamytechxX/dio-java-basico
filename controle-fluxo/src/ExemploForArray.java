// ExemploFor.java
public class ExemploForArray {
    public static void main(String[] args) {
	String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" }; //Array = conjunto de elementos separados por vírgula

	for (int x=0; x<alunos.length; x++) { // enquanto "x" for menor que o tamanho de alunos
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]); 
	}

}
}