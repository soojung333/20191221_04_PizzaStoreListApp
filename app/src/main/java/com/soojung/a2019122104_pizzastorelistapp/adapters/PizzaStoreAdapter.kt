package com.soojung.a20191214_01_listviewpractice02.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.soojung.a2019122104_pizzastorelistapp.R

import com.soojung.a2019122104_pizzastorelistapp.datas.PizzaStore

class PizzaStoreAdapter(context:Context, resId:Int, list:ArrayList<PizzaStore>)
    : ArrayAdapter<PizzaStore>(context, resId, list) {

    val  mContext = context
    val  mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.pizza_store_list_item, null)
        }
        val row = tempRow!!

        val data = mList.get(position)





        return row

    }
}