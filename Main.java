public class Main {
    public static void main(String[] args) {
        Repair repair = new ExteriorRepair();
        Repair exteriorRepair = new SimpleRepairDecorator(new ExteriorRepair());
        Repair interiorRepair = new SimpleRepairDecorator(new InteriorRepair());

        exteriorRepair.build();
        interiorRepair.build();
    }
}