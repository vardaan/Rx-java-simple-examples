package api;

import retrofit.RestAdapter;

/**
 * Created by vardan sharma on 3/3/15.
 *
 */
public class ApiClient {
    public static final String API_URL = "https://yts.re/api/v2/";

    private static ApiInterface sApiInterface;

    public static ApiInterface getApiClient() {
        if (sApiInterface == null) {

            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(API_URL)
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();
            sApiInterface = restAdapter.create(ApiInterface.class);
        }
        return sApiInterface;
    }
}
