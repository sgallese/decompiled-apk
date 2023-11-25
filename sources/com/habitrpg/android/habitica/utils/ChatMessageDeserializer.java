package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.ChatMessageLike;
import com.habitrpg.android.habitica.models.social.UserStyles;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;
import qc.q;

/* compiled from: ChatMessageDeserializer.kt */
/* loaded from: classes4.dex */
public final class ChatMessageDeserializer implements k<ChatMessage> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public ChatMessage deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        x0<ChatMessageLike> likes;
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        ChatMessage chatMessage = new ChatMessage();
        n i10 = lVar.i();
        if (i10.D("text") && !i10.x("text").n() && i10.x("text").p()) {
            chatMessage.setText(i10.x("text").l());
        }
        if (i10.D("timestamp")) {
            chatMessage.setTimestamp(Long.valueOf(((Date) jVar.a(i10.x("timestamp"), Date.class)).getTime()));
        }
        if (i10.D("likes")) {
            chatMessage.setLikes(new x0<>());
            for (Map.Entry<String, l> entry : i10.A("likes").w()) {
                q.f(entry);
                String key = entry.getKey();
                if (entry.getValue().a() && (likes = chatMessage.getLikes()) != null) {
                    q.f(key);
                    likes.add(new ChatMessageLike(key));
                }
            }
            x0<ChatMessageLike> likes2 = chatMessage.getLikes();
            chatMessage.setLikeCount(likes2 != null ? likes2.size() : 0);
        }
        if (i10.D("flagCount")) {
            chatMessage.setFlagCount(i10.x("flagCount").g());
        }
        if (i10.D("uuid")) {
            chatMessage.setUuid(i10.x("uuid").l());
        }
        if (i10.D("contributor") && !i10.x("contributor").n()) {
            if (i10.x("contributor").o()) {
                chatMessage.setContributor((ContributorInfo) jVar.a(i10.x("contributor"), ContributorInfo.class));
            } else {
                ContributorInfo contributorInfo = new ContributorInfo();
                contributorInfo.setText(i10.x("contributor").l());
                chatMessage.setContributor(contributorInfo);
            }
        }
        if (i10.D("backer")) {
            chatMessage.setBacker((Backer) jVar.a(i10.x("backer"), Backer.class));
        }
        if (i10.D("user")) {
            chatMessage.setUser(i10.x("user").l());
        }
        if (i10.D("username") && i10.x("username").p()) {
            chatMessage.setUsername(i10.x("username").l());
        }
        if (i10.D("sent")) {
            chatMessage.setSent(i10.x("sent").a());
        }
        if (i10.D("userStyles")) {
            chatMessage.setUserStyles((UserStyles) jVar.a(i10.x("userStyles"), UserStyles.class));
        }
        if (i10.D("id")) {
            String l10 = i10.x("id").l();
            q.h(l10, "getAsString(...)");
            chatMessage.setId(l10);
        }
        return chatMessage;
    }
}
