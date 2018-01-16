package com.zestworks.dagger

import dagger.Module
import dagger.Provides

@Module
class AppModule{

    @Provides
    @PerApp
    fun provideOkHttp() : OkHttp{
        return  OkHttp()
    }
}