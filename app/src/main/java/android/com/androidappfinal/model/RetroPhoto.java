package android.com.androidappfinal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by C4Q on 6/5/18.
 */

public class RetroPhoto {

    @SerializedName("image")
    private String image;
    @SerializedName("value")
    private Integer value;
    @SerializedName("suit")
    private String suit;
    @SerializedName("code")
    private String code;
    @SerializedName("remaining")
    private int remaining;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public RetroPhoto(String image, Integer value, String suit, String code, int remaining) {
        this.image = image;
        this.value = value;
        this.suit = suit;
        this.code = code;
        this.remaining = remaining;

    }
}
