package tandera.hackerspace.fragment.fragmento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tandera.hackerspace.fragment.R

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(R.layout.fragment_blank, container, savedInstanceState)
        return inflater.inflate(
            R.layout.fragment_blank,
            container,
            false
        )
    }
}