package com.yemyatthu.maepaesohsdk.api;

import com.yemyatthu.maepaesohsdk.models.Party;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Ye Lin Aung on 15/08/04.
 */
public interface PartyService {
  @GET("/party") void listParties(Callback<Party> partyCallback);
}