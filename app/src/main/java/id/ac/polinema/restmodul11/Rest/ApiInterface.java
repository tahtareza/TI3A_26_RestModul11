package id.ac.polinema.restmodul11.Rest;

import id.ac.polinema.restmodul11.Model.ResultPembeli;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

public interface ApiInterface {
//    @GET("pembelian/user")
//    Call<GetPembeli> getPembelian();
//
//    @FormUrlEncoded
//    @POST("pembelian/user")
//    Call<PostPutDelPembelian> postPembelian(@Field("id_pembelian") String idPembelian,
//                                            @Field("id_pembeli") String idPembeli,
//                                            @Field("tanggal_beli") String tanggalBeli,
//                                            @Field("total_harga") String totalHarga,
//                                            @Field("id_tiket") String idTiket);
//
//    @FormUrlEncoded
//    @PUT("pembelian/user")
//    Call<PostPutDelPembelian> putPembelian(@Field("id_pembelian") String idPembelian,
//                                           @Field("id_pembeli") String idPembeli,
//                                           @Field("tanggal_beli") String tanggalBeli,
//                                           @Field("total_harga") String totalHarga,
//                                           @Field("id_tiket") String idTiket);
//
//    @FormUrlEncoded
//    @HTTP(method = "DELETE", path = "pembelian/user", hasBody = true)
//    Call<PostPutDelPembelian> deletePembelian(@Field("id_pembelian") String idPembelian);

    /************************************/
    @GET("pembeli/user")
    Call<ResultPembeli> getPembeli();

    @Multipart
    @POST("pembeli/user")
    Call<ResultPembeli> postPembeli(@Part MultipartBody.Part file, @Part("id_pembeli")
            RequestBody idPembeli, @Part("nama") RequestBody nama,
                                    @Part("alamat") RequestBody alamat, @Part("telpn")
                                            RequestBody telpn, @Part("action") RequestBody action);

    @Multipart
    @POST("pembeli/user")
    Call<ResultPembeli> putPembeli(@Part MultipartBody.Part file, @Part("id_pembeli")
            RequestBody idPembeli, @Part("nama") RequestBody nama,
                                   @Part("alamat") RequestBody alamat, @Part("telpn")
                                           RequestBody telpn, @Part("action") RequestBody action);

    @Multipart
    @POST("pembeli/user")
    Call<ResultPembeli> deletePembeli(@Part("id_pembeli") RequestBody idPembeli,
                                      @Part("action") RequestBody action);
}
