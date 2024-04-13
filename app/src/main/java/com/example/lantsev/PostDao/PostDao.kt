package com.example.lantsev.PostDao
import com.example.lantsev.repository.Post

interface PostDao {
    fun getAll(): List<Post>
    fun like(id:Int)
    fun share(id:Int)
    fun save(post: Post): Post
    fun removeById(id: Int)
}
