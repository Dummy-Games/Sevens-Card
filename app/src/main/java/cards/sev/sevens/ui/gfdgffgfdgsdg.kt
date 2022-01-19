package cards.sev.sevens.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import cards.sev.sevens.R

@SuppressLint("CustomSplashScreen")
class gfdgffgfdgsdg : Fragment(R.layout.gdfgsdgdsdvssc) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.ivLogo).animate()
            .scaleX(4f)
            .scaleY(4f)
            .withEndAction {
                findNavController().navigate(
                    R.id.startingFragment, null,
                    navOptions {
                        popUpTo(R.id.nav_graph) {
                            inclusive = true
                        }
                    }
                )
            }.setDuration(4000L)
            .start()
    }
}
