package com.hemendra.staticlistviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdapter(var context:Context,var txtarray:Array<String>,var imgarray:IntArray) :BaseAdapter()
{

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        var layoutInflater = LayoutInflater.from(context)
        var view:View = layoutInflater.inflate(R.layout.list_item,p2,false)

        view.item_img.setImageResource(imgarray[position])
        view.item_txt.text = txtarray[position]

        return view

    }


    override fun getCount(): Int {
        return imgarray.size
    }

    override fun getItem(p0: Int): Any =0
    override fun getItemId(p0: Int): Long =0
}