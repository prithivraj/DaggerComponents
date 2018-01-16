package com.zestworks.dagger

import dagger.Component

@Component(modules = arrayOf(EditorModule::class), dependencies = arrayOf(AppComponent::class))
@PerEditor
interface EditorComponent{
    fun getAppComponent():AppComponent
    fun inject(mainActivity: MainActivity)
}