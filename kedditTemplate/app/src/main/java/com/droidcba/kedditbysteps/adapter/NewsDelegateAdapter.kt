package com.droidcba.kedditbysteps.adapter

import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.droidcba.kedditbysteps.R
import com.droidcba.kedditbysteps.inflate
import com.droidcba.kedditbysteps.model.RedditNewsItem
import kotlinx.android.synthetic.main.news_items.view.*

// :ViewTypeDelegateAdapter  상속받음
class NewsDelegateAdapter(val viewaction : onViewSelectedListener) :ViewTypeDelegateAdapter{

    interface onViewSelectedListener{
        fun onItemSelected(url:String?)
    }

    //:ViewTypeDelegateAdapter 를 상속받았으니 반드시 써주어야한다.
    //한줄로 쓸 떄 자료형 삭제하고 return, { }도 삭제함. NewsViewHolder(parent)을 반환한다는 의미임.
    override fun onCreateViewHolder(parent: ViewGroup)= NewsViewHolder(parent)


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as NewsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    //뉴스홀더
    inner class NewsViewHolder(parent: ViewGroup):RecyclerView.ViewHolder(
            //inflate를 자유롭게 쓸 수 있는 이유는 common에서 미리 만들어주었기 때문임.
            parent.inflate(R.layout.news_items)){
        //itemview는 내장함수
        private val imgThumnail = itemView.img_thumbnail
        private val description = itemView.description
        private val author = itemView.author
        private val comments = itemView.comment
        private val time = itemView.time

        fun bind(item: RedditNewsItem){
            //TODO: imgThumnail
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComment} comment"
            //TODO: time.text
        }
    }


}