package com.eudekakelompoklima.finalproject.data;

import com.eudekakelompoklima.finalproject.data.local.CatLocalDatasource;
import com.eudekakelompoklima.finalproject.data.remote.CatRemoteDataSource;

public class CatRepository implements CatDataSource {

    CatRemoteDataSource remoteSource;
    CatLocalDatasource localSouce;

    public CatRepository(CatRemoteDataSource remoteSource, CatLocalDatasource localSouce) {
        this.remoteSource = remoteSource;
        this.localSouce = localSouce;
    }

    @Override
    public void getListCat(GetCallback callback) {

    }

    private void getFromRemoteSource(CatDataSource.GetCallback callback){

    }
}
