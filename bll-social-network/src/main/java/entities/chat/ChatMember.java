package entities.chat;

import com.sun.source.doctree.SeeTree;
import entities.chat.chatmemberinfo.ChatMemberInfo;
import lombok.Data;

import java.util.Set;

@Data
public class ChatMember {
    private int lastOrderIdOfCheckedEvent;
    private int lastOrderIdOfCheckedMessage;
    private Set<Integer> orderIdsDeletedMessages;
    private ChatMemberInfo info;
}
