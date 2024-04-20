import restaurant.Restaurant;

public class Main {
    public static void main (String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.newRevenue("pudim", "pudim cremoso", 230.50 , "café", "arroz", "açucar", "fermento");
        restaurant.newRevenue("café", "café forte e sem firula", 15.00 , "4 colheres de sopa café", "2 colheres de chá de açucar", "agua quente pra qualquer medida");

        System.out.println(restaurant.getMenu());
    }
}
