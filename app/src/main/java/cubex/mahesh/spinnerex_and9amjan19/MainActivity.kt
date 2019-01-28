package cubex.mahesh.spinnerex_and9amjan19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sp1.onItemSelectedListener =
            object:AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        if(p2>0)
                        Toast.makeText(this@MainActivity,
                                        sp1.selectedItem.toString(),
                                        Toast.LENGTH_LONG).show()

                }
                override fun onNothingSelected(p0: AdapterView<*>?) {

                }
            }
    }
}
