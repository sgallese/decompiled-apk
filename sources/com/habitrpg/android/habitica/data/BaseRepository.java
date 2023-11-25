package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.BaseObject;
import java.util.List;

/* compiled from: BaseRepository.kt */
/* loaded from: classes4.dex */
public interface BaseRepository {
    void close();

    <T extends BaseObject> T getUnmanagedCopy(T t10);

    <T extends BaseObject> List<T> getUnmanagedCopy(List<? extends T> list);

    boolean isClosed();
}
