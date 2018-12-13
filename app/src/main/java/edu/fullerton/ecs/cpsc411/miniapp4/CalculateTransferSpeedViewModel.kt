package edu.fullerton.ecs.cpsc411.miniapp4

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableDouble

class CalculateTransferSpeedViewModel : ViewModel() {
    var fileSize  = ""
    var networkSpeed = ""
    var transferSpeed = ObservableDouble()

    fun onSpeedOnChanged() {
        if (fileSize != "" && networkSpeed != "") {
            var fs = fileSize.toDouble()
            var ns = networkSpeed.toDouble()

            fs *= Math.pow(2.0, 20.0) * 8.0
            ns *= Math.pow(10.0, 6.0)

            transferSpeed.set(fs / ns)
        }
    }
}