package com.akprind.uasa_iqbal_abdul_majid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import android.widget.TextView
import com.iqbal_abdul_majid.myapplication.Model

class CustomAdapter(private val context: Context, private val arrayListDetails: ArrayList<Model>) :
    BaseAdapter() {

    override fun getCount(): Int {
        return arrayListDetails.size
    }

    override fun getItem(position: Int): Any {
        return arrayListDetails[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val listRowHolder: ListRowHolder

        if (convertView == null) {
            val layoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.adapter_layout, parent, false)
            listRowHolder = ListRowHolder(view)
            view.tag = listRowHolder
        } else {
            view = convertView
            listRowHolder = view.tag as ListRowHolder
        }

        val model = arrayListDetails[position]
        listRowHolder.tvId.text = model.id
        listRowHolder.tvTitle.text = model.title
        listRowHolder.tvUserId.text = model.userId

        listRowHolder.tvCompleted.text = model.completed.toString()

        return view
    }

    private class ListRowHolder(row: View) {
        val tvUserId: TextView = row.findViewById(R.id.tvUserId)
        val tvId: TextView = row.findViewById(R.id.tvId)
        val tvTitle: TextView = row.findViewById(R.id.tvtitle)
        val tvCompleted: TextView = row.findViewById(R.id.tvCompleted)
        val linearLayout: LinearLayout = row.findViewById(R.id.linearLayout)
    }
}