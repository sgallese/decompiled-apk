package com.habitrpg.android.habitica.models.inventory;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.members.Member;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.v3;
import io.realm.x0;
import java.util.ArrayList;
import qc.q;

/* compiled from: Quest.kt */
/* loaded from: classes4.dex */
public class Quest extends d1 implements BaseObject, v3 {
    public static final int $stable = 8;
    private boolean RSVPNeeded;
    private boolean active;
    private String completed;

    /* renamed from: id  reason: collision with root package name */
    private String f12511id;
    private String key;
    private String leader;
    private x0<QuestMember> members;
    private x0<Member> participants;
    private QuestProgress progress;
    private x0<QuestRageStrike> rageStrikes;

    public Quest() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
    }

    public final void addRageStrike(QuestRageStrike questRageStrike) {
        q.i(questRageStrike, "rageStrike");
        if (realmGet$rageStrikes() == null) {
            realmSet$rageStrikes(new x0());
        }
        x0 realmGet$rageStrikes = realmGet$rageStrikes();
        if (realmGet$rageStrikes != null) {
            realmGet$rageStrikes.add(questRageStrike);
        }
    }

    public final boolean getActive() {
        return realmGet$active();
    }

    public final int getActiveRageStrikeNumber() {
        x0 realmGet$rageStrikes = realmGet$rageStrikes();
        if (realmGet$rageStrikes != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : realmGet$rageStrikes) {
                if (((QuestRageStrike) obj).getWasHit()) {
                    arrayList.add(obj);
                }
            }
            return arrayList.size();
        }
        return 0;
    }

    public final String getCompleted() {
        return realmGet$completed();
    }

    public final String getId() {
        return realmGet$id();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final String getLeader() {
        return realmGet$leader();
    }

    public final x0<QuestMember> getMembers() {
        return realmGet$members();
    }

    public final x0<Member> getParticipants() {
        return realmGet$participants();
    }

    public final QuestProgress getProgress() {
        return realmGet$progress();
    }

    public final boolean getRSVPNeeded() {
        return realmGet$RSVPNeeded();
    }

    public final x0<QuestRageStrike> getRageStrikes() {
        return realmGet$rageStrikes();
    }

    public final boolean hasRageStrikes() {
        if (realmGet$rageStrikes() != null) {
            return !r0.isEmpty();
        }
        return false;
    }

    @Override // io.realm.v3
    public boolean realmGet$RSVPNeeded() {
        return this.RSVPNeeded;
    }

    @Override // io.realm.v3
    public boolean realmGet$active() {
        return this.active;
    }

    @Override // io.realm.v3
    public String realmGet$completed() {
        return this.completed;
    }

    @Override // io.realm.v3
    public String realmGet$id() {
        return this.f12511id;
    }

    @Override // io.realm.v3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.v3
    public String realmGet$leader() {
        return this.leader;
    }

    @Override // io.realm.v3
    public x0 realmGet$members() {
        return this.members;
    }

    @Override // io.realm.v3
    public x0 realmGet$participants() {
        return this.participants;
    }

    @Override // io.realm.v3
    public QuestProgress realmGet$progress() {
        return this.progress;
    }

    @Override // io.realm.v3
    public x0 realmGet$rageStrikes() {
        return this.rageStrikes;
    }

    @Override // io.realm.v3
    public void realmSet$RSVPNeeded(boolean z10) {
        this.RSVPNeeded = z10;
    }

    @Override // io.realm.v3
    public void realmSet$active(boolean z10) {
        this.active = z10;
    }

    @Override // io.realm.v3
    public void realmSet$completed(String str) {
        this.completed = str;
    }

    @Override // io.realm.v3
    public void realmSet$id(String str) {
        this.f12511id = str;
    }

    @Override // io.realm.v3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.v3
    public void realmSet$leader(String str) {
        this.leader = str;
    }

    @Override // io.realm.v3
    public void realmSet$members(x0 x0Var) {
        this.members = x0Var;
    }

    @Override // io.realm.v3
    public void realmSet$participants(x0 x0Var) {
        this.participants = x0Var;
    }

    @Override // io.realm.v3
    public void realmSet$progress(QuestProgress questProgress) {
        this.progress = questProgress;
    }

    @Override // io.realm.v3
    public void realmSet$rageStrikes(x0 x0Var) {
        this.rageStrikes = x0Var;
    }

    public final void setActive(boolean z10) {
        realmSet$active(z10);
    }

    public final void setCompleted(String str) {
        realmSet$completed(str);
    }

    public final void setId(String str) {
        realmSet$id(str);
        QuestProgress realmGet$progress = realmGet$progress();
        if (realmGet$progress != null) {
            realmGet$progress.setId(str);
        }
    }

    public final void setKey(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        realmSet$key(str);
        QuestProgress realmGet$progress = realmGet$progress();
        if (realmGet$progress != null) {
            realmGet$progress.setKey(realmGet$key());
        }
    }

    public final void setLeader(String str) {
        realmSet$leader(str);
    }

    public final void setMembers(x0<QuestMember> x0Var) {
        realmSet$members(x0Var);
    }

    public final void setParticipants(x0<Member> x0Var) {
        realmSet$participants(x0Var);
    }

    public final void setProgress(QuestProgress questProgress) {
        realmSet$progress(questProgress);
    }

    public final void setRSVPNeeded(boolean z10) {
        realmSet$RSVPNeeded(z10);
    }

    public final void setRageStrikes(x0<QuestRageStrike> x0Var) {
        realmSet$rageStrikes(x0Var);
    }
}
