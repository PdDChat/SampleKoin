package tm.samplekoin

import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext
import tm.samplekoin.viewmodel.MainViewModel

class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()

        // Koinコンテナ生成
        startKoin(this, listOf(
            this.module
        ))
    }

    // Koinモジュール
    private val module: Module = applicationContext {
        factory { MainViewModel() }
    }
}