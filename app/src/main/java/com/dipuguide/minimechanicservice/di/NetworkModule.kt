package com.dipuguide.minimechanicservice.di

import com.dipuguide.minimechanicservice.data.remote.api.MechanicsApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


const val API_BASE_URL =
    "https://gist.githubusercontent.com/dipuvarma/d448d5c3e20fea03f96f59d3a32e71d9/raw/4b4bb70ca6cd224ead2a4207a8640d740d5399b0/"

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().client(OkHttpClient()).baseUrl(API_BASE_URL).addConverterFactory(
            GsonConverterFactory.create()
        ).build()
    }


    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): MechanicsApiService {
        return retrofit.create(MechanicsApiService::class.java)
    }
}