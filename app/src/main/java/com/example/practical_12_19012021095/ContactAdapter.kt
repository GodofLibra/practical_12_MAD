package com.example.practical_12_19012021095




import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ContactAdapter(private var context: Context, var items:ArrayList<Contact>): BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(context).inflate(R.layout.listitem, parent, false)

        val id:TextView = view.findViewById(R.id.list_Id)
        val name: TextView =view.findViewById(R.id.list_name)
        val num: TextView =view.findViewById(R.id.list_phone)
        val address: TextView = view.findViewById(R.id.list_address)

        id.text=items[position]._id
        name.text=items[position].name
        num.text=items[position].phone
        address.text=items[position].address



        return view
    }


}
