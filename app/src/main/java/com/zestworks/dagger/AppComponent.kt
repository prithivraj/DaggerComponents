package com.zestworks.dagger

import dagger.Component

@Component(modules = arrayOf(AppModule::class))
@PerApp
interface AppComponent{
    fun provideOkHttp():OkHttp
}