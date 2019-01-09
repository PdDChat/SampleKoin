package tm.samplekoin.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject
import tm.samplekoin.R
import tm.samplekoin.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    /**
     * DI
     *
     * こちらの書き方でも可
     * private val mViewModel by inject<MainViewModel>()
     */
    private val mViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel.onCreate()
    }
}
