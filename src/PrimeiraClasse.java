public class PrimeiraClasse {
    public static void main(String args[]){

        System.out.println("Olá Anderson");
        Aluno aluno = new Aluno();
        aluno.cadastrarNomeAluno("Anderson");
        aluno.setCodigo(1);
        System.out.println(aluno.getCodigo());
        /**
         * este é um código de cadastro de alunos e professores em uma plataforma de cursos online.
         */
        String end = aluno.retornarCpfAluno();
        System.out.println(end);
    }
}
