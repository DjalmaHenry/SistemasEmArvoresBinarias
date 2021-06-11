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

        int cont = arv.passeioContaNo();
        System.out.println("Nós: " + cont);
        
        cont = arv.passeioContaFolha();
        System.out.println("Folhas: " + cont);
        
        cont = arv.passeioContaNaoFinais();
        System.out.println("Não Finais: " + cont);
    }

}
