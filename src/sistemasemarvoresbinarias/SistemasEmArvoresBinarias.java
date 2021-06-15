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

        System.out.println(arv.buscaBinaria(1020));
//        System.out.println("--------------------");
//        arv.passeioEmOrdem();
//        System.out.println("--------------------");
//        arv.emOrdem();
    }

}
