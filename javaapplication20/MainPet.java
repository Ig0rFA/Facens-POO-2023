package javaapplication20;


public class MainPet {

    public static void main(String[] args) {
        
        
        
        String menu = "\n1-Cadastrar Tutor: "+
                       "\n2-CPF do tutor responsavel pelo pet: "+
                       "\n3-Listar Tutor: ";
                       
                  System.out.println(menu);
                  
                  switch(menu){
                      case 1:
                          break;
                          
                      case 2:
                        break;
                          
                       case 3:
                           
                           if(menu = !3){
                               System.out.println(tut1.imprimir());
                               System.out.println(tut2.imprimir());
                           }
                        break;
                  }
        
        Tuto tut1 = new Tuto("Fabio", "1234");
        Tuto tut2 = new Tuto("Igao", "222");
        
       
        Pet pt1 = new Pet ("bala", "gaia", 2);
        Pet pt2 = new Pet ("bilo", "gaio", 3);
        
        tut1.addPet(pt1);
        tut2.addPet(pt2);
        
        
        
        
    }

}
