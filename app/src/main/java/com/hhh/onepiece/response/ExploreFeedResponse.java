package com.hhh.onepiece.response;

import java.util.List;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;
import com.hhh.mvvm.recycler.RecyclerResponse;
import com.hhh.onepiece.model.WorksModel;

public class ExploreFeedResponse extends RecyclerResponse<WorksModel> {

  @SerializedName("feeds")
  public List<WorksModel> mWorksList;

  @Nullable
  @Override
  public List<WorksModel> getItems() {
    return mWorksList;
  }
}
