package models.movie_list;

import java.util.ArrayList;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import android.os.Parcel;


public class Movie implements Parcelable{

    private static final String FIELD_GENRES = "genres";
    private static final String FIELD_MPA_RATING = "mpa_rating";
    private static final String FIELD_YEAR = "year";
    private static final String FIELD_LANGUAGE = "language";
    private static final String FIELD_IMDB_CODE = "imdb_code";
    private static final String FIELD_DATE_UPLOADED = "date_uploaded";
    private static final String FIELD_MEDIUM_COVER_IMAGE = "medium_cover_image";
    private static final String FIELD_TORRENTS = "torrents";
    private static final String FIELD_ID = "id";
    private static final String FIELD_DATE_UPLOADED_UNIX = "date_uploaded_unix";
    private static final String FIELD_TITLE_LONG = "title_long";
    private static final String FIELD_STATE = "state";
    private static final String FIELD_TITLE = "title";
    private static final String FIELD_URL = "url";
    private static final String FIELD_RUNTIME = "runtime";
    private static final String FIELD_SMALL_COVER_IMAGE = "small_cover_image";
    private static final String FIELD_RATING = "rating";


    @SerializedName(FIELD_GENRES)
    private List<String> mGenres;
    @SerializedName(FIELD_MPA_RATING)
    private String mMpaRating;
    @SerializedName(FIELD_YEAR)
    private int mYear;
    @SerializedName(FIELD_LANGUAGE)
    private String mLanguage;
    @SerializedName(FIELD_IMDB_CODE)
    private String mImdbCode;
    @SerializedName(FIELD_DATE_UPLOADED)
    private String mDateUploaded;
    @SerializedName(FIELD_MEDIUM_COVER_IMAGE)
    private String mMediumCoverImage;
    @SerializedName(FIELD_TORRENTS)
    private List<Torrent> mTorrents;
    @SerializedName(FIELD_ID)
    private long mId;
    @SerializedName(FIELD_DATE_UPLOADED_UNIX)
    private int mDateUploadedUnix;
    @SerializedName(FIELD_TITLE_LONG)
    private String mTitleLong;
    @SerializedName(FIELD_STATE)
    private String mState;
    @SerializedName(FIELD_TITLE)
    private String mTitle;
    @SerializedName(FIELD_URL)
    private String mUrl;
    @SerializedName(FIELD_RUNTIME)
    private int mRuntime;
    @SerializedName(FIELD_SMALL_COVER_IMAGE)
    private String mSmallCoverImage;
    @SerializedName(FIELD_RATING)
    private int mRating;


    public Movie(){

    }

    public void setGenres(List<String> genres) {
        mGenres = genres;
    }

    public List<String> getGenres() {
        return mGenres;
    }

    public void setMpaRating(String mpaRating) {
        mMpaRating = mpaRating;
    }

    public String getMpaRating() {
        return mMpaRating;
    }

    public void setYear(int year) {
        mYear = year;
    }

    public int getYear() {
        return mYear;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setImdbCode(String imdbCode) {
        mImdbCode = imdbCode;
    }

    public String getImdbCode() {
        return mImdbCode;
    }

    public void setDateUploaded(String dateUploaded) {
        mDateUploaded = dateUploaded;
    }

    public String getDateUploaded() {
        return mDateUploaded;
    }

    public void setMediumCoverImage(String mediumCoverImage) {
        mMediumCoverImage = mediumCoverImage;
    }

    public String getMediumCoverImage() {
        return mMediumCoverImage;
    }

    public void setTorrents(List<Torrent> torrents) {
        mTorrents = torrents;
    }

    public List<Torrent> getTorrents() {
        return mTorrents;
    }

    public void setId(long id) {
        mId = id;
    }

    public long getId() {
        return mId;
    }

    public void setDateUploadedUnix(int dateUploadedUnix) {
        mDateUploadedUnix = dateUploadedUnix;
    }

    public int getDateUploadedUnix() {
        return mDateUploadedUnix;
    }

    public void setTitleLong(String titleLong) {
        mTitleLong = titleLong;
    }

    public String getTitleLong() {
        return mTitleLong;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setRuntime(int runtime) {
        mRuntime = runtime;
    }

    public int getRuntime() {
        return mRuntime;
    }

    public void setSmallCoverImage(String smallCoverImage) {
        mSmallCoverImage = smallCoverImage;
    }

    public String getSmallCoverImage() {
        return mSmallCoverImage;
    }

    public void setRating(int rating) {
        mRating = rating;
    }

    public int getRating() {
        return mRating;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Movie){
            return ((Movie) obj).getId() == mId;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return ((Long)mId).hashCode();
    }

    public Movie(Parcel in) {
        in.readArrayList(String.class.getClassLoader());
        mMpaRating = in.readString();
        mYear = in.readInt();
        mLanguage = in.readString();
        mImdbCode = in.readString();
        mDateUploaded = in.readString();
        mMediumCoverImage = in.readString();
        mTorrents = new ArrayList<Torrent>();
        in.readTypedList(mTorrents, Torrent.CREATOR);
        mId = in.readLong();
        mDateUploadedUnix = in.readInt();
        mTitleLong = in.readString();
        mState = in.readString();
        mTitle = in.readString();
        mUrl = in.readString();
        mRuntime = in.readInt();
        mSmallCoverImage = in.readString();
        mRating = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        public Movie[] newArray(int size) {
        return new Movie[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(mGenres);
        dest.writeString(mMpaRating);
        dest.writeInt(mYear);
        dest.writeString(mLanguage);
        dest.writeString(mImdbCode);
        dest.writeString(mDateUploaded);
        dest.writeString(mMediumCoverImage);
        dest.writeTypedList(mTorrents);
        dest.writeLong(mId);
        dest.writeInt(mDateUploadedUnix);
        dest.writeString(mTitleLong);
        dest.writeString(mState);
        dest.writeString(mTitle);
        dest.writeString(mUrl);
        dest.writeInt(mRuntime);
        dest.writeString(mSmallCoverImage);
        dest.writeInt(mRating);
    }


}