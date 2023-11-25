package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.d8;
import io.realm.internal.o;
import io.realm.x0;
import qc.q;

/* compiled from: UserTaskPreferences.kt */
/* loaded from: classes4.dex */
public class UserTaskPreferences extends d1 implements BaseObject, d8 {
    public static final int $stable = 8;
    private boolean confirmScoreNotes;
    private boolean groupByChallenge;
    private x0<String> mirrorGroupTasks;

    public UserTaskPreferences() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$mirrorGroupTasks(new x0());
    }

    public final boolean getConfirmScoreNotes() {
        return realmGet$confirmScoreNotes();
    }

    public final boolean getGroupByChallenge() {
        return realmGet$groupByChallenge();
    }

    public final x0<String> getMirrorGroupTasks() {
        return realmGet$mirrorGroupTasks();
    }

    @Override // io.realm.d8
    public boolean realmGet$confirmScoreNotes() {
        return this.confirmScoreNotes;
    }

    @Override // io.realm.d8
    public boolean realmGet$groupByChallenge() {
        return this.groupByChallenge;
    }

    @Override // io.realm.d8
    public x0 realmGet$mirrorGroupTasks() {
        return this.mirrorGroupTasks;
    }

    @Override // io.realm.d8
    public void realmSet$confirmScoreNotes(boolean z10) {
        this.confirmScoreNotes = z10;
    }

    @Override // io.realm.d8
    public void realmSet$groupByChallenge(boolean z10) {
        this.groupByChallenge = z10;
    }

    @Override // io.realm.d8
    public void realmSet$mirrorGroupTasks(x0 x0Var) {
        this.mirrorGroupTasks = x0Var;
    }

    public final void setConfirmScoreNotes(boolean z10) {
        realmSet$confirmScoreNotes(z10);
    }

    public final void setGroupByChallenge(boolean z10) {
        realmSet$groupByChallenge(z10);
    }

    public final void setMirrorGroupTasks(x0<String> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$mirrorGroupTasks(x0Var);
    }
}
