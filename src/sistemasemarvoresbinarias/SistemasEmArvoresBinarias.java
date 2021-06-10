package sistemasemarvoresbinarias;

import br.unicap.ed1.ArvoresBinarias.ABB;

public class SistemasEmArvoresBinarias {

    public static void main(String[] args) {
        ABB arv = new ABB();

        arv.insert(50);
        arv.insert(100);
        arv.insert(10);
        arv.insert(20);
        arv.insert(30);

        int cont = arv.contaNo(arv.getRaiz());
        System.out.println("Nós: " + cont);
        
        cont = arv.contaFolha(arv.getRaiz());
        System.out.println("Folhas: " + cont);
        
        cont = arv.contaNaoFinais(arv.getRaiz());
        System.out.println("Não Finais: " + cont);
    }

}
