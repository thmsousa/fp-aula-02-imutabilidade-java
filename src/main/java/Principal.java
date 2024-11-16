import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        CidadeRecord cidadeRecord = new CidadeRecord("São Paulo");
        System.out.println("CidadeRecord: " + cidadeRecord.nome());

        Cidade cidade = new Cidade("Rio de Janeiro");
        System.out.println("Cidade inicial (Classe Cidade): " + cidade.getNome());
        cidade.setNome("Belo Horizonte");
        System.out.println("Cidade alterada (Classe Cidade): " + cidade.getNome());

        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("João", cidade);
        System.out.println("PessoaRecordShallow - Nome: " + pessoaShallow.nome() +
                ", Cidade: " + pessoaShallow.cidade().getNome());

        cidade.setNome("Curitiba");
        System.out.println("Após alterar cidade mutável:");
        System.out.println("PessoaRecordShallow - Nome: " + pessoaShallow.nome() +
                ", Cidade: " + pessoaShallow.cidade().getNome());

        PessoaRecord pessoaRecord = new PessoaRecord("Maria", new CidadeRecord("Fortaleza"));
        System.out.println("PessoaRecord - Nome: " + pessoaRecord.nome() +
                ", Cidade: " + pessoaRecord.cidade().nome());

    }
}