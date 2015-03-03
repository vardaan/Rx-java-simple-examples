package models.movie_list;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import android.os.Parcel;


public class Torrent implements Parcelable{

    private static final String FIELD_SIZE = "size";
    private static final String FIELD_DATE_UPLOADED_UNIX = "date_uploaded_unix";
    private static final String FIELD_SEEDS = "seeds";
    private static final String FIELD_HASH = "hash";
    private static final String FIELD_URL = "url";
    private static final String FIELD_DATE_UPLOADED = "date_uploaded";
    private static final String FIELD_QUALITY = "quality";
    private static final String FIELD_PEERS = "peers";
    private static final String FIELD_SIZE_BYTES = "size_bytes";


    @SerializedName(FIELD_SIZE)
    private String mSize;
    @SerializedName(FIELD_DATE_UPLOADED_UNIX)
    private int mDateUploadedUnix;
    @SerializedName(FIELD_SEEDS)
    private int mSeed;
    @SerializedName(FIELD_HASH)
    private String mHash;
    @SerializedName(FIELD_URL)
    private String mUrl;
    @SerializedName(FIELD_DATE_UPLOADED)
    private String mDateUploaded;
    @SerializedName(FIELD_QUALITY)
    private String mQuality;
    @SerializedName(FIELD_PEERS)
    private int mPeer;
    @SerializedName(FIELD_SIZE_BYTES)
    private int mSizeByte;


    public Torrent(){

    }

    public void setSize(String size) {
        mSize = size;
    }

    public String getSize() {
        return mSize;
    }

    public void setDateUploadedUnix(int dateUploadedUnix) {
        mDateUploadedUnix = dateUploadedUnix;
    }

    public int getDateUploadedUnix() {
        return mDateUploadedUnix;
    }

    public void setSeed(int seed) {
        mSeed = seed;
    }

    public int getSeed() {
        return mSeed;
    }

    public void setHash(String hash) {
        mHash = hash;
    }

    public String getHash() {
        return mHash;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setDateUploaded(String dateUploaded) {
        mDateUploaded = dateUploaded;
    }

    public String getDateUploaded() {
        return mDateUploaded;
    }

    public void setQuality(String quality) {
        mQuality = quality;
    }

    public String getQuality() {
        return mQuality;
    }

    public void setPeer(int peer) {
        mPeer = peer;
    }

    public int getPeer() {
        return mPeer;
    }

    public void setSizeByte(int sizeByte) {
        mSizeByte = sizeByte;
    }

    public int getSizeByte() {
        return mSizeByte;
    }

    public Torrent(Parcel in) {
        mSize = in.readString();
        mDateUploadedUnix = in.readInt();
        mSeed = in.readInt();
        mHash = in.readString();
        mUrl = in.readString();
        mDateUploaded = in.readString();
        mQuality = in.readString();
        mPeer = in.readInt();
        mSizeByte = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<Torrent> CREATOR = new Parcelable.Creator<Torrent>() {
        public Torrent createFromParcel(Parcel in) {
            return new Torrent(in);
        }

        public Torrent[] newArray(int size) {
        return new Torrent[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mSize);
        dest.writeInt(mDateUploadedUnix);
        dest.writeInt(mSeed);
        dest.writeString(mHash);
        dest.writeString(mUrl);
        dest.writeString(mDateUploaded);
        dest.writeString(mQuality);
        dest.writeInt(mPeer);
        dest.writeInt(mSizeByte);
    }


}