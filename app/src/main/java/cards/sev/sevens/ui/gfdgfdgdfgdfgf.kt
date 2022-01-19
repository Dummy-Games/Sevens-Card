package cards.sev.sevens.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import cards.sev.sevens.R

class gfdgfdgdfgdfgf : Fragment(R.layout.dsfdsfewfeds) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn).setOnClickListener {
            findNavController().popBackStack()
        }
    }
}
