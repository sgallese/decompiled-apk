package com.habitrpg.android.habitica.models.social;

import com.habitrpg.android.habitica.models.BaseMainObject;
import fa.c;
import io.realm.a1;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.x4;
import qc.q;

/* compiled from: GroupCategory.kt */
/* loaded from: classes4.dex */
public class GroupCategory extends d1 implements BaseMainObject, x4 {
    public static final int $stable = 8;
    @c("_id")

    /* renamed from: id  reason: collision with root package name */
    private String f12521id;
    private String name;
    private String slug;

    public GroupCategory() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id("");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final String getName() {
        return realmGet$name();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return realmGet$id();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "id";
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<? extends a1> getRealmClass() {
        return Group.class;
    }

    public final String getSlug() {
        return realmGet$slug();
    }

    @Override // io.realm.x4
    public String realmGet$id() {
        return this.f12521id;
    }

    @Override // io.realm.x4
    public String realmGet$name() {
        return this.name;
    }

    @Override // io.realm.x4
    public String realmGet$slug() {
        return this.slug;
    }

    @Override // io.realm.x4
    public void realmSet$id(String str) {
        this.f12521id = str;
    }

    @Override // io.realm.x4
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // io.realm.x4
    public void realmSet$slug(String str) {
        this.slug = str;
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        realmSet$id(str);
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final void setSlug(String str) {
        realmSet$slug(str);
    }
}
