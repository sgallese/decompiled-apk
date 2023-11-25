package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.t2;
import java.util.Date;

/* compiled from: Item.kt */
/* loaded from: classes4.dex */
public class ItemEvent extends d1 implements BaseObject, t2 {
    public static final int $stable = 8;
    private Date end;
    private Date start;

    public ItemEvent() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final Date getEnd() {
        return realmGet$end();
    }

    public final Date getStart() {
        return realmGet$start();
    }

    @Override // io.realm.t2
    public Date realmGet$end() {
        return this.end;
    }

    @Override // io.realm.t2
    public Date realmGet$start() {
        return this.start;
    }

    @Override // io.realm.t2
    public void realmSet$end(Date date) {
        this.end = date;
    }

    @Override // io.realm.t2
    public void realmSet$start(Date date) {
        this.start = date;
    }

    public final void setEnd(Date date) {
        realmSet$end(date);
    }

    public final void setStart(Date date) {
        realmSet$start(date);
    }
}
