package dw.api.enums.follower;

public enum EFollowerQuality {

    LIABILITY(-1, 0),
    COMPETENT(0, 1),
    CAPABLE(1, 2),
    EXCEPTIONAL(2, 4);

    private final int quality;
    private final int tags;

    EFollowerQuality(int quality, int tags) {
        this.quality = quality;
        this.tags = tags;
    }

    public int getQuality() { return quality; }
    public int getTags() { return tags; }


}
