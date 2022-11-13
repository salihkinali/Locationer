package com.salihkinali.locationer.ui.map

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.salihkinali.locationer.databinding.FragmentMapBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapFragment : Fragment() {
    private var _binding: FragmentMapBinding? =null
    private val binding get() = _binding!!
    private val viewModel: MapViewModel  by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMapBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}