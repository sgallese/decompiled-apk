package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.r6;
import io.realm.x0;
import qc.q;

/* compiled from: Inbox.kt */
/* loaded from: classes4.dex */
public class Inbox extends d1 implements BaseObject, r6 {
    public static final int $stable = 8;
    private x0<String> blocks;
    private boolean hasUserSeenInbox;
    private int newMessages;
    private boolean optOut;

    public Inbox() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$blocks(new x0());
    }

    public final x0<String> getBlocks() {
        return realmGet$blocks();
    }

    public final boolean getHasUserSeenInbox() {
        return realmGet$hasUserSeenInbox();
    }

    public final int getNewMessages() {
        return realmGet$newMessages();
    }

    public final boolean getOptOut() {
        return realmGet$optOut();
    }

    @Override // io.realm.r6
    public x0 realmGet$blocks() {
        return this.blocks;
    }

    @Override // io.realm.r6
    public boolean realmGet$hasUserSeenInbox() {
        return this.hasUserSeenInbox;
    }

    @Override // io.realm.r6
    public int realmGet$newMessages() {
        return this.newMessages;
    }

    @Override // io.realm.r6
    public boolean realmGet$optOut() {
        return this.optOut;
    }

    @Override // io.realm.r6
    public void realmSet$blocks(x0 x0Var) {
        this.blocks = x0Var;
    }

    @Override // io.realm.r6
    public void realmSet$hasUserSeenInbox(boolean z10) {
        this.hasUserSeenInbox = z10;
    }

    @Override // io.realm.r6
    public void realmSet$newMessages(int i10) {
        this.newMessages = i10;
    }

    @Override // io.realm.r6
    public void realmSet$optOut(boolean z10) {
        this.optOut = z10;
    }

    public final void setBlocks(x0<String> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$blocks(x0Var);
    }

    public final void setHasUserSeenInbox(boolean z10) {
        realmSet$hasUserSeenInbox(z10);
    }

    public final void setNewMessages(int i10) {
        realmSet$newMessages(i10);
    }

    public final void setOptOut(boolean z10) {
        realmSet$optOut(z10);
    }
}
