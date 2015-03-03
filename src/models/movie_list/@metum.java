package models.movie_list;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import android.os.Parcel;


public class @metum implements Parcelable{

    private static final String FIELD_SERVER_TIME = "server_time";
    private static final String FIELD_EXECUTION_TIME = "execution_time";
    private static final String FIELD_API_VERSION = "api_version";
    private static final String FIELD_SERVER_TIMEZONE = "server_timezone";


    @SerializedName(FIELD_SERVER_TIME)
    private int mServerTime;
    @SerializedName(FIELD_EXECUTION_TIME)
    private String mExecutionTime;
    @SerializedName(FIELD_API_VERSION)
    private int mApiVersion;
    @SerializedName(FIELD_SERVER_TIMEZONE)
    private String mServerTimezone;


    public @metum(){

    }

    public void setServerTime(int serverTime) {
        mServerTime = serverTime;
    }

    public int getServerTime() {
        return mServerTime;
    }

    public void setExecutionTime(String executionTime) {
        mExecutionTime = executionTime;
    }

    public String getExecutionTime() {
        return mExecutionTime;
    }

    public void setApiVersion(int apiVersion) {
        mApiVersion = apiVersion;
    }

    public int getApiVersion() {
        return mApiVersion;
    }

    public void setServerTimezone(String serverTimezone) {
        mServerTimezone = serverTimezone;
    }

    public String getServerTimezone() {
        return mServerTimezone;
    }

    public @metum(Parcel in) {
        mServerTime = in.readInt();
        mExecutionTime = in.readString();
        mApiVersion = in.readInt();
        mServerTimezone = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<@metum> CREATOR = new Parcelable.Creator<@metum>() {
        public @metum createFromParcel(Parcel in) {
            return new @metum(in);
        }

        public @metum[] newArray(int size) {
        return new @metum[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mServerTime);
        dest.writeString(mExecutionTime);
        dest.writeInt(mApiVersion);
        dest.writeString(mServerTimezone);
    }


}