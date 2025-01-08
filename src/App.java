import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("************Tallest Mountain Lab***********");
        Mountain mountainOne = new Mountain(11848, "Mt.Everest");
        Mountain mountainTwo = new Mountain(8611, "Mt.K2");
        Mountain mountainThree = new Mountain(8586, "Mt.Kanchenjunga");
        Mesa mesaOne = new Mesa(11332,"Grand Mesa",500);
        Mesa mesaTwo = new Mesa(11197,"Sheep Mesa",320);
        Mesa mesaThree = new Mesa(11289,"Flat Top",340);

        ArrayList<Formation> formations = new ArrayList<>();
        formations.add(mountainOne);
        formations.add(mountainTwo);
        formations.add(mountainThree);
        formations.add(mesaOne);
        formations.add(mesaTwo);
        formations.add(mesaThree);     
        
        System.out.println("Mountain and Mesa Details");
        System.out.println("--------------------------");
//list formation details
        showInfo(formations);
// find tallest formation
        Formation formationTallest = findTallest(formations);

        System.out.println("----------------------------------------------------");
        System.out.println("Here is the Tallest Formation Height "+ formationTallest.getHeight());
        System.out.println("----------------------------------------------------");
        System.out.println(formationTallest.getInfo());
        System.out.println("----------------------------------------------------");
//find Tallest Mesa
        Formation tallestMesa = showTallestMesa(formations);

        System.out.println("Here is the Tallest Mesa Height "+ tallestMesa.getHeight());
        System.out.println("----------------------------------------------------");
        System.out.println(tallestMesa.getInfo());
        System.out.println("----------------------------------------------------");
       
    }
    public static void showInfo(ArrayList<Formation> formationArray){
        for (Formation formationDetails : formationArray){
            System.out.println(formationDetails.getInfo());
        }
    }

    public static Formation findTallest(ArrayList<Formation> formationArray){
        Formation formationTallest = formationArray.get(0);
        for (Formation formationDetails : formationArray){
            if (formationDetails.getHeight() > formationTallest.getHeight()){
                formationTallest = formationDetails;
            }
        }
        return formationTallest;        
    }

    public static Formation showTallestMesa(ArrayList<Formation> formationArray){
        Formation tallestMesa = null;
        int height = 0;
        for (Formation formationDetails : formationArray){
            if (formationDetails instanceof Mesa){
                if (formationDetails.getHeight() > height)
                {
                    tallestMesa = formationDetails;
                    height = tallestMesa.getHeight();
                }
            }           
        }
        return tallestMesa;
    }
}
