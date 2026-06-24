    public class App {

        public static void main(String[] args) {
                Persona per1 = new Persona();
                Persona per2 = new Persona();
                Persona per3 = new Persona();
               
        

                        per1.setnombre("Mateo");
                        per1.setapellido("Garzon");
                        per1.sededad(17);

                        per2.setnombre("Diego");
                        per2.setapellido("Paez");
                        per2.sededad(16);
             
                per1.infoper();
                per3.infoper(); 
                
                Persona per4 = new Persona();
                per4.setnombre("Messi");
                per4.setapellido("Andres");
                per4.sededad(8);


                per4.infoper();


                




            
        }
   
}
