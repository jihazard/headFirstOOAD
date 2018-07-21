package rickOfGuitarStore.enumPack;

public enum Wood {
    INDIAN_ROSEWOOD, BRAILIAN_ROSEWOOD,KOREAN_KINGWOOD,JAPAN_FUCKINGWOOD;

    public String toString(){
        switch(this) {
            case INDIAN_ROSEWOOD: return  "indian rosewood";
            case BRAILIAN_ROSEWOOD: return "brailian rosewood";
            case KOREAN_KINGWOOD: return "korean kingwood";
            case JAPAN_FUCKINGWOOD: return "japan fuckingwood";

        }
        return null;
    }
}
