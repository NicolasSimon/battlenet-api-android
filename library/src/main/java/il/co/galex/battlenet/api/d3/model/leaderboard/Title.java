package il.co.galex.battlenet.api.d3.model.leaderboard;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class Title implements Parcelable {

    private String en_US;
    private String es_MX;
    private String pt_BR;
    private String de_DE;
    private String en_GB;
    private String es_ES;
    private String fr_FR;
    private String it_IT;
    private String pl_PL;
    private String pt_PT;
    private String ru_RU;
    private String ko_KR;
    private String zh_TW;
    private String zh_CN;

    public String getEn_US() {
        return en_US;
    }

    public void setEn_US(String en_US) {
        this.en_US = en_US;
    }

    public String getEs_MX() {
        return es_MX;
    }

    public void setEs_MX(String es_MX) {
        this.es_MX = es_MX;
    }

    public String getPt_BR() {
        return pt_BR;
    }

    public void setPt_BR(String pt_BR) {
        this.pt_BR = pt_BR;
    }

    public String getDe_DE() {
        return de_DE;
    }

    public void setDe_DE(String de_DE) {
        this.de_DE = de_DE;
    }

    public String getEn_GB() {
        return en_GB;
    }

    public void setEn_GB(String en_GB) {
        this.en_GB = en_GB;
    }

    public String getEs_ES() {
        return es_ES;
    }

    public void setEs_ES(String es_ES) {
        this.es_ES = es_ES;
    }

    public String getFr_FR() {
        return fr_FR;
    }

    public void setFr_FR(String fr_FR) {
        this.fr_FR = fr_FR;
    }

    public String getIt_IT() {
        return it_IT;
    }

    public void setIt_IT(String it_IT) {
        this.it_IT = it_IT;
    }

    public String getPl_PL() {
        return pl_PL;
    }

    public void setPl_PL(String pl_PL) {
        this.pl_PL = pl_PL;
    }

    public String getPt_PT() {
        return pt_PT;
    }

    public void setPt_PT(String pt_PT) {
        this.pt_PT = pt_PT;
    }

    public String getRu_RU() {
        return ru_RU;
    }

    public void setRu_RU(String ru_RU) {
        this.ru_RU = ru_RU;
    }

    public String getKo_KR() {
        return ko_KR;
    }

    public void setKo_KR(String ko_KR) {
        this.ko_KR = ko_KR;
    }

    public String getZh_TW() {
        return zh_TW;
    }

    public void setZh_TW(String zh_TW) {
        this.zh_TW = zh_TW;
    }

    public String getZh_CN() {
        return zh_CN;
    }

    public void setZh_CN(String zh_CN) {
        this.zh_CN = zh_CN;
    }

    @Override
    public String toString() {
        return "{" +
                "en_US='" + en_US + '\'' +
                ", es_MX='" + es_MX + '\'' +
                ", pt_BR='" + pt_BR + '\'' +
                ", de_DE='" + de_DE + '\'' +
                ", en_GB='" + en_GB + '\'' +
                ", es_ES='" + es_ES + '\'' +
                ", fr_FR='" + fr_FR + '\'' +
                ", it_IT='" + it_IT + '\'' +
                ", pl_PL='" + pl_PL + '\'' +
                ", pt_PT='" + pt_PT + '\'' +
                ", ru_RU='" + ru_RU + '\'' +
                ", ko_KR='" + ko_KR + '\'' +
                ", zh_TW='" + zh_TW + '\'' +
                ", zh_CN='" + zh_CN + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.en_US);
        dest.writeString(this.es_MX);
        dest.writeString(this.pt_BR);
        dest.writeString(this.de_DE);
        dest.writeString(this.en_GB);
        dest.writeString(this.es_ES);
        dest.writeString(this.fr_FR);
        dest.writeString(this.it_IT);
        dest.writeString(this.pl_PL);
        dest.writeString(this.pt_PT);
        dest.writeString(this.ru_RU);
        dest.writeString(this.ko_KR);
        dest.writeString(this.zh_TW);
        dest.writeString(this.zh_CN);
    }

    public Title() {
    }

    protected Title(Parcel in) {
        this.en_US = in.readString();
        this.es_MX = in.readString();
        this.pt_BR = in.readString();
        this.de_DE = in.readString();
        this.en_GB = in.readString();
        this.es_ES = in.readString();
        this.fr_FR = in.readString();
        this.it_IT = in.readString();
        this.pl_PL = in.readString();
        this.pt_PT = in.readString();
        this.ru_RU = in.readString();
        this.ko_KR = in.readString();
        this.zh_TW = in.readString();
        this.zh_CN = in.readString();
    }

    public static final Parcelable.Creator<Title> CREATOR = new Parcelable.Creator<Title>() {
        @Override
        public Title createFromParcel(Parcel source) {
            return new Title(source);
        }

        @Override
        public Title[] newArray(int size) {
            return new Title[size];
        }
    };
}
