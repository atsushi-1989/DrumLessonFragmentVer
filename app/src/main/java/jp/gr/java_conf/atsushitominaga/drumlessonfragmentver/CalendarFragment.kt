package jp.gr.java_conf.atsushitominaga.drumlessonfragmentver

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.gr.java_conf.atsushitominaga.drumlessonfragmentver.databinding.CalendarFragmentBinding
import java.text.SimpleDateFormat
import java.util.*


class CalendarFragment : Fragment() {

    private lateinit var binding: CalendarFragmentBinding

    companion object {
        fun newInstance() = CalendarFragment()
    }

    private lateinit var viewModel: CalendarViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CalendarFragmentBinding.inflate(inflater,container,false)
        inflater.inflate(R.layout.calendar_fragment, container,false)
        val calendar = Calendar.getInstance()
        val year = SimpleDateFormat("yyyy").format(Date()).toInt()
        val month = SimpleDateFormat("MM").format(Date()).toInt()
        val minDay = 1
        calendar.set(year,month -1, 1)
        val maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
        val blankDays = calendar.get(Calendar.DAY_OF_WEEK)

        val dayArray: MutableList<String> = mutableListOf()
        for (i in minDay until blankDays){
            dayArray.add("")
        }
        for(i in minDay..maxDay){
            dayArray.add(i.toString())
        }
        binding.date = dayArray.toTypedArray()


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}
