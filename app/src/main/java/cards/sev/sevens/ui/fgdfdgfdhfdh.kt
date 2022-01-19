package cards.sev.sevens.ui

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import cards.sev.sevens.R
import cards.sev.sevens.util.getDrawableId
import cards.sev.sevens.util.suspendMap
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.random.Random
import kotlin.random.nextInt

class fgdfdgfdhfdh : Fragment(R.layout.bgfdgfgdfgh) {

    private var vsdfgfsdgsgfgsf: Job? = null
    private var csgfsdbfdb = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fdvcgfdgdfcb(view)
    }

    override fun onResume() {
        super.onResume()
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Tap on dice to play!")
            .setMessage("Kill all dices to win!")
            .setPositiveButton("Ok") { _, _ -> }
            .setOnCancelListener { findNavController().popBackStack() }
            .setNegativeButton("Cancel") { _, _ -> findNavController().popBackStack() }
            .show()
    }

    private fun fdvcgfdgdfcb(view: View) {
        vsdfgfsdgsgfgsf?.cancel()
        with(view) {
            val ivContainer = findViewById<FrameLayout>(R.id.flImages)
            vsdfgfsdgsgfgsf = viewLifecycleOwner.lifecycleScope.launch {
                listOf<ImageView>(
                    findViewById(R.id.iv1),
                    findViewById(R.id.iv2),
                    findViewById(R.id.iv3),
                    findViewById(R.id.iv4),
                    findViewById(R.id.iv5)
                ).suspendMap { fggwrgfs(it, ivContainer) }.forEach {
                    it.join()
                }
                fdvcgfdgdfcb(view)
                Snackbar.make(view, "You won!", Snackbar.LENGTH_LONG).show()
            }
        }
    }

    private suspend fun fggwrgfs(iv: ImageView, container: FrameLayout): Job {
        iv.isVisible = true
        iv.setImageResource(requireContext().getDrawableId("s" + Random.nextInt(1..5)))
        iv.x = container.width * Random.nextInt(20) * 0.04f
        iv.y = container.height * Random.nextInt(20) * 0.04f
        return withContext(Dispatchers.Main) { launch { gfdgbfdgfdgd(iv) } }
    }

    private suspend fun gfdgbfdgfdgd(iv: ImageView) = suspendCoroutine<Unit> { cont ->
        iv.setOnClickListener {
            csgfsdbfdb += 200
            view?.findViewById<TextView>(R.id.tvScore)?.text = "SCORE: $csgfsdbfdb"
            iv.isVisible = false
            cont.resume(Unit)
        }
    }
}
