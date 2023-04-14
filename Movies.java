public class Movies {

public static void main(String[] args) {
    String[] movies = {"La dernière croisade", "les aventuriers de l'arche perdue", "Indiana Jones et le temple maudit"};
    
    String[][] actors = {{"Sean Connery", "Allison Doody", "Gooldorak"},
                        {"Karen Allen", "Paul Freeman", "Alain Chabat"},
                        {"Kate Capshaw", "Ke Huy Quan", "Jean-Michel Larqué"}};
  
            for (int i = 0; i < movies.length; i++) {
                System.out.print("Dans le film " + movies[i] + ", les principaux acteurs sont : ");
                for (int j = 0; j < actors[i].length; j++) {
                    System.out.print(actors[i][j]);
                    if (j < actors[i].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }