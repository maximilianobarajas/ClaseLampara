class Lampara {
    private boolean prendida;
    public boolean getprendida() {
        return prendida;
    }
    // método para encender la lámpara
    void encender() {
      prendida = true;
      System.out.println("¿Está encendida la lámpara? " + getprendida());
  
    }
  
    // método para apagar la lámpara
    void apagar() {
      prendida = false;
      System.out.println("¿Esta encendida la lámpara? " + getprendida());
    }   
}

class prueba
{
  
    public static void main(String args[])
    {
        Lampara lampara1= new Lampara();
        lampara1.encender();
        lampara1.apagar();
    }
}