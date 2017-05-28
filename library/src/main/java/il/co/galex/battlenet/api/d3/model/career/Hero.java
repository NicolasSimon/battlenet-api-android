package il.co.galex.battlenet.api.d3.model.career;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import il.co.galex.battlenet.api.d3.model.common.Gender;
import il.co.galex.battlenet.api.d3.model.common.HeroClass;

/**
 * @author Alexander Gherschon
 */

public class Hero implements Parcelable {

    private long id;
    private String name;

    @SerializedName("class")
    private HeroClass heroClass;

    private Gender gender;
    private int level;
    private int paragonLevel;
    private boolean hardcore;
    private boolean seasonal;
    private boolean dead;

    @SerializedName("last-updated")
    private long lastUpdated;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(int paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    public boolean isHardcore() {
        return hardcore;
    }

    public void setHardcore(boolean hardcore) {
        this.hardcore = hardcore;
    }

    public boolean isSeasonal() {
        return seasonal;
    }

    public void setSeasonal(boolean seasonal) {
        this.seasonal = seasonal;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", heroClass='" + heroClass + '\'' +
                ", gender=" + gender.name() +
                ", level=" + level +
                ", paragonLevel=" + paragonLevel +
                ", hardcore=" + hardcore +
                ", seasonal=" + seasonal +
                ", dead=" + dead +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.heroClass == null ? -1 : this.heroClass.ordinal());
        dest.writeInt(this.gender == null ? -1 : this.gender.ordinal());
        dest.writeInt(this.level);
        dest.writeInt(this.paragonLevel);
        dest.writeByte(this.hardcore ? (byte) 1 : (byte) 0);
        dest.writeByte(this.seasonal ? (byte) 1 : (byte) 0);
        dest.writeByte(this.dead ? (byte) 1 : (byte) 0);
        dest.writeLong(this.lastUpdated);
    }

    public Hero() {
    }

    protected Hero(Parcel in) {
        this.id = in.readLong();
        this.name = in.readString();
        int tmpHeroClass = in.readInt();
        this.heroClass = tmpHeroClass == -1 ? null : HeroClass.values()[tmpHeroClass];
        int tmpGender = in.readInt();
        this.gender = tmpGender == -1 ? null : Gender.values()[tmpGender];
        this.level = in.readInt();
        this.paragonLevel = in.readInt();
        this.hardcore = in.readByte() != 0;
        this.seasonal = in.readByte() != 0;
        this.dead = in.readByte() != 0;
        this.lastUpdated = in.readLong();
    }

    public static final Parcelable.Creator<Hero> CREATOR = new Parcelable.Creator<Hero>() {
        @Override
        public Hero createFromParcel(Parcel source) {
            return new Hero(source);
        }

        @Override
        public Hero[] newArray(int size) {
            return new Hero[size];
        }
    };
}
