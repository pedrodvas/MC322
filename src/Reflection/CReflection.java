package Reflection;
import java.lang.reflect.*;
import membro.*;

public class CReflection {
    public static void printaMetodosEstudante() {

        Class<?> classeEstudante = Estudante.class;

        System.out.println("Os métodos de  " + classeEstudante.getName() + "são:");
        Method[] metodos = classeEstudante.getMethods();
        for (Method metodo : metodos) {
            System.out.println(metodo.getName());
        }
    }

    public static void printaMetodosFuncionario() {

        Class<?> classeFuncionario = Funcionario.class;

        System.out.println("Os métodos de  " + classeFuncionario.getName() + "são:");
        Method[] metodos = classeFuncionario.getMethods();
        for (Method metodo : metodos) {
            System.out.println(metodo.getName());
        }
    }

    public static void printaMetodosProfessor() {

        Class<?> classeProfessor = Professor.class;

        System.out.println("Os métodos de  " + classeProfessor.getName() + "são:");
        Method[] metodos = classeProfessor.getMethods();
        for (Method metodo : metodos) {
            System.out.println(metodo.getName());
        }
    }

    
}
