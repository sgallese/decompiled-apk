package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.data.local.TagLocalRepository;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dd.g;
import io.realm.g1;
import io.realm.o0;
import java.util.List;
import qc.q;

/* compiled from: RealmTagLocalRepository.kt */
/* loaded from: classes4.dex */
public final class RealmTagLocalRepository extends RealmBaseLocalRepository implements TagLocalRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmTagLocalRepository(o0 o0Var) {
        super(o0Var);
        q.i(o0Var, "realm");
    }

    @Override // com.habitrpg.android.habitica.data.local.TagLocalRepository
    public void deleteTag(String str) {
        q.i(str, "tagID");
        executeTransaction(new RealmTagLocalRepository$deleteTag$1(getRealm().k1(Tag.class).n("id", str).p()));
    }

    @Override // com.habitrpg.android.habitica.data.local.TagLocalRepository
    public g<List<Tag>> getTags(String str) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        g1 p10 = getRealm().k1(Tag.class).n(TaskFormActivity.USER_ID_KEY, str).p();
        q.h(p10, "findAll(...)");
        return ac.c.a(p10);
    }
}
