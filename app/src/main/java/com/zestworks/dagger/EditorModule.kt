package com.zestworks.dagger

import dagger.Module
import dagger.Provides

@Module
class EditorModule{

    @Provides
    @PerEditor
    fun provideRetrofit(okHttp: OkHttp) : Retrofit = Retrofit(okHttp)
}