package moe.xmcn.linerrx.api.bukkit

import me.zhenxin.qqbot.api.ApiManager
import me.zhenxin.qqbot.entity.MessageAttachment
import me.zhenxin.qqbot.entity.MessageEmbed
import me.zhenxin.qqbot.entity.User
import me.zhenxin.qqbot.entity.ark.MessageArk
import me.zhenxin.qqbot.event.DirectMessageEvent
import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import java.time.LocalDateTime

class DirectMessageEvent(private val api: ApiManager, private val event: DirectMessageEvent) : Event() {

    val message: String
        get() = event.message.content
    val ark: MessageArk
        get() = event.message.ark
    val author: User
        get() = event.message.author
    val attachments: Array<MessageAttachment>
        get() = event.message.attachments
    val editedTimestamp: LocalDateTime
        get() = event.message.editedTimestamp
    val embeds: Array<MessageEmbed>
        get() = event.message.embeds
    val timestamp: LocalDateTime
        get() = event.message.timestamp
    val srcGuildId: String
        get() = event.message.srcGuildId
    val guildId: String
        get() = event.message.guildId

    override fun getHandlers(): HandlerList {
        return handlerList
    }

    companion object {
        val handlerList = HandlerList()
    }
}