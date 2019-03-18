package com.eudekakelompoklima.finalproject.data;

import com.eudekakelompoklima.finalproject.model.Breeds;

public interface CatDataSource {
    interface GetCallback {
        void onDataLoaded(Breeds data);

        void onDataNotAvailable(String message);
    }

    void getListCat(GetCallback callback);
}
