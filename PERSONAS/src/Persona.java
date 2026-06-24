public class Persona{

    private String nombre;
    private String apellido;
    private int edad;


    public Persona (){
         this("Nada" , "Nada", 0);
    }

    public Persona (String nombre, String apellido, int edad){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;


    }

    public String getnombre(){
        return this.nombre;
    }

    public String getapellido(){
        return this.apellido;
    }

    public int getedad(){

        return this.edad;
    }


    public void setnombre(String nombre){

        this.nombre = nombre;
    }

    public void setapellido(String apellido){
        this.apellido = apellido;
    }

    public void sededad(int edad){

        if (edad > 0) {
            this.edad = edad;
        } else {

            System.out.println("La edad no puede ser negativa");
        }
    }

    public void infoper(){

        

        System.out.println("Persona se llama " + getnombre());
        System.out.println("Y se apellida " + getapellido());
        System.out.println("Ademas de que tiene " + getedad() + " Años");
         
        

    }
}