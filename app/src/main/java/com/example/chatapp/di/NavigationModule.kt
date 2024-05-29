package com.example.chatapp.di

import com.example.chatapp.presentation.util.NavControllerHolder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NavigationModule {
    @Provides
    @Singleton
    fun provideNavControllerHolder(): NavControllerHolder = NavControllerHolder()
}
