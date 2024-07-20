package com.example.shoppingadmin.UI.ui_layer.Sheets.product

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shoppingadmin.UI.ui_layer.Sheets.AddProduct
import com.example.shoppingadmin.databinding.FragmentProductBinding

class ProductFragment : Fragment() {
    private lateinit var binding:FragmentProductBinding

    private lateinit var viewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addProductBtn.setOnClickListener {
            startActivity(Intent(requireContext(), AddProduct::class.java))
        }
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProductViewModel::class.java)


    }

}