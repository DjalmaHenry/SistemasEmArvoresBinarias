package sistemasemarvoresbinarias;

import br.unicap.ed1.ArvoresBinarias.ABB;

public class SistemasEmArvoresBinarias {

    public static void main(String[] args) {
        ABB arv = new ABB();

        arv.insert(50);
        arv.insert(50);
        arv.insert(100);
        arv.insert(10);
        arv.insert(10);
        arv.insert(10);
        arv.insert(10);
        arv.insert(10);
        arv.insert(20);
        arv.insert(30);
        arv.insert(10);

        System.out.println(arv.passeioContaRepetidos(10));
        System.out.println("--------------------");
        arv.emOrdem();
//        System.out.println("--------------------");
//        arv.emOrdem();
    }

}
