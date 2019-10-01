package com.yuhei.nhk.ui.program

import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import com.yuhei.nhk.R
import kotlinx.android.synthetic.main.item_program_list.view.*

class ProgramListItem(private val title: String, private val subtitle: String, private val startTime: String) : Item() {
    override fun getLayout(): Int = R.layout.item_program_list

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.title.text = title
        viewHolder.itemView.subtitle.text = subtitle
        viewHolder.itemView.start_time.text = startTime
    }
}
