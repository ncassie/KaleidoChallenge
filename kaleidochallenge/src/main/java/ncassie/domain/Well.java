package ncassie.domain;

/**
 * Well class - holds contents of well
 */
public class Well {

    private String wellId;
    private Compound wellCompound;

    public Well(String wellId, Compound wellCompound) {
        this.wellId = wellId;
        this.wellCompound = wellCompound;
    }

    public Well(String wellId) {
        this.wellId = wellId;
    }

    /**
     *
     * @param wellCompound - compound to add to well
     * @throws Exception - assumption is a well with contents cannot receive a new compound, so throws an exception
     * if well already contains compound
     */
    public void setWellCompound(Compound wellCompound) throws Exception {
        if(this.wellCompound == null){
            this.wellCompound = wellCompound;
        } else{
            throw new Exception("Well already full");
        }

    }

    public Compound getWellCompound() {
        return wellCompound;
    }
}
