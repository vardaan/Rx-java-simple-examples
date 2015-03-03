package models.movie_list;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import android.os.Parcel;


public class MovieList implements Parcelable{

    private static final String FIELD_@META = "@meta";
    private static final String FIELD_STATUS = "status";
    private static final String FIELD_DATA = "data";
    private static final String FIELD_STATUS_MESSAGE = "status_message";


    @SerializedName(FIELD_@META)
    private @metum m@metum;
    @SerializedName(FIELD_STATUS)
    private String mStatus;
    @SerializedName(FIELD_DATA)
    private Datum mDatum;
    @SerializedName(FIELD_STATUS_MESSAGE)
    private String mStatusMessage;


    public MovieList(){

    }

    public void set@metum(@metum @metum) {
        m@metum = @metum;
    }

    public @metum get@metum() {
        return m@metum;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setDatum(Datum datum) {
        mDatum = datum;
    }

    public Datum getDatum() {
        return mDatum;
    }

    public void setStatusMessage(String statusMessage) {
        mStatusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return mStatusMessage;
    }

    public MovieList(Parcel in) {
        m@metum = in.readParcelable(@metum.class.getClassLoader());
        mStatus = in.readString();
        mDatum = in.readParcelable(Datum.class.getClassLoader());
        mStatusMessage = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<MovieList> CREATOR = new Parcelable.Creator<MovieList>() {
        public MovieList createFromParcel(Parcel in) {
            return new MovieList(in);
        }

        public MovieList[] newArray(int size) {
        return new MovieList[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(m@metum, flags);
        dest.writeString(mStatus);
        dest.writeParcelable(mDatum, flags);
        dest.writeString(mStatusMessage);
    }


}