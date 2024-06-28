package com.example.certificacionandroid.View

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.certificacionandroid.R
import com.example.certificacionandroid.ViewModel.AdapterApp
import com.example.certificacionandroid.ViewModel.ViewModelApp
import com.example.certificacionandroid.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    //ViewModel
    /*private  val viewModel : ViewModelApp by activityViewModels()*/



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter =  AdapterApp()
        /*binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = GridLayoutManager(context, 2)
        viewModel.obtenerListaPlantas().observe(viewLifecycleOwner, Observer {
            it?.let {
                Log.d("Listado", it.toString())
                adapter.actualizar(it)
            }
        })


        //Método para seleccionar una planta
        adapter.seleccionarPlanta().observe(viewLifecycleOwner, Observer {
            it.let {
                Log.d("Seleccion", it.toString())
            }
            val bundle = Bundle().apply {
                putInt("plantId", it.id)
            }


        binding..setOnClickListener {*/
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}