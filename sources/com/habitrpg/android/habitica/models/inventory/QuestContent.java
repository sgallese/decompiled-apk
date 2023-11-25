package com.habitrpg.android.habitica.models.inventory;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ec.s;
import ec.t;
import io.realm.d1;
import io.realm.h3;
import io.realm.internal.o;
import io.realm.x0;
import java.util.List;
import qc.q;

/* compiled from: QuestContent.kt */
/* loaded from: classes4.dex */
public class QuestContent extends d1 implements Item, h3 {
    public static final int $stable = 8;
    private QuestBoss boss;
    private String category;
    private x0<QuestCollect> collect;
    private QuestColors colors;
    private String completion;
    private QuestDrops drop;
    private ItemEvent event;
    private boolean isCanBuy;
    private String key;
    private int lvl;
    private String notes;
    private String previous;
    private String text;
    private int value;

    public QuestContent() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
        realmSet$text("");
        realmSet$notes("");
        realmSet$completion("");
    }

    public final QuestBoss getBoss() {
        return realmGet$boss();
    }

    public final String getCategory() {
        return realmGet$category();
    }

    public final x0<QuestCollect> getCollect() {
        return realmGet$collect();
    }

    public final QuestCollect getCollectWithKey(String str) {
        List<QuestCollect> realmGet$collect = realmGet$collect();
        if (realmGet$collect == null) {
            realmGet$collect = t.i();
        }
        for (QuestCollect questCollect : realmGet$collect) {
            if (q.d(questCollect.getKey(), str)) {
                return questCollect;
            }
        }
        return null;
    }

    public final QuestColors getColors() {
        return realmGet$colors();
    }

    public final String getCompletion() {
        return realmGet$completion();
    }

    public final QuestDrops getDrop() {
        return realmGet$drop();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public ItemEvent getEvent() {
        return realmGet$event();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getKey() {
        return realmGet$key();
    }

    public final int getLvl() {
        return realmGet$lvl();
    }

    public final String getNotes() {
        return realmGet$notes();
    }

    public final String getPrevious() {
        return realmGet$previous();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getText() {
        return realmGet$text();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getType() {
        return "quests";
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public int getValue() {
        return realmGet$value();
    }

    public final boolean hasGifImage() {
        List d10;
        d10 = s.d("lostMasterclasser4");
        if (d10.contains(getKey())) {
            return true;
        }
        return false;
    }

    public final boolean isBossQuest() {
        if (realmGet$boss() != null) {
            return true;
        }
        return false;
    }

    public final boolean isCanBuy() {
        return realmGet$isCanBuy();
    }

    @Override // io.realm.h3
    public QuestBoss realmGet$boss() {
        return this.boss;
    }

    @Override // io.realm.h3
    public String realmGet$category() {
        return this.category;
    }

    @Override // io.realm.h3
    public x0 realmGet$collect() {
        return this.collect;
    }

    @Override // io.realm.h3
    public QuestColors realmGet$colors() {
        return this.colors;
    }

    @Override // io.realm.h3
    public String realmGet$completion() {
        return this.completion;
    }

    @Override // io.realm.h3
    public QuestDrops realmGet$drop() {
        return this.drop;
    }

    @Override // io.realm.h3
    public ItemEvent realmGet$event() {
        return this.event;
    }

    @Override // io.realm.h3
    public boolean realmGet$isCanBuy() {
        return this.isCanBuy;
    }

    @Override // io.realm.h3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.h3
    public int realmGet$lvl() {
        return this.lvl;
    }

    @Override // io.realm.h3
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.h3
    public String realmGet$previous() {
        return this.previous;
    }

    @Override // io.realm.h3
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.h3
    public int realmGet$value() {
        return this.value;
    }

    @Override // io.realm.h3
    public void realmSet$boss(QuestBoss questBoss) {
        this.boss = questBoss;
    }

    @Override // io.realm.h3
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // io.realm.h3
    public void realmSet$collect(x0 x0Var) {
        this.collect = x0Var;
    }

    @Override // io.realm.h3
    public void realmSet$colors(QuestColors questColors) {
        this.colors = questColors;
    }

    @Override // io.realm.h3
    public void realmSet$completion(String str) {
        this.completion = str;
    }

    @Override // io.realm.h3
    public void realmSet$drop(QuestDrops questDrops) {
        this.drop = questDrops;
    }

    @Override // io.realm.h3
    public void realmSet$event(ItemEvent itemEvent) {
        this.event = itemEvent;
    }

    @Override // io.realm.h3
    public void realmSet$isCanBuy(boolean z10) {
        this.isCanBuy = z10;
    }

    @Override // io.realm.h3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.h3
    public void realmSet$lvl(int i10) {
        this.lvl = i10;
    }

    @Override // io.realm.h3
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.h3
    public void realmSet$previous(String str) {
        this.previous = str;
    }

    @Override // io.realm.h3
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.h3
    public void realmSet$value(int i10) {
        this.value = i10;
    }

    public final void setBoss(QuestBoss questBoss) {
        realmSet$boss(questBoss);
        if (questBoss != null) {
            questBoss.setKey(getKey());
        }
    }

    public final void setCanBuy(boolean z10) {
        realmSet$isCanBuy(z10);
    }

    public final void setCategory(String str) {
        realmSet$category(str);
    }

    public final void setCollect(x0<QuestCollect> x0Var) {
        realmSet$collect(x0Var);
    }

    public final void setColors(QuestColors questColors) {
        realmSet$colors(questColors);
        if (questColors != null) {
            questColors.setKey(getKey());
        }
    }

    public final void setCompletion(String str) {
        q.i(str, "<set-?>");
        realmSet$completion(str);
    }

    public final void setDrop(QuestDrops questDrops) {
        realmSet$drop(questDrops);
        if (questDrops != null) {
            questDrops.setKey(getKey());
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public void setEvent(ItemEvent itemEvent) {
        realmSet$event(itemEvent);
    }

    public void setKey(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        realmSet$key(str);
        QuestDrops realmGet$drop = realmGet$drop();
        if (realmGet$drop != null) {
            realmGet$drop.setKey(str);
        }
        QuestColors realmGet$colors = realmGet$colors();
        if (realmGet$colors != null) {
            realmGet$colors.setKey(str);
        }
        QuestBoss realmGet$boss = realmGet$boss();
        if (realmGet$boss != null) {
            realmGet$boss.setKey(str);
        }
    }

    public final void setLvl(int i10) {
        realmSet$lvl(i10);
    }

    public final void setNotes(String str) {
        q.i(str, "<set-?>");
        realmSet$notes(str);
    }

    public final void setPrevious(String str) {
        realmSet$previous(str);
    }

    public void setText(String str) {
        q.i(str, "<set-?>");
        realmSet$text(str);
    }

    public void setValue(int i10) {
        realmSet$value(i10);
    }
}
