package tc;

import java.util.Random;
import qc.q;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes4.dex */
public final class b extends tc.a {

    /* renamed from: p  reason: collision with root package name */
    private final a f23725p = new a();

    /* compiled from: PlatformRandom.kt */
    /* loaded from: classes4.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // tc.a
    public Random i() {
        Random random = this.f23725p.get();
        q.h(random, "implStorage.get()");
        return random;
    }
}
