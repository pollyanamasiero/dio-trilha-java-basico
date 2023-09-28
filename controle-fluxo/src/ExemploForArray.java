public class ExemploForArray {
    public static void main(String[] args) {
        
        //em arrays o indice inicia em ZERO
        String alunos[] = {"POLLYANA", "KENDRYA", "KHALEESI", "BANGUELA"};

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        
        // for (int x=0; x<alunos.length; x++){
        //     System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        // }

    }
}
