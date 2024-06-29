package exercitii.ex20IMDBclone;

public enum Review {

    ONE_STAR(1),
    TWO_STARS(2),
    THREE_STARS(3),
    FOUR_STARS(4),
    FIVE_STARS(5);

    private final int reviewValue;

    public int getReviewValue() {
        return reviewValue;
    }

    Review (int reviewValue){
        this.reviewValue = reviewValue;
    }
}
