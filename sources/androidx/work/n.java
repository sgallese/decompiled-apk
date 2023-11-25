package androidx.work;

import android.os.Build;
import androidx.work.w;

/* compiled from: OneTimeWorkRequest.java */
/* loaded from: classes.dex */
public final class n extends w {
    n(a aVar) {
        super(aVar.f7611b, aVar.f7612c, aVar.f7613d);
    }

    public static n d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }

    /* compiled from: OneTimeWorkRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends w.a<a, n> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f7612c.f20195d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.w.a
        /* renamed from: g  reason: merged with bridge method [inline-methods] */
        public n c() {
            if (this.f7610a && Build.VERSION.SDK_INT >= 23 && this.f7612c.f20201j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new n(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.w.a
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
