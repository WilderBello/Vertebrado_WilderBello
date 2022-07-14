public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados() {
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Camello", "Mamífero");
        miVertebrados[1] = new Vertebrado("Vaca", "Mamífero");
        miVertebrados[2] = new Vertebrado("Tiburón", "Pez");
        miVertebrados[2] = new Vertebrado("Paloma", "Ave");

        return miVertebrados;
    }
}
