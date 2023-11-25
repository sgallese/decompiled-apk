package xa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: RetainedLifecycleImpl.java */
/* loaded from: classes4.dex */
public final class e implements sa.a, sa.c {

    /* renamed from: a  reason: collision with root package name */
    private final Set<za.a> f25894a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private boolean f25895b = false;

    public void a() {
        va.b.a();
        this.f25895b = true;
        Iterator<za.a> it = this.f25894a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
