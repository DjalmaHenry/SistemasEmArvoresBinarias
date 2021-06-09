package sistemasemarvoresbinarias;

import br.unicap.ed1.ArvoresBinarias.ABB;

public class SistemasEmArvoresBinarias {

    public static void main(String[] args) {
        ABB arv = new ABB();
        
        arv.insertSemRecursao(10);
        arv.insertSemRecursao(100);
        arv.insertSemRecursao(50);
        arv.insertSemRecursao(20);
        arv.insertSemRecursao(30);
        
        arv.emOrdem();
    }
    
}
