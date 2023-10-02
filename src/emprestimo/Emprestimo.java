package emprestimo;
import membro.Membro;
import multimidia.ItemBiblioteca;
import multimidia.LivroDigital;
import multimidia.LivroFisico;
import multimidia.OutrasMidias;
import multimidia.CD;
import multimidia.DVD;
import java.time.LocalDate;

public class Emprestimo {
    private Membro membro;
    private ItemBiblioteca item;
    private LocalDate diaRetirada;
    private LocalDate diaDevolucao; // O membro pode permanecer com o livro por 14 dias, no maximo

    public Emprestimo(Membro membro, ItemBiblioteca item, LocalDate diaRetirada, LocalDate diaDevolucao){
        this.membro = membro;
        this.item = item;
        this.diaDevolucao = diaDevolucao;
        this.diaRetirada = diaRetirada;
    }

    public Membro getMembro(){
        return membro;
    }

    public ItemBiblioteca getItem(){
        return item;
    }

    public LocalDate getDiaRetirada(){
        return diaRetirada;
    }

    public LocalDate getDiaDevolucao(){
        return diaDevolucao;
    }

    public void setMembro(Membro membro){
        this.membro = membro;
    }

    public void setItem(ItemBiblioteca item){
        this.item = item;
    }

    public void setDiaRetirada(LocalDate diaRetirada){
        this.diaRetirada = diaRetirada;
    }

    public void setDiaDevolucao(LocalDate diaDevolucao){
        this.diaDevolucao = diaDevolucao;
    }


    public void emprestaPraMembro(Membro membro, ItemBiblioteca item){
        if (membro.temMulta()){
            System.out.println("Voce tem multas pendentes e nao pode emprestar este item!");
        }
        else{
            if (item.ehLivroFisico() && item instanceof LivroFisico){
            membro.emprestaLivroFisico((LivroFisico) item);
            }

            else if (item.ehLivroDigital() && item instanceof LivroDigital){
            membro.emprestaLivroDigital((LivroDigital) item);
            }

            else if (item.ehDVD() && item instanceof DVD){
            membro.emprestaDVD((DVD) item);
            }

            else if (item.ehCD() && item instanceof CD){
            membro.emprestaCD((CD) item);
            }

            else if (item.ehOutraMidia() && item instanceof OutrasMidias){
            membro.emprestaOutraMidia((OutrasMidias) item);
            }
        }
    }

    public void verificaSeTemMultas(Membro membro){
        LocalDate diaAtual = LocalDate.now();
        if (diaAtual.isAfter(diaDevolucao)){
            System.out.println("Voce esta devolvendo o item com atraso e sera multado!");
            membro.adicionaMulta();
        }
    }

    public void verificaEstadoConservacao(Membro membro, ItemBiblioteca item, String estadoAtual){
        // Essa funcao verifica se o estado de conservacao do item esta diferente de antes. Se estiver, sera aplicada uma multa.
        if ((item instanceof LivroFisico) || (item instanceof CD) || (item instanceof DVD) || (item instanceof OutrasMidias)){
            if (item instanceof LivroFisico){
                String estadoAnterior = ((LivroFisico) item).getEstadoConservação();
                if (!estadoAnterior.equals(estadoAtual)){
                    System.out.println("O estado de atual do item esta diferente de antes! Voce sera multado.");
                    membro.adicionaMulta();
                }
            }
            else if (item instanceof DVD){
                String estadoAnterior = ((DVD) item).getEstadoConservação();
                if (!estadoAnterior.equals(estadoAtual)){
                    System.out.println("O estado de atual do item esta diferente de antes! Voce sera multado.");
                    membro.adicionaMulta();
                }
            }
            else if (item instanceof CD){
                String estadoAnterior = ((CD) item).getEstadoConservação();
                if (!estadoAnterior.equals(estadoAtual)){
                    System.out.println("O estado de atual do item esta diferente de antes! Voce sera multado.");
                    membro.adicionaMulta();
                }
            }
            else if (item instanceof OutrasMidias){
                String estadoAnterior = ((OutrasMidias) item).getEstadoConservação();
                if (!estadoAnterior.equals(estadoAtual)){
                    System.out.println("O estado de atual do item esta diferente de antes! Voce sera multado.");
                    membro.adicionaMulta();
                }
            }
        }
    }

    public void devolvePorMembro(Membro membro, ItemBiblioteca item, String estadoConservacao){
        verificaSeTemMultas(membro);
        verificaEstadoConservacao(membro, item, estadoConservacao); // Se o item for um livro digital, sera sinalizado que eh digital e nao importara

        if (item.ehLivroFisico() && item instanceof LivroFisico){
            membro.devolveLivroFisico((LivroFisico) item);
        }

        else if (item.ehLivroDigital() && item instanceof LivroDigital){
            membro.devolveLivroDigital((LivroDigital) item);
        }

        else if (item.ehDVD() && item instanceof DVD){
            membro.devolveDVD((DVD) item);
        }

        else if (item.ehCD() && item instanceof CD){
            membro.devolveCD((CD) item);
        }

        else if (item.ehOutraMidia() && item instanceof OutrasMidias){
            membro.devolveOutraMidia((OutrasMidias) item);
        }

    }

}
