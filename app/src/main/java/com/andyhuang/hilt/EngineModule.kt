package com.andyhuang.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {

    @BindHybridEngine
    @Binds
    abstract fun bindHybridEngine(engine: HybridEngine): Engine

    @BindElectricEngine
    @Binds
    abstract fun bindElectricEngine(engine: ElectricEngine): Engine

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindElectricEngine
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindHybridEngine