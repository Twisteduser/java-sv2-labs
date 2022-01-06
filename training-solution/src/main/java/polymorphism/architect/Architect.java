package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan firstPlan = new SketchPlan(30,"ház");
        System.out.println(firstPlan.getPagesOfDocumentation());

        Plan secondPlan = new PermitPlan(200,"másik ház","John Doe", "Budapest");
        System.out.println(secondPlan.getPagesOfDocumentation());

        Plan thirdPlan = new ConstructionPlan(404,"Az eltünt ház", "John Wick", "Los Angeles", 11);
        System.out.println(thirdPlan.getPagesOfDocumentation());

        SketchPlan firstSketch = new SketchPlan(12, "Bódé");
        System.out.println(firstSketch.getTitle());
        System.out.println(firstSketch.getPagesOfDocumentation());

        SketchPlan secondSketch = new PermitPlan(123,"garázs", "Béla", "Siófok");
        System.out.println(secondSketch.getPagesOfDocumentation());
        System.out.println(secondSketch.getTitle());

        SketchPlan thirdSketch = new ConstructionPlan(2222,"stadion", "Viktor", "Secret location",1);
        System.out.println(thirdSketch.getTitle());
        System.out.println(thirdSketch.getPagesOfDocumentation());

        Header firstheader = new PermitPlan(3,"villa", "Nagy Sándor", "Alexandria");
        System.out.println(firstheader.getAddressOfBuilding());
        System.out.println(firstheader.getNameOfClient());

        Header secondHeader = new ConstructionPlan(16, "Ház", "Kiss Sándor", "Miami", 55);
        System.out.println(secondHeader.getNameOfClient());
        System.out.println(secondHeader.getAddressOfBuilding());

        PermitPlan firstPermitPlan = new PermitPlan(45, "Ház", "Kiss József", "Las Vegas");
        System.out.println(firstPermitPlan.getTitle());
        System.out.println(firstPermitPlan.getHeader());
        System.out.println(firstPermitPlan.getPagesOfDocumentation());
        System.out.println(firstPermitPlan.getNameOfClient());
        System.out.println(firstPermitPlan.getAddressOfBuilding());

        PermitPlan secondPermitPlan = new ConstructionPlan(86, "Ház", "Kiss József", "Ibiza", 23);
        System.out.println(secondPermitPlan.getTitle());
        System.out.println(secondPermitPlan.getHeader());
        System.out.println(secondPermitPlan.getPagesOfDocumentation());
        System.out.println(secondPermitPlan.getNameOfClient());
        System.out.println(secondPermitPlan.getAddressOfBuilding());

        ConstructionPlan constructionPlan = new ConstructionPlan(103, "Ház", "Kiss József", "Milánó", 54);
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getNameOfClient());
        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
    }
}
