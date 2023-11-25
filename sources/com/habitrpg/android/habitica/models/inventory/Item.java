package com.habitrpg.android.habitica.models.inventory;

import io.realm.a1;

/* compiled from: Item.kt */
/* loaded from: classes4.dex */
public interface Item extends a1 {
    ItemEvent getEvent();

    String getKey();

    String getText();

    String getType();

    int getValue();

    void setEvent(ItemEvent itemEvent);
}
