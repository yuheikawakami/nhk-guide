package com.yuhei.nhk.ui.program

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Section
import com.yuhei.nhk.R
import kotlinx.android.synthetic.main.fragment_program_list.*

class ProgramListFragment : Fragment() {

    private val groupAdapter = GroupAdapter<GroupieViewHolder>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_program_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        list.apply {
            adapter = groupAdapter
            addItemDecoration(
                DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
            )
        }

        val items = listOf(ProgramListItem(
            "おはよう日本",
            "▼おはＢｉｚ・働き盛りのランチを救うアイデア・飲食店を“社食化”できるサービスなど▼まちかど情報室・ぬらすと答えが出る地図など、楽しく教えてくれるアイデア",
            "2019/10/1 午後7時〜"),
            ProgramListItem(
                "おはよう日本",
                "▼おはＢｉｚ・働き盛りのランチを救うアイデア・飲食店を“社食化”できるサービスなど▼まちかど情報室・ぬらすと答えが出る地図など、楽しく教えてくれるアイデア",
                "2019/10/1 午後7時〜"),
            ProgramListItem(
                "おはよう日本",
                "▼おはＢｉｚ・働き盛りのランチを救うアイデア・飲食店を“社食化”できるサービスなど▼まちかど情報室・ぬらすと答えが出る地図など、楽しく教えてくれるアイデア",
                "2019/10/1 午後7時〜"),
            ProgramListItem(
                "おはよう日本",
                "▼おはＢｉｚ・働き盛りのランチを救うアイデア・飲食店を“社食化”できるサービスなど▼まちかど情報室・ぬらすと答えが出る地図など、楽しく教えてくれるアイデア",
                "2019/10/1 午後7時〜"),
            ProgramListItem(
                "おはよう日本",
                "▼おはＢｉｚ・働き盛りのランチを救うアイデア・飲食店を“社食化”できるサービスなど▼まちかど情報室・ぬらすと答えが出る地図など、楽しく教えてくれるアイデア",
                "2019/10/1 午後7時〜")
        )

        val section = Section()
        section.setHeader(ProgramListHeaderItem("放送中"))
        items.forEach {
            section.add(it)
        }
        groupAdapter.add(section)

//        text.setOnClickListener {
//            findNavController().navigate(R.id.action_program_to_program_detail)
//        }
    }
}
