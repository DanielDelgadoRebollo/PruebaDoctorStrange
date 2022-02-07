package com.example.doctorstrange.Juego;

public class Escenario {
    String nombreEscenario;
    double monedas;
    int miembros,movimientos,energiaVital;

    public Escenario(String nombreEscenario, double monedas, int miembros, int movimientos, int energiaVital) {
        this.nombreEscenario = nombreEscenario;
        this.monedas = monedas;
        this.miembros = miembros;
        this.movimientos = movimientos;
        this.energiaVital = energiaVital;
    }
     /*Sanctum Sanctorum11. La mansión del Doctor Stephen Strange se encuentra en el número
177A de Bleecker Street, en New York City. Justo en la esquina de Bleecker Street con
Fenno Palace, en pleno corazón de Greenwich Village. Conocida como Sanctum Sanctorum,
la mansión sirve como residencia del doctor y, con anterioridad, sirvió como cuartel general
de los Defenders y de New Avengers. Es, además, el lugar con mayor concentración de
fenómenos místicos y esotéricos en la actualidad.
Es un sitio pequeño y angosto, por lo tanto, cualquier batalla que tenga lugar allí no puede
tener muchos contrincantes. Así, este escenario establece una cantidad de 10000 monedas
iniciales para cada jugador, un tamaño de 10 miembros por equipo y un número de 10
movimientos por cada miembro. La energía vital con la que contará cada superhéroe en
este escenario será de 100 unidades.
Eso sí, ¿quién no querría batallar allí para poder hacerse con el control de sus misterios
ocultos?
Stark Tower 12

. La Stark Tower fue diseñada por Tony Stark con la intención de que se

convirtiese en un faro de la arquitectura moderna. El edificio fue construido en la inter-
sección de la 58 con Broadway, en el vecindario de Columbus Circle, a aproximadamente

10 bloques al norte del Baxter Building, cuartel general de los Fantastic Four. Al poco de
inaugurarse el edificio, y después de la formación de los New Avengers, Stark donó los tres
pisos finales para que sirviesen de base de operaciones del equipo. De esta manera, pasó a ser
denominada informalmente como “Avengers Tower”.
Sus inmensas plantas pueden ser el lugar perfecto para una batalla de grandes superhéroes.
Éste escenario ofrecerá 20000 monedas iniciales a cada jugador para que desarrollen una
intrépida lucha, el numero de miembros por equipo será de 20 y el número de movimientos
por superhéroe de 25. Los superhéroes contarán con 200 unidades de energía vital.
Xavier’s School for Gifted Youngsters13

. Massachusetts Academy fue un colegio fundado
en 1700 en Berkshire Mountains of Snow Valley, Massachusetts. La academia fue uno
de los colegios más antiguos y respetados de los Estados Unidos. Tras varios cambios de
dirección, se hizo cargo de ella el Professor Charles Xavier que lo convirtió en un centro de
enseñanzas para mutantes. Hoy es un instituto especial que se dedica a entrenar a los
jóvenes mutantes a que controlen sus poderes y a fomentar unas relaciones amistosas entre
humanos y mutantes.
Si hay algún escenario propio de la más épica de las batallas es esta escuela. Sumérgete en
la lucha final, selecciona a tus mejores superhéroes y adéntrate en sus recónditos pasillos y
salas. Este escenario aportará, a cada jugador, 80000 monedas para que puedan librar una
batalla que se convertirá en leyenda. El número de superhéroes será de 30 y el número de
movimientos por superhéroe será de 40. En este gran escenario, los superhéroes contarán con
300 unidades de energía vital.



      */
    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public double getMonedas() {
        return monedas;
    }

    public void setMonedas(double monedas) {
        this.monedas = monedas;
    }

    public int getMiembros() {
        return miembros;
    }

    public void setMiembros(int miembros) {
        this.miembros = miembros;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    public int getEnergiaVital() {
        return energiaVital;
    }

    public void setEnergiaVital(int energiaVital) {
        this.energiaVital = energiaVital;
    }
}
