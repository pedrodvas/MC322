package Reflection;
import java.lang.reflect.*;
import membro.*;
import multimidia.*;

public class CReflection {
    // Imprime os metodos para cada classe.
    public static void printaMetodosEstudante(){
        Class<?> classeEstudante = Estudante.class;
        System.out.println("Os métodos de  " + classeEstudante.getName() + "são:");
        Method[] metodos = classeEstudante.getMethods();
        for (Method metodo : metodos){
            System.out.println("Nome do método: " + metodo.getName());
            try{
                if (metodo.getParameterCount() == 0){
                    Object resultado = metodo.invoke(classeEstudante);
                    System.out.println("Resultado do método: " + resultado);
                }
            }
            catch (Exception excecao){
                System.out.println("Erro ao invocar o método: " + excecao.getMessage());
            }
        }
        System.out.println("-----");
    }

    public static void printaMetodosFuncionario(){
        Class<?> classeFuncionario = Funcionario.class;
        System.out.println("Os métodos de  " + classeFuncionario.getName() + "são:");
        Method[] metodos = classeFuncionario.getMethods();
        System.out.println("Os métodos de  " + classeFuncionario.getName() + "são:");
        for (Method metodo : metodos){
            System.out.println("Nome do método: " + metodo.getName());
            try{
                if (metodo.getParameterCount() == 0){
                    Object resultado = metodo.invoke(classeFuncionario);
                    System.out.println("Resultado do método: " + resultado);
                }
            }
            catch (Exception excecao){
                System.out.println("Erro ao invocar o método: " + excecao.getMessage());
            }
        }
        System.out.println("-----");
    }

    public static void printaMetodosProfessor(){
        Class<?> classeProfessor = Professor.class;
        System.out.println("Os métodos de  " + classeProfessor.getName() + "são:");
        Method[] metodos = classeProfessor.getMethods();
        System.out.println("Os métodos de  " + classeProfessor.getName() + "são:");
        for (Method metodo : metodos){
            System.out.println("Nome do método: " + metodo.getName());
            try{
                if (metodo.getParameterCount() == 0){
                    Object resultado = metodo.invoke(classeProfessor);
                    System.out.println("Resultado do método: " + resultado);
                }
            }
            catch (Exception excecao){
                System.out.println("Erro ao invocar o método: " + excecao.getMessage());
            }
        }
        System.out.println("-----");
    }

    public static void printaMetodosCD(){
        Class<?> classeCD = CD.class;
        System.out.println("Os métodos de  " + classeCD.getName() + "são:");
        Method[] metodos = classeCD.getMethods();
        System.out.println("Os métodos de  " + classeCD.getName() + "são:");
        for (Method metodo : metodos){
            System.out.println("Nome do método: " + metodo.getName());
            try{
                if (metodo.getParameterCount() == 0){
                    Object resultado = metodo.invoke(classeCD);
                    System.out.println("Resultado do método: " + resultado);
                }
            }
            catch (Exception excecao){
                System.out.println("Erro ao invocar o método: " + excecao.getMessage());
            }
        }
        System.out.println("-----");
    }

    public static void printaMetodosDVD(){
        Class<?> classeDVD = DVD.class;
        System.out.println("Os métodos de  " + classeDVD.getName() + "são:");
        Method[] metodos = classeDVD.getMethods();
        System.out.println("Os métodos de  " + classeDVD.getName() + "são:");
        for (Method metodo : metodos){
            System.out.println("Nome do método: " + metodo.getName());
            try{
                if (metodo.getParameterCount() == 0){
                    Object resultado = metodo.invoke(classeDVD);
                    System.out.println("Resultado do método: " + resultado);
                }
            }
            catch (Exception excecao){
                System.out.println("Erro ao invocar o método: " + excecao.getMessage());
            }
        }
        System.out.println("-----");
    }

    public static void printaMetodosLivroDigital(){
        Class<?> classeLivroDigital = LivroDigital.class;
        System.out.println("Os métodos de  " + classeLivroDigital.getName() + "são:");
        Method[] metodos = classeLivroDigital.getMethods();
        System.out.println("Os métodos de  " + classeLivroDigital.getName() + "são:");
        for (Method metodo : metodos){
            System.out.println("Nome do método: " + metodo.getName());
            try{
                if (metodo.getParameterCount() == 0){
                    Object resultado = metodo.invoke(classeLivroDigital);
                    System.out.println("Resultado do método: " + resultado);
                }
            }
            catch (Exception excecao){
                System.out.println("Erro ao invocar o método: " + excecao.getMessage());
            }
        }
        System.out.println("-----");
    }

