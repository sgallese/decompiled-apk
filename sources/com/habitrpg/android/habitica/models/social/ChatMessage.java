package com.habitrpg.android.habitica.models.social;

import android.text.Spanned;
import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.v4;
import io.realm.x0;
import java.util.Iterator;
import qc.q;

/* compiled from: ChatMessage.kt */
/* loaded from: classes4.dex */
public class ChatMessage extends d1 implements BaseMainObject, v4 {
    public static final int $stable = 8;
    private Backer backer;
    private ContributorInfo contributor;
    private int flagCount;
    private String groupId;

    /* renamed from: id  reason: collision with root package name */
    private String f12517id;
    private boolean isInboxMessage;
    private boolean isSeen;
    private int likeCount;
    private x0<ChatMessageLike> likes;
    private Spanned parsedText;
    private boolean sent;
    private String text;
    private Long timestamp;
    private String user;
    private String userID;
    private UserStyles userStyles;
    private String username;
    private String uuid;

    public ChatMessage() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id("");
        realmSet$isSeen(true);
    }

    public final Backer getBacker() {
        return realmGet$backer();
    }

    public final ContributorInfo getContributor() {
        return realmGet$contributor();
    }

    public final int getFlagCount() {
        return realmGet$flagCount();
    }

    public final String getFormattedUsername() {
        if (realmGet$username() != null) {
            return "@" + realmGet$username();
        }
        return null;
    }

    public final String getGroupId() {
        return realmGet$groupId();
    }

    public final String getId() {
        return realmGet$id();
    }

    public final int getLikeCount() {
        return realmGet$likeCount();
    }

    public final x0<ChatMessageLike> getLikes() {
        return realmGet$likes();
    }

    public final Spanned getParsedText() {
        return this.parsedText;
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return realmGet$id();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "id";
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<ChatMessage> getRealmClass() {
        return ChatMessage.class;
    }

    public final boolean getSent() {
        return realmGet$sent();
    }

    public final String getText() {
        return realmGet$text();
    }

    public final Long getTimestamp() {
        return realmGet$timestamp();
    }

    public final String getUser() {
        return realmGet$user();
    }

    public final String getUserID() {
        return realmGet$userID();
    }

    public final UserStyles getUserStyles() {
        return realmGet$userStyles();
    }

    public final String getUsername() {
        return realmGet$username();
    }

    public final String getUuid() {
        return realmGet$uuid();
    }

    public final boolean isInboxMessage() {
        return realmGet$isInboxMessage();
    }

    public final boolean isSeen() {
        return realmGet$isSeen();
    }

    public final boolean isSystemMessage() {
        return q.d(realmGet$uuid(), "system");
    }

    @Override // io.realm.v4
    public Backer realmGet$backer() {
        return this.backer;
    }

    @Override // io.realm.v4
    public ContributorInfo realmGet$contributor() {
        return this.contributor;
    }

    @Override // io.realm.v4
    public int realmGet$flagCount() {
        return this.flagCount;
    }

    @Override // io.realm.v4
    public String realmGet$groupId() {
        return this.groupId;
    }

    @Override // io.realm.v4
    public String realmGet$id() {
        return this.f12517id;
    }

    @Override // io.realm.v4
    public boolean realmGet$isInboxMessage() {
        return this.isInboxMessage;
    }

    @Override // io.realm.v4
    public boolean realmGet$isSeen() {
        return this.isSeen;
    }

    @Override // io.realm.v4
    public int realmGet$likeCount() {
        return this.likeCount;
    }

    @Override // io.realm.v4
    public x0 realmGet$likes() {
        return this.likes;
    }

    @Override // io.realm.v4
    public boolean realmGet$sent() {
        return this.sent;
    }

    @Override // io.realm.v4
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.v4
    public Long realmGet$timestamp() {
        return this.timestamp;
    }

    @Override // io.realm.v4
    public String realmGet$user() {
        return this.user;
    }

    @Override // io.realm.v4
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.v4
    public UserStyles realmGet$userStyles() {
        return this.userStyles;
    }

    @Override // io.realm.v4
    public String realmGet$username() {
        return this.username;
    }

    @Override // io.realm.v4
    public String realmGet$uuid() {
        return this.uuid;
    }

    @Override // io.realm.v4
    public void realmSet$backer(Backer backer) {
        this.backer = backer;
    }

    @Override // io.realm.v4
    public void realmSet$contributor(ContributorInfo contributorInfo) {
        this.contributor = contributorInfo;
    }

    @Override // io.realm.v4
    public void realmSet$flagCount(int i10) {
        this.flagCount = i10;
    }

    @Override // io.realm.v4
    public void realmSet$groupId(String str) {
        this.groupId = str;
    }

    @Override // io.realm.v4
    public void realmSet$id(String str) {
        this.f12517id = str;
    }

    @Override // io.realm.v4
    public void realmSet$isInboxMessage(boolean z10) {
        this.isInboxMessage = z10;
    }

    @Override // io.realm.v4
    public void realmSet$isSeen(boolean z10) {
        this.isSeen = z10;
    }

    @Override // io.realm.v4
    public void realmSet$likeCount(int i10) {
        this.likeCount = i10;
    }

    @Override // io.realm.v4
    public void realmSet$likes(x0 x0Var) {
        this.likes = x0Var;
    }

    @Override // io.realm.v4
    public void realmSet$sent(boolean z10) {
        this.sent = z10;
    }

    @Override // io.realm.v4
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.v4
    public void realmSet$timestamp(Long l10) {
        this.timestamp = l10;
    }

    @Override // io.realm.v4
    public void realmSet$user(String str) {
        this.user = str;
    }

    @Override // io.realm.v4
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    @Override // io.realm.v4
    public void realmSet$userStyles(UserStyles userStyles) {
        this.userStyles = userStyles;
    }

    @Override // io.realm.v4
    public void realmSet$username(String str) {
        this.username = str;
    }

    @Override // io.realm.v4
    public void realmSet$uuid(String str) {
        this.uuid = str;
    }

    public final void setBacker(Backer backer) {
        realmSet$backer(backer);
    }

    public final void setContributor(ContributorInfo contributorInfo) {
        realmSet$contributor(contributorInfo);
    }

    public final void setFlagCount(int i10) {
        realmSet$flagCount(i10);
    }

    public final void setGroupId(String str) {
        realmSet$groupId(str);
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        realmSet$id(str);
    }

    public final void setInboxMessage(boolean z10) {
        realmSet$isInboxMessage(z10);
    }

    public final void setLikeCount(int i10) {
        realmSet$likeCount(i10);
    }

    public final void setLikes(x0<ChatMessageLike> x0Var) {
        realmSet$likes(x0Var);
    }

    public final void setParsedText(Spanned spanned) {
        this.parsedText = spanned;
    }

    public final void setSeen(boolean z10) {
        realmSet$isSeen(z10);
    }

    public final void setSent(boolean z10) {
        realmSet$sent(z10);
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    public final void setTimestamp(Long l10) {
        realmSet$timestamp(l10);
    }

    public final void setUser(String str) {
        realmSet$user(str);
    }

    public final void setUserID(String str) {
        realmSet$userID(str);
    }

    public final void setUserStyles(UserStyles userStyles) {
        realmSet$userStyles(userStyles);
    }

    public final void setUsername(String str) {
        realmSet$username(str);
    }

    public final void setUuid(String str) {
        realmSet$uuid(str);
    }

    public final boolean userLikesMessage(String str) {
        x0 realmGet$likes = realmGet$likes();
        if (realmGet$likes == null || realmGet$likes.isEmpty()) {
            return false;
        }
        Iterator<E> it = realmGet$likes.iterator();
        while (it.hasNext()) {
            if (q.d(str, ((ChatMessageLike) it.next()).getId())) {
                return true;
            }
        }
        return false;
    }
}
