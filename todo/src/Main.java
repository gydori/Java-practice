import todolist.Bevasarlas;
import todolist.Megbeszeles;
import todolist.Teendo;

public class Main {
    public static void main(String[] args) {
        Teendo[] teendoList = new Teendo[args.length / 4];
        int j = 0;
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "Teendo":
                    Teendo teendo = new Teendo(args[i + 1], args[i + 2], Integer.parseInt(args[i + 3]));
                    teendoList[j++] = teendo;
                    break;
                case "Megbeszeles":
                    Megbeszeles megbeszeles = new Megbeszeles(args[i + 1], args[i + 2], args[i + 3]);
                    teendoList[j++] = megbeszeles;
                    break;
                case "Bevasarlas":
                    Bevasarlas bevasarlas = new Bevasarlas(args[i + 1], args[i + 2], Integer.parseInt(args[i + 3]));
                    teendoList[j++] = bevasarlas;
                    break;
            }
        }
        teendok(teendoList);
    }

    public static void teendok(Teendo[] teendoList) {
        for (int j = 1; j < 6; j++) {
            for (int i = 0; i < teendoList.length; i++) {
                if (teendoList[i].getPrior() == j && teendoList[i].getReady() == false) {
                    System.out.println(teendoList[i]);
                    teendoList[i].atvalt();
                }
            }
        }
    }
}