    public static void printaMetodosLivroFisico(){
        Class<?> classeLivroFisico = LivroFisico.class;
        System.out.println("Os métodos de  " + classeLivroFisico.getName() + "são:");
        Method[] metodos = classeLivroFisico.getMethods();
        System.out.println("Os métodos de  " + classeLivroFisico.getName() + "são:");
        for (Method metodo : metodos){
            System.out.println("Nome do método: " + metodo.getName());
            try{
                if (metodo.getParameterCount() == 0){
                    Object resultado = metodo.invoke(classeLivroFisico);
                    System.out.println("Resultado do método: " + resultado);
                }
            }
            catch (Exception excecao){
                System.out.println("Erro ao invocar o método: " + excecao.getMessage());
            }
        }
        System.out.println("------");
    }

    public static void printaMetodosOutrasMidias(){
        Class<?> classeOutrasMidias = OutrasMidias.class;
        System.out.println("Os métodos de  " + classeOutrasMidias.getName() + "são:");
        Method[] metodos = classeOutrasMidias.getMethods();
        System.out.println("Os métodos de  " + classeOutrasMidias.getName() + "são:");
        for (Method metodo : metodos){
            System.out.println("Nome do método: " + metodo.getName());
            try{
                if (metodo.getParameterCount() == 0){
                    Object resultado = metodo.invoke(classeOutrasMidias);
                    System.out.println("Resultado do método: " + resultado);
                }
            }
            catch (Exception excecao){
                System.out.println("Erro ao invocar o método: " + excecao.getMessage());
            }
        }
        System.out.println("------");
    }

    //Imprime os atributos de cada classe.
    public static void printaAtributosEstudante(){
        Class<?> classeEstudante = Estudante.class;
        Field[] metodos = classeEstudante.getDeclaredFields();
        for (Field metodo : metodos){
            System.out.println("Nome do atributo: " + metodo.getName());
            System.out.println("Tipo do atributo: " + metodo.getType());
            System.out.println("-----");
        }
    }

    public static void printaAtributosProfessor(){
        Class<?> classeProfessor = Professor.class;
        Field[] metodos = classeProfessor.getDeclaredFields();
        for (Field metodo : metodos){
            System.out.println("Nome do atributo: " + metodo.getName());
            System.out.println("Tipo do atributo: " + metodo.getType());
            System.out.println("-----");
        }
    }

    public static void printaAtributosFuncionario(){
        Class<?> classeFuncionario = Funcionario.class;
        Field[] metodos = classeFuncionario.getDeclaredFields();
        for (Field metodo : metodos){
            System.out.println("Nome do atributo: " + metodo.getName());
            System.out.println("Tipo do atributo: " + metodo.getType());
            System.out.println("-----");
        }
    }

    public static void printaAtributosCD(){
        Class<?> classeCD = CD.class;
        Field[] metodos = classeCD.getDeclaredFields();
        for (Field metodo : metodos){
            System.out.println("Nome do atributo: " + metodo.getName());
            System.out.println("Tipo do atributo: " + metodo.getType());
            System.out.println("-----");
        }
    }

    public static void printaAtributosDVD(){
        Class<?> classeDVD = DVD.class;
        Field[] metodos = classeDVD.getDeclaredFields();
        for (Field metodo : metodos){
            System.out.println("Nome do atributo: " + metodo.getName());
            System.out.println("Tipo do atributo: " + metodo.getType());
            System.out.println("-----");
        }
    }

    public static void printaAtributosLivroDigital(){
        Class<?> classeLivroDigital = LivroDigital.class;
        Field[] metodos = classeLivroDigital.getDeclaredFields();
        for (Field metodo : metodos){
            System.out.println("Nome do atributo: " + metodo.getName());
            System.out.println("Tipo do atributo: " + metodo.getType());
            System.out.println("-----");
        }
    }

    public static void printaAtributosLivroFisico(){
        Class<?> classeLivroFisico = LivroFisico.class;
        Field[] metodos = classeLivroFisico.getDeclaredFields();
        for (Field metodo : metodos){
            System.out.println("Nome do atributo: " + metodo.getName());
            System.out.println("Tipo do atributo: " + metodo.getType());
            System.out.println("-----");
        }
    }

    public static void printaAtributosOutrasMidias(){
        Class<?> classeOutrasMidias = OutrasMidias.class;
        Field[] metodos = classeOutrasMidias.getDeclaredFields();
        for (Field metodo : metodos){
            System.out.println("Nome do atributo: " + metodo.getName());
            System.out.println("Tipo do atributo: " + metodo.getType());
            System.out.println("-----");
        }
    }
}