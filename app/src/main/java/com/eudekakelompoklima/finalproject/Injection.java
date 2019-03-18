package com.eudekakelompoklima.finalproject;

import android.content.Context;

import com.eudekakelompoklima.finalproject.data.CatRepository;
import com.eudekakelompoklima.finalproject.data.local.CatLocalDatasource;
import com.eudekakelompoklima.finalproject.data.remote.CatRemoteDataSource;

public class Injection {
    public static CatRepository provideCatRepository(Context context) {
        return new CatRepository(new CatRemoteDataSource(), new CatLocalDatasource(context));
    }
}
