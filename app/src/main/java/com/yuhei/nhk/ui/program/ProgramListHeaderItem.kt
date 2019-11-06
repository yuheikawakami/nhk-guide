package com.yuhei.nhk.ui.program

import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import com.yuhei.nhk.R
import kotlinx.android.synthetic.main.item_header.view.*

class ProgramListHeaderItem(private val title: String) : Item() {
    override fun getLayout(): Int = R.layout.item_header

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.headerTitle.text = title
    }
}
