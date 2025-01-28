package com.example.ar_model_library

import androidx.appcompat.app.AppCompatActivity
import com.google.ar.sceneform.ux.ArFragment

class ArSdk {

    fun initializeArFragment(
        activity: AppCompatActivity,
        fragmentContainerId: Int,
        modelPath: String
    ) {
        val arFragment =
            activity.supportFragmentManager.findFragmentById(fragmentContainerId) as ArFragment
        arFragment.setOnTapPlaneGlbModel(modelPath)
    }

}