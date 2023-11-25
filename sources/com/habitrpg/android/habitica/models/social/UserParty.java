package com.habitrpg.android.habitica.models.social;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.inventory.Quest;
import fa.c;
import io.realm.d1;
import io.realm.f5;
import io.realm.internal.o;
import java.util.Date;
import qc.q;

/* compiled from: UserParty.kt */
/* loaded from: classes4.dex */
public class UserParty extends d1 implements BaseObject, f5 {
    public static final int $stable = 8;
    @c("_id")

    /* renamed from: id  reason: collision with root package name */
    private String f12522id;
    private String orderAscending;
    @c("order")
    private String partyOrder;
    private Quest quest;
    private Date seeking;

    public UserParty() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id("");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final String getOrderAscending() {
        return realmGet$orderAscending();
    }

    public final String getPartyOrder() {
        return realmGet$partyOrder();
    }

    public final Quest getQuest() {
        return realmGet$quest();
    }

    public final Date getSeeking() {
        return realmGet$seeking();
    }

    @Override // io.realm.f5
    public String realmGet$id() {
        return this.f12522id;
    }

    @Override // io.realm.f5
    public String realmGet$orderAscending() {
        return this.orderAscending;
    }

    @Override // io.realm.f5
    public String realmGet$partyOrder() {
        return this.partyOrder;
    }

    @Override // io.realm.f5
    public Quest realmGet$quest() {
        return this.quest;
    }

    @Override // io.realm.f5
    public Date realmGet$seeking() {
        return this.seeking;
    }

    @Override // io.realm.f5
    public void realmSet$id(String str) {
        this.f12522id = str;
    }

    @Override // io.realm.f5
    public void realmSet$orderAscending(String str) {
        this.orderAscending = str;
    }

    @Override // io.realm.f5
    public void realmSet$partyOrder(String str) {
        this.partyOrder = str;
    }

    @Override // io.realm.f5
    public void realmSet$quest(Quest quest) {
        this.quest = quest;
    }

    @Override // io.realm.f5
    public void realmSet$seeking(Date date) {
        this.seeking = date;
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        realmSet$id(str);
    }

    public final void setOrderAscending(String str) {
        realmSet$orderAscending(str);
    }

    public final void setPartyOrder(String str) {
        realmSet$partyOrder(str);
    }

    public final void setQuest(Quest quest) {
        realmSet$quest(quest);
    }

    public final void setSeeking(Date date) {
        realmSet$seeking(date);
    }
}
