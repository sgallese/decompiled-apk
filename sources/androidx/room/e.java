package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InvalidationLiveDataContainer.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    final Set<LiveData> f6977a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final i f6978b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(i iVar) {
        this.f6978b = iVar;
    }
}
