package com.zheil.rnd.wikititle.base.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity


abstract class BaseActivity: AppCompatActivity() {

    abstract fun setLayoutActivity(): Int
    abstract fun setContainer(): Int
    abstract fun onCreateChild()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutActivity())
        onCreateChild()
    }

    protected fun setupFragment(fragment: BaseFragment) {
        val currentFragment: Fragment? = supportFragmentManager.findFragmentById(setContainer())
        if (currentFragment == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(setContainer(), fragment)
                    .commit()
        }
    }

    protected fun replaceFragment(fragment: BaseFragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(setContainer(), fragment)
                .commit()
    }

}