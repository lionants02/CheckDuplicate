package max.kotlin.checkdupp.webservice

import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

internal interface RetofitUrl {
    @GET("$ROOT_PART/processname")
    fun getApiProcessName(): Call<String>
}

internal fun buildApiClient(baseUrl: String): RetofitUrl {
    val restService = getCient(baseUrl)
    return restService.create(RetofitUrl::class.java)
}

private fun getCient(baseUrl: String): Retrofit {

    val client = OkHttpClient
        .Builder()
        .build()

    return Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(client)
        .addConverterFactory(ScalarsConverterFactory.create())
        .build()
}
