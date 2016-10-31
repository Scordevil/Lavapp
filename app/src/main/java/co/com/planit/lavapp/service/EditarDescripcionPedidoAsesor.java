package co.com.planit.lavapp.service;

import co.com.planit.lavapp.models.DescripcionPedido_TO;
import co.com.planit.lavapp.models.Usuario_TO;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Jose on 24/10/2016.
 */
public interface EditarDescripcionPedidoAsesor {
    @GET("/editarDescripcionPedidoAsesor/")
    void editarDescripcionPedidoAsesor(@Query("idDescripcionPedido") int idDescripcionPedido,
                       @Query("idEstado") int idEstado,
                       @Query("observacionAsesor") String observacionAsesor,
                       @Query("idColor") int idColor,
                       @Query("foto1") String foto1,
                       @Query("foto2") String foto2,
                       @Query("foto3") String foto3,
                                       @Query("codigo") String codigo,
                                       @Query("nombrefoto1") String nombrefoto1,
                                       @Query("nombrefoto2") String nombrefoto2,
                                       @Query("nombrefoto3") String nombrefoto3,
                       Callback<DescripcionPedido_TO> callback);
}
