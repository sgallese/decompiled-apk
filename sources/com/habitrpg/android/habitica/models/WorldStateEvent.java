package com.habitrpg.android.habitica.models;

import fa.c;
import io.realm.a1;
import io.realm.d1;
import io.realm.d2;
import io.realm.internal.o;
import java.util.Date;

/* compiled from: WorldStateEvent.kt */
/* loaded from: classes4.dex */
public class WorldStateEvent extends d1 implements BaseMainObject, d2 {
    public static final int $stable = 8;
    private String aprilFools;
    private Date end;
    @c("event")
    private String eventKey;
    private boolean gear;
    private String npcImageSuffix;
    private String promo;
    private Date start;

    public WorldStateEvent() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getAprilFools() {
        return realmGet$aprilFools();
    }

    public final Date getEnd() {
        return realmGet$end();
    }

    public final String getEventKey() {
        return realmGet$eventKey();
    }

    public final boolean getGear() {
        return realmGet$gear();
    }

    public final String getNpcImageSuffix() {
        return realmGet$npcImageSuffix();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return realmGet$eventKey();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "eventKey";
    }

    public final String getPromo() {
        return realmGet$promo();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<? extends a1> getRealmClass() {
        return WorldStateEvent.class;
    }

    public final Date getStart() {
        return realmGet$start();
    }

    public final boolean isCurrentlyActive() {
        boolean z10;
        boolean z11;
        Date date = new Date();
        Date realmGet$start = realmGet$start();
        if (realmGet$start != null && realmGet$start.before(date)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Date realmGet$end = realmGet$end();
            if (realmGet$end != null && realmGet$end.after(date)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    @Override // io.realm.d2
    public String realmGet$aprilFools() {
        return this.aprilFools;
    }

    @Override // io.realm.d2
    public Date realmGet$end() {
        return this.end;
    }

    @Override // io.realm.d2
    public String realmGet$eventKey() {
        return this.eventKey;
    }

    @Override // io.realm.d2
    public boolean realmGet$gear() {
        return this.gear;
    }

    @Override // io.realm.d2
    public String realmGet$npcImageSuffix() {
        return this.npcImageSuffix;
    }

    @Override // io.realm.d2
    public String realmGet$promo() {
        return this.promo;
    }

    @Override // io.realm.d2
    public Date realmGet$start() {
        return this.start;
    }

    @Override // io.realm.d2
    public void realmSet$aprilFools(String str) {
        this.aprilFools = str;
    }

    @Override // io.realm.d2
    public void realmSet$end(Date date) {
        this.end = date;
    }

    @Override // io.realm.d2
    public void realmSet$eventKey(String str) {
        this.eventKey = str;
    }

    @Override // io.realm.d2
    public void realmSet$gear(boolean z10) {
        this.gear = z10;
    }

    @Override // io.realm.d2
    public void realmSet$npcImageSuffix(String str) {
        this.npcImageSuffix = str;
    }

    @Override // io.realm.d2
    public void realmSet$promo(String str) {
        this.promo = str;
    }

    @Override // io.realm.d2
    public void realmSet$start(Date date) {
        this.start = date;
    }

    public final void setAprilFools(String str) {
        realmSet$aprilFools(str);
    }

    public final void setEnd(Date date) {
        realmSet$end(date);
    }

    public final void setEventKey(String str) {
        realmSet$eventKey(str);
    }

    public final void setGear(boolean z10) {
        realmSet$gear(z10);
    }

    public final void setNpcImageSuffix(String str) {
        realmSet$npcImageSuffix(str);
    }

    public final void setPromo(String str) {
        realmSet$promo(str);
    }

    public final void setStart(Date date) {
        realmSet$start(date);
    }
}
