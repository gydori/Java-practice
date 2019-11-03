public class Main {

    public static void main(String[] args) {
        //min(args);
        //max(args);
        //sum(args);
        //avg(args);
        //maxmin(args);
        //poz(args);
        //neg(args);
        //nulla(args);
        //oddEven(args);
        //whole(args);
        //seriesAr(args);
        //seriesGeom(args);
        //seriesFibo(args);
        //words(args);
        //triangle(args);
        //dice(args);
        //ascOrDesc(args);
        //order(args);
        //polygon(args);
        //book(args);
        //calc(args);
        //calckompl(args);
        //crumb(args);
        //melon(args);
        //maxDist(args);
        advert(args);
    }

    public static void min(String[] args) {

        if (args.length < 2) {
            System.out.println("Nincs elég bemenet.");
        } else {
            int min = Integer.parseInt(args[0]);
            for (int i = 0; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < min) {
                    min = Integer.parseInt(args[i]);
                }
            }
            System.out.println("A minimum: " + min);
        }

    }

    public static void max(String[] args) {

        if (args.length < 2) {
            System.out.println("Nincs elég bemenet.");
        } else {
            int max = Integer.parseInt(args[0]);
            for (int i = 0; i < args.length; i++) {
                if (Integer.parseInt(args[i]) > max) {
                    max = Integer.parseInt(args[i]);
                }
            }
            System.out.println("A maximum: " + max);
        }

    }

    public static void sum(String[] args) {

        if (args.length < 2) {
            System.out.println("Nincs elég bemenet.");
        } else {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("Az összeg: " + sum);
        }

    }

    public static void avg(String[] args) {

        if (args.length < 2) {
            System.out.println("Nincs elég bemenet.");
        } else {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            double avg = (double) sum / args.length;
            System.out.println("Az átlag: " + avg);
        }

    }

    public static void maxmin(String[] args) {
        if (args.length < 2) {
            System.out.println("Nincs elég bemenet");
        } else {
            int min = Integer.parseInt(args[0]);
            int max = Integer.parseInt(args[0]);
            for (int i = 0; i < args.length; i++) {
                int a = Integer.parseInt(args[i]);
                if (min < 0) {
                    min = a;
                } else {
                    if (a >= 0 && a < min) {
                        min = a;
                    }
                }
                if (max >= 0) {
                    max = a;
                } else {
                    if (a < 0 && a > max) {
                        max = a;
                    }
                }
            }
            if (min < 0) {
                System.out.println("Nincs pozitív szám");
            } else if (max >= 0) {
                System.out.println("Nincs negatív szám");
            } else {
                System.out.println("Legkisebb pozitív: " + min + " Legnagyobb negatív: " + max);
            }
        }
    }

    public static void poz(String[] args) {
        if (args.length == 0) {
            System.out.println("Nincs bemeneti paraméter");
        } else {
            int count = 0;
            for (int i = 0; i < args.length; i++) {
                int a = Integer.parseInt(args[i]);
                if (a > 0) {
                    count++;
                }
            }
            System.out.println("A pozitív számok száma: " + count);
        }
    }

    public static void neg(String[] args) {
        if (args.length == 0) {
            System.out.println("Nincs bemeneti paraméter");
        } else {
            int count = 0;
            for (int i = 0; i < args.length; i++) {
                int a = Integer.parseInt(args[i]);
                if (a < 0) {
                    count++;
                }
            }
            System.out.println("A negatív számok száma: " + count);
        }
    }

    public static void nulla(String[] args) {
        if (args.length == 0) {
            System.out.println("Nincs bemeneti paraméter");
        } else {
            int count = 0;
            for (int i = 0; i < args.length; i++) {
                int a = Integer.parseInt(args[i]);
                if (a == 0) {
                    count++;
                }
            }
            System.out.println("A nullák száma: " + count);
        }
    }

    public static void oddEven(String[] args) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < args.length; i++) {
            int a = Integer.parseInt(args[i]);
            if (a % 2 == 0) {
                even += a;
            } else {
                odd += a;
            }
        }
        System.out.println("Páros számok összege: " + even);
        System.out.println("Páratlan számok összege: " + odd);
        if (even > odd) {
            System.out.println("A páros számok összege a nagyobb.");
        } else {
            System.out.println("A páratlan számok összege a nagyobb.");
        }
    }

    public static void whole(String[] args) {
        if (args.length != 2) {
            System.out.println("Nem megfelelő számú paraméter");
        } else {
            try {
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[1]);
                for (int i = x; i < y; i++) {
                    System.out.print(i + " ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nem megfelelő formátum.");
            }
        }
    }

    public static void seriesAr(String[] args) {
        if (args.length != 3) {
            System.out.println("Nem megfelelő számú paraméter.");
        } else {
            int a = Integer.parseInt(args[0]);
            int d = Integer.parseInt(args[1]);
            int n = Integer.parseInt(args[2]);
            int[] seri = new int[n];

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    seri[i] = a;
                } else {
                    seri[i] = seri[i - 1] + d;
                }
                System.out.print(seri[i] + " ");
            }
        }
    }

    public static void seriesGeom(String[] args) {
        if (args.length != 3) {
            System.out.println("Nem megfelelő számú paraméter.");
        } else {
            int a = Integer.parseInt(args[0]);
            int q = Integer.parseInt(args[1]);
            int n = Integer.parseInt(args[2]);
            int[] seri = new int[n];

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    seri[i] = a;
                } else {
                    seri[i] = seri[i - 1] * q;
                }
                System.out.print(seri[i] + " ");
            }
        }
    }

    public static void seriesFibo(String[] args) {
        if (args.length != 1) {
            System.out.println("Nem megfelelő számú paraméter.");
        } else {
            int n = Integer.parseInt(args[0]);
            int[] seri = new int[n];
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    seri[i] = 0;
                } else if (i == 1) {
                    seri[i] = 1;
                } else {
                    seri[i] = seri[i - 1] + seri[i - 2];
                }
                System.out.print(seri[i] + " ");
            }
        }
    }

    public static void words(String[] args) {
        if (args.length == 0) {
            System.out.println("Nincs bemeneti paraméter");
        } else {
            int[] wordsLength = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                wordsLength[i] = args[i].length();
            }
            String[] words = new String[wordsLength.length];
            for (int i = 0; i < wordsLength.length; i++) {
                int count = 0;
                for (int j = 0; j < wordsLength.length; j++) {
                    if (wordsLength[i] == wordsLength[j]) {
                        count++;
                    }
                }
                words[i] = wordsLength[i] + " hosszú szóból " + count + " db van.";
                //System.out.println(words[i]);
            }
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        words[j] = "0";
                    }
                }
                System.out.println(words[i]);
            }
        }
    }

    public static void triangle(String[] args) {
        if (args.length != 3) {
            System.out.println("Nincs elég bemenet");
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            if (a + b < c || a + c < b || c + b < a) {
                System.out.println("Ez nem háromszög");
            } else {
                double dist = (double) a + b + c;
                double area = Math.sqrt(dist / 2 * (dist / 2 - a) * (dist / 2 - b) * (dist / 2 - c));
                System.out.println("Kerület: " + dist + " Kerület: " + area);
            }
        }
    }

    public static void dice(String[] args) {
        if (args.length != 1) {
            System.out.println("Nem megfelelő bemenet");
        } else {
            int n = Integer.parseInt(args[0]);
            int[] numArr = {0, 0, 0, 0, 0, 0};
            for (int i = 0; i < n; i++) {
                int num = (int) Math.floor(Math.random() * 6) + 1;
                switch (num) {
                    case 1:
                        numArr[0] = numArr[0] + 1;
                        break;
                    case 2:
                        numArr[1] = numArr[1] + 1;
                        break;
                    case 3:
                        numArr[2] = numArr[2] + 1;
                        break;
                    case 4:
                        numArr[3] = numArr[3] + 1;
                        break;
                    case 5:
                        numArr[4] = numArr[4] + 1;
                        break;
                    case 6:
                        numArr[5] = numArr[5] + 1;
                        break;
                }
            }
            String[] numArrS = new String[numArr.length];
            for (int i = 0; i < numArr.length; i++) {
                numArrS[i] = (i + 1) + "-ből " + numArr[i] + " db van.";
                System.out.println(numArrS[i]);
            }
            String[] numPerc = new String[numArr.length];
            for (int i = 0; i < numArr.length; i++) {
                numPerc[i] = (i + 1) + "-ből " + ((double) numArr[i] / n * 100) + " % van.";
                System.out.println(numPerc[i]);
            }
        }
    }

    public static void ascOrDesc(String[] args) {
        if (args.length < 2) {
            System.out.println("Nincs elég bement");
        } else {
            int countAsc = 0;
            int countDesc = 0;
            for (int i = 1; i < args.length; i++) {
                int a = Integer.parseInt(args[i]);
                int b = Integer.parseInt(args[i - 1]);
                if (a > b) {
                    countAsc++;
                } else {
                    countDesc++;
                }
            }
            if (countAsc == args.length - 1) {
                System.out.println("Növekvő");
            } else if (countDesc == args.length - 1) {
                System.out.println("Csökkenő");
            } else {
                System.out.println("Egyik sem");
            }
        }
    }

    public static void order(String[] args) {
        if (args.length < 1) {
            System.out.println("Nincs elég bemenet");
        } else {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                int a = Integer.parseInt(args[i]);
                switch (a) {
                    case 1:
                        sum += 1000;
                        break;
                    case 2:
                        sum += 5000;
                        break;
                    case 3:
                        sum += 7000;
                        break;
                    case 4:
                        sum += 9000;
                    default:
                        System.out.println(a + " nem rendes sorszám");
                }
            }
            System.out.println("A rendelés összege: " + sum);
        }
    }

    public static void polygon(String[] args) {
        if (args.length != 2) {
            System.out.println("Nem megfelelő bemenet");
        } else {
            int db = Integer.parseInt(args[0]);
            int hossz = Integer.parseInt(args[1]);
            int kerulet = 0;
            while (db > 0) {
                kerulet += hossz;
                db--;
            }
            System.out.println("A kerület: " + kerulet);
        }
    }

    public static void book(String[] args) {
        if (args.length == 0) {
            System.out.println("Nincs bemenet");
        } else {
            int[] wordsLength = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                wordsLength[i] = args[i].length();
            }
            int max = 0;
            for (int i = 0; i < wordsLength.length; i++) {
                if (wordsLength[max] < wordsLength[i]) {
                    max = i;
                }
            }
            System.out.println("A leghosszabb szó: " + args[max]);
        }
    }

    public static void calc(String[] args) {
        if (args.length != 3) {
            System.out.println("Nem megfelelő számú bemenet");
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
            String op = args[1];
            switch (op) {
                case "+":
                    System.out.println("Az összeg: " + (a + b));
                    break;
                case "-":
                    System.out.println("A különbség: " + (a - b));
                    break;
                case "x":
                    System.out.println("A szorzat: " + (a * b));
                    break;
                case "/":
                    if (b != 0) {
                        System.out.println("A hányados: " + (a / b));
                    } else {
                        System.out.println("Nullával nem osztunk");
                    }
                    break;
                default:
                    System.out.println("Nem megfelelő művelet(+, -, x, /");
            }
        }
    }

    public static void calckompl(String[] args) {
        if (args.length == 0 || args.length != Integer.parseInt(args[0]) * 2 + 2) {
            System.out.println("Nem megfelelő bemenet!");
        } else {
            String[][] calc = new String[args.length / 2 - 1][2];
            int j = 0;
            double result = Double.parseDouble(args[1]);
            int n = Integer.parseInt(args[0]);
            for (int i = 2; i < args.length; i++) {
                if (i % 2 == 0) {
                    calc[j][0] = args[i];
                    calc[j][1] = args[i + 1];
                    j++;
                }
            }
            for (int i = 0; i < calc.length; i++) {
                switch (calc[i][0]) {
                    case "+":
                        result = result + Double.parseDouble(calc[i][1]);
                        break;
                    case "-":
                        result = result - Double.parseDouble(calc[i][1]);
                        break;
                    case "x":
                        result = result * Double.parseDouble(calc[i][1]);
                        break;
                    case "/":
                        if (Double.parseDouble(calc[i][1]) != 0) {
                            result = result / Double.parseDouble(calc[i][1]);
                        } else {
                            System.out.println("Nullával nem osztunk");
                        }
                        break;
                    default:
                        System.out.println("Nem megfelelő művelet(+, -, x, /");
                }
            }
            System.out.println(result);

        }
    }

    public static void crumb(String[] args) {
        if (args.length != 1) {
            System.out.println("Nem megfelelő bemenet");
        } else {
            int n = Integer.parseInt(args[0]);
            int[] crumb = new int[n];
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    crumb[0] = 3;
                } else if (i == 1) {
                    crumb[1] = 2;
                } else {
                    crumb[i] = crumb[i - 1] + crumb[i - 2];
                }
            }
            System.out.println("Az " + n + "-dik kereszteződésben " + crumb[n - 1] + " morzsát szórtak ki.");
        }
    }

    public static void melon(String[] args) {
        if (args.length == 0) {
            System.out.println("Nem kaptam bemenetet.");
        } else {
            int count = 0;
            for (int i = 0; i < args.length; i++) {
                int a = Integer.parseInt(args[i]);
                if (a % 6 == 0) {
                    count++;
                }
            }
            System.out.println("A rohadt dinnyék száma: " + count);
        }
    }

    public static void maxDist(String[] args) {
        if (args.length == 0 || args.length != Integer.parseInt(args[0]) * 3 + 1) {
            System.out.println("Nem megfelelő bemenet");
        } else {
            int[] dists = new int[Integer.parseInt(args[0])];
            int j = 0;
            for (int i = 1; i < args.length; i++) {
                int dist = 0;
                if (i % 3 == 1) {
                    int a = Integer.parseInt(args[i]);
                    int b = Integer.parseInt(args[i + 1]);
                    int c = Integer.parseInt(args[i + 2]);
                    dist = a + b + c;
                    dists[j] = dist;
                    j++;
                }
            }
            int max = 0;
            for (int i = 0; i < dists.length; i++) {
                if (dists[i] > dists[max]) {
                    max = i;
                }
            }
            System.out.println("Az " + (max + 1) + "-dik háromszög kerülete a legnagyobb.");
        }
    }

    public static void advert(String[] args) {
        if (args.length != 3) {
            System.out.println("Nem megfelelő bemenet.");
        } else {
            int n = Integer.parseInt((args[2]));
            for (int i = 0; i < n; i++) {
                if (i % 5 == 4) {
                    System.out.println(args[1]);
                } else {
                    System.out.println(args[0]);
                }
            }
        }
    }
}
