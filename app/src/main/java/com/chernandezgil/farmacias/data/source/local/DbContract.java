package com.chernandezgil.farmacias.data.source.local;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Carlos on 09/07/2016.
 */
public class DbContract {
    public static final String CONTENT_AUTHORITY = "com.chernandezgil.farmacias";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_FARMACIAS="farmacias";

    public static final class FarmaciasEntity implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_FARMACIAS).build();
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/" + CONTENT_AUTHORITY + "/" + PATH_FARMACIAS;
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/" + CONTENT_AUTHORITY + "/" + PATH_FARMACIAS;
        public static final String TABLE_NAME="farmacias";
        public static final String NAME="name";
        public static final String ADDRESS="address";
        public static final String LOCALITY="locality";
        public static final String PROVINCE="province";
        public static final String POSTAL_CODE="postal_code";
        public static final String PHONE="phone";
        public static final String LAT="lat";
        public static final String LON="lon";
        public static final String HOURS="hours";
        public static final String FAVORITE="favorite";

        public static Uri buildFarmaciasUri(long id){

            return ContentUris.withAppendedId(CONTENT_URI,id);
        }
        public static Uri buildFarmaciasUri(String id) {
            return CONTENT_URI.buildUpon().appendPath(id).build();
        }


    }

}
