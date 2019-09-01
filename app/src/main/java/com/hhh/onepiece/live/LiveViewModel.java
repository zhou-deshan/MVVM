package com.hhh.onepiece.live;

import com.hhh.mvvm.recycler.DataSourceSnapshot;
import com.hhh.mvvm.recycler.RecyclerDataSource;
import com.hhh.mvvm.recycler.RecyclerViewModel;
import com.hhh.onepiece.model.WorksModel;

import androidx.annotation.NonNull;

public class LiveViewModel extends RecyclerViewModel<WorksModel, String> {

  @NonNull
  @Override
  protected RecyclerDataSource<?, WorksModel, String> onCreateDataSource(String s,
      @NonNull DataSourceSnapshot<?, WorksModel> dataSourceSnapshot) {
    return new LiveDataSource(s, dataSourceSnapshot);
  }
}