package com.habitrpg.common.habitica.models.notifications;

import qc.q;

/* compiled from: NotificationGroup.kt */
/* loaded from: classes4.dex */
public class NotificationGroup {

    /* renamed from: id  reason: collision with root package name */
    private String f12938id = "";
    private String name;

    public final String getId() {
        return this.f12938id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        this.f12938id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }
}
