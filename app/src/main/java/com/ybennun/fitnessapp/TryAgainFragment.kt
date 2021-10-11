package com.ybennun.fitnessapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class TryAgainFragment : Fragment() {
    lateinit var tryAgainButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_try_again_framgent, container, false)

        tryAgainButton = v.findViewById(R.id.try_again_button)

        tryAgainButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_tryAgainFramgent_to_exerciseFragment)
        )

        return v
    }
}