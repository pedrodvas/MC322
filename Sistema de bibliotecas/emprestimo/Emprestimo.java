package emprestimo;
import membro.Membro;
import multimidia.ItemBiblioteca;
import multimidia.LivroFisico;
import multimidia.CD;
import multimidia.DVD;
import java.time.LocalDate;

//empréstimo é uma composição dos itens acima

public class Emprestimo {
    private Membro membro;
    private ItemBiblioteca item;
    private LocalDate diaRetirada;
    private LocalDate diaDevolucao;

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
        if (item.ehLivro() && item instanceof LivroFisico){
            membro.emprestaLivro((LivroFisico) item);
        }
        else if (item.ehDVD() && item instanceof DVD){
            membro.emprestaDVD((DVD) item);
        }
        else if (item.ehCD() && item instanceof CD){
            membro.emprestaCD((CD) item);
        }
    }

    public void devolvePorMembro(Membro membro, ItemBiblioteca item){
        if (item.ehLivro() && item instanceof LivroFisico){
            membro.devolveLivro((LivroFisico) item);
        }
        else if (item.ehDVD() && item instanceof DVD){
            membro.devolveDVD((DVD) item);
        }
        else if (item.ehCD() && item instanceof CD){
            membro.devolveCD((CD) item);
        }
    }
}
