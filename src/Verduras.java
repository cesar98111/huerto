public class Verduras{
    private static String verduras [] = {
            "lettuce",
            "cabbage",
            "onion",
            "spinach",
            "potato",
            "celery",
            "asparagus",
            "radish",
            "brocoli",
            "antichoke",
            "tomato",
            "cucumbre",
            "eggplant",
            "carrot",
            "green bean"};

    public static String generarVerdura(){
        return verduras[(int)(Math.random()*9+0)];
    }
}




