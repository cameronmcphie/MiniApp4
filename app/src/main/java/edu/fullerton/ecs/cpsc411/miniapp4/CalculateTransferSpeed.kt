package edu.fullerton.ecs.cpsc411.miniapp4

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import edu.fullerton.ecs.cpsc411.miniapp4.databinding.ActivityCalculateTransferSpeedBinding


class CalculateTransferSpeed : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(CalculateTransferSpeedViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityCalculateTransferSpeedBinding = DataBindingUtil.setContentView(this, R.layout.activity_calculate_transfer_speed)

        binding.viewModel = viewModel
    }
}
