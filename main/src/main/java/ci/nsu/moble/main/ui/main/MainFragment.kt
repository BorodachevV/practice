package ci.nsu.moble.main.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ci.nsu.moble.main.MainActivity2
import ci.nsu.moble.main.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
        const val EXTRA_MESSAGE = "ci.nsu.moble.main.MESSAGE"
    }

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        
        val button: Button = view.findViewById(R.id.btn_open_second)
        button.setOnClickListener {
            val intent = Intent(activity, MainActivity2::class.java).apply {
                putExtra(EXTRA_MESSAGE, "Hello from Main Activity!")
            }
            startActivity(intent)
        }
        
        return view
    }
}