public abstract class RepairDecorator implements Repair {
    protected Repair decoratedRepair;

    public RepairDecorator(Repair decoratedRepair){
        this.decoratedRepair = decoratedRepair;
    }

    public void build(){
        decoratedRepair.build();
    }
}