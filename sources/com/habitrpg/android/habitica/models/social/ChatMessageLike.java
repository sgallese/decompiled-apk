package com.habitrpg.android.habitica.models.social;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.t4;
import qc.h;
import qc.q;

/* compiled from: ChatMessageLike.kt */
/* loaded from: classes4.dex */
public class ChatMessageLike extends d1 implements BaseObject, t4 {
    public static final int $stable = 8;

    /* renamed from: id  reason: collision with root package name */
    private String f12518id;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [qc.h, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChatMessageLike() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            boolean r0 = r2 instanceof io.realm.internal.o
            if (r0 == 0) goto Lf
            r0 = r2
            io.realm.internal.o r0 = (io.realm.internal.o) r0
            r0.a()
        Lf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.models.social.ChatMessageLike.<init>():void");
    }

    public final String getId() {
        return realmGet$id();
    }

    @Override // io.realm.t4
    public String realmGet$id() {
        return this.f12518id;
    }

    @Override // io.realm.t4
    public void realmSet$id(String str) {
        this.f12518id = str;
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        realmSet$id(str);
    }

    public ChatMessageLike(String str) {
        q.i(str, "id");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id(str);
    }

    public /* synthetic */ ChatMessageLike(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str);
        if (this instanceof o) {
            ((o) this).a();
        }
    }
}
