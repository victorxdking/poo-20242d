package br.edu.fatecfranca.exe1;

public class Cidade {

    public void contrata(Professor p){
        p.ensina();
        p.trabalha();
    }
    // sobrecarga de métodos
    public void contrata(Empregado e){
        e.trabalha();
    }
    public cobraDe(Contribuinte c){
        c.pagaIR();
    }

    public void registra(Cidadao c){
        c.tiraRg();
    }

    public void alimenta(Animal a){
        a.come();
    }
}
