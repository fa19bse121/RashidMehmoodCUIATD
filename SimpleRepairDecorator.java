public class SimpleRepairDecorator extends RepairDecorator {

    public SimpleRepairDecorator(Repair decoratedRepair) {
        super(decoratedRepair);
    }

    @Override
    public void build() {
        decoratedRepair.build();
        setSimpleRepairing(decoratedRepair);
    }

    private void setSimpleRepairing(Repair decoratedRepair){
        System.out.println("simple Repairing");
    }
}