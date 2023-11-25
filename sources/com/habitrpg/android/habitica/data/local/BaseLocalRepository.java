package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import io.realm.o0;
import java.util.List;
import pc.l;

/* compiled from: BaseLocalRepository.kt */
/* loaded from: classes4.dex */
public interface BaseLocalRepository {
    void close();

    <T extends BaseMainObject> void delete(T t10);

    void executeTransaction(l<? super o0, w> lVar);

    <T extends BaseObject> T getLiveObject(T t10);

    User getLiveUser(String str);

    o0 getRealm();

    <T extends BaseObject> T getUnmanagedCopy(T t10);

    <T extends BaseObject> List<T> getUnmanagedCopy(List<? extends T> list);

    boolean isClosed();

    <T extends BaseMainObject> void modify(T t10, l<? super T, w> lVar);

    <T extends BaseObject> void save(T t10);

    <T extends BaseObject> void save(List<? extends T> list);

    void setRealm(o0 o0Var);
}
